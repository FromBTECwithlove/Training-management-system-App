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
public class DeleteTraineeCourseAction extends ActionSupport {
    
    private String traineeName;

    public String getTraineeName() {
        return traineeName;
    }

    public void setTraineeName(String traineeName) {
        this.traineeName = traineeName;
    }
    
    public DeleteTraineeCourseAction() {
    }
    
    public String execute() throws Exception {
        DeleteProcess dp = new DeleteProcess();
        if (dp.delTraineeCourse(traineeName)) {
            return "success";
        }
        return "fail";
    }
    
}
