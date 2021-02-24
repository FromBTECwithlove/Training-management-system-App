/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.View;

import Entity.Account;
import Model.DataProcess;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;

/**
 *
 * @author luuka
 */
public class ViewAction extends ActionSupport {

    private String user;
    private String pass;
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

    public ArrayList<Account> getAccounts() {
        DataProcess dp = new DataProcess();
        accounts = dp.getAcData();
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public ViewAction() {
    }

    private final String s = "Success";

    public String execute() throws Exception {
        DataProcess dp = new DataProcess();
        accounts = dp.getAcData();
        return s;
    }

}
