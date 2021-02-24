/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.Delete;

import Model.DeleteProcess;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author luuka
 */
public class DeleteAccountAction extends ActionSupport {
    private String user;
    
    public DeleteAccountAction() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public DeleteAccountAction(String user) {
        this.user = user;
    }
    
    public String execute() throws Exception {
        DeleteProcess dp = new DeleteProcess();
        if (dp.delAccount(user)) {
            return "success";
        }
        return "fail";
    }
    
}
