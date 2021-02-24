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
public class ViewTrainerAction extends ActionSupport {

    private String trainerId;
    private String trainerName;
    private String trainerDOB;
    private String trainerEmail;
    private String trainerPhone;
    private String trainerAddress;
    private String trainerGender;
    private String trainerDes;
    private ArrayList<Trainer> trainer;

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

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getTrainerDOB() {
        return trainerDOB;
    }

    public void setTrainerDOB(String trainerDOB) {
        this.trainerDOB = trainerDOB;
    }

    public String getTrainerEmail() {
        return trainerEmail;
    }

    public void setTrainerEmail(String trainerEmail) {
        this.trainerEmail = trainerEmail;
    }

    public String getTrainerPhone() {
        return trainerPhone;
    }

    public void setTrainerPhone(String trainerPhone) {
        this.trainerPhone = trainerPhone;
    }

    public String getTrainerAddress() {
        return trainerAddress;
    }

    public void setTrainerAddress(String trainerAddress) {
        this.trainerAddress = trainerAddress;
    }

    public String getTrainerGender() {
        return trainerGender;
    }

    public void setTrainerGender(String trainerGender) {
        this.trainerGender = trainerGender;
    }

    public String getTrainerDes() {
        return trainerDes;
    }

    public void setTrainerDes(String trainerDes) {
        this.trainerDes = trainerDes;
    }

    public ViewTrainerAction() {
    }

    public String execute() throws Exception {
        UpdateProcess up = new UpdateProcess();
        trainer = up.getTrainer();
        return "success";
    }
    

}
