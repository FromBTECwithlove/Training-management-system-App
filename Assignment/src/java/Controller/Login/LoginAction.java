/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Login;

import Entity.Account;
import Entity.Course;
import Model.DataProcess;
import Model.UpdateProcess;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import java.util.Map;

/**
 *
 * @author luuka
 */
public class LoginAction extends ActionSupport {

    private String user;
    private String pass;
    private int role;
    private List<Course> list;

    public LoginAction(String user, String pass, List<Course> list, int role) {
        this.user = user;
        this.pass = pass;
        this.list = list;
        this.role = role;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public List<Course> getList() {
        return list;
    }

    public void setList(List<Course> list) {
        this.list = list;
    }

    public LoginAction() {
    }

    public String execute() throws Exception {
        DataProcess dp = new DataProcess();
        UpdateProcess up = new UpdateProcess();
        Account acc = new Account();
        Map session = ActionContext.getContext().getSession();
        acc.setUser(user);
        acc.setPass(pass);
        String validate = dp.CheckLogin(acc);
        if (validate == "Admin") {
            session.put("Amin", user);
            return "admin";
        } else if (validate == "Trainer") {
            session.put("Trainer", user);
            return "trainer";
        } else {
            return "fail";
        }
    }

}
