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
public class DeleteTrainerAction extends ActionSupport {
    
    private String trainerId;

    public String getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(String trainerId) {
        this.trainerId = trainerId;
    }
    
    public DeleteTrainerAction() {
    }
    
    public String execute() throws Exception {
        DeleteProcess dp = new DeleteProcess();
        if (dp.delTrainer(trainerId)) {
            return "success";
        }
        return "fail";
    }
    
}
