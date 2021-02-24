/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.View;

import Entity.Trainee;
import Model.UpdateProcess;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;

/**
 *
 * @author luuka
 */
public class ViewTraineeDetailAction extends ActionSupport {
    
    private String traineeId;
    private ArrayList<Trainee> trainee;

    public String getTraineeId() {
        return traineeId;
    }

    public void setTraineeId(String traineeId) {
        this.traineeId = traineeId;
    }

    public ArrayList<Trainee> getTrainee() {
        return trainee;
    }

    public void setTrainee(ArrayList<Trainee> trainee) {
        this.trainee = trainee;
    }
    
    public ViewTraineeDetailAction() {
    }
    
    public String execute() throws Exception {
        UpdateProcess up = new UpdateProcess();
        trainee = up.getAllTrainee(traineeId);
        return "success";
    }    
}
