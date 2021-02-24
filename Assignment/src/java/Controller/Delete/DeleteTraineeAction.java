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
public class DeleteTraineeAction extends ActionSupport {
    
    private String traineeId;

    public String getTraineeId() {
        return traineeId;
    }

    public void setTraineeId(String traineeId) {
        this.traineeId = traineeId;
    }
    
    public DeleteTraineeAction() {
    }
    
    public String execute() throws Exception {
        DeleteProcess dp = new DeleteProcess();
        if (dp.delTrainee(traineeId)) {
            return "success";
        }
        return "fail";
    }
    
}
