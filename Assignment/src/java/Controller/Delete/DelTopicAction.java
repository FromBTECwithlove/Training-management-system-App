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
public class DelTopicAction extends ActionSupport {
    private String topId;

    public DelTopicAction(String topId) {
        this.topId = topId;
    }

    public String getTopId() {
        return topId;
    }

    public void setTopId(String topId) {
        this.topId = topId;
    }
    
    
    public DelTopicAction() {
    }
    
    public String execute() throws Exception {
        DeleteProcess dp = new DeleteProcess();
        if (dp.delTopic(topId)) {
            return "success";
        }
        return "fail";
    }
    
}
