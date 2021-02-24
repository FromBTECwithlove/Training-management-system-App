/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.View;

import Entity.Account;
import Model.UpdateProcess;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;

/**
 *
 * @author luuka
 */
public class ViewAccountAction extends ActionSupport {
    private String user;
    private String pass;
    private String fullName;
    private ArrayList<Account> accounts;

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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
    
    public ViewAccountAction() {
    }
    
    public String execute() throws Exception {
        UpdateProcess up = new UpdateProcess();
        accounts = up.getAccount();
        return "success";
    }
    
}
