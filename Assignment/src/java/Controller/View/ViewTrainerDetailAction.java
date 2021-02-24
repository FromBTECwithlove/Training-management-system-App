/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.View;

import Entity.Trainer;
import Model.UpdateProcess;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;

/**
 *
 * @author luuka
 */
public class ViewTrainerDetailAction extends ActionSupport {
    private ArrayList<Trainer> trainer;
    private String trainerId;

    public ArrayList<Trainer> getTrainer() {
        return trainer;
    }

    public void setTrainer(ArrayList<Trainer> trainer) {
        this.trainer = trainer;
    }

    public String getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(String trainerId) {
        this.trainerId = trainerId;
    }
    
    public ViewTrainerDetailAction() {
    }
    
    public String execute() throws Exception {
        UpdateProcess up = new UpdateProcess();
        trainer = up.getAllTrainer(trainerId);
        return "success";
    }
    
}
