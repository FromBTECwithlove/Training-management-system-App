/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Update;

import Entity.Trainee;
import Model.UpdateProcess;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;

/**
 *
 * @author luuka
 */
public class UpdateTraineeAction extends ActionSupport {

    private String traineeId;
    private String traineeName;
    private String traineeDOB;
    private String traineeEmail;
    private String traineePhone;
    private String traineeAddress;
    private String traineeGender;
    private String traineeDes;
    private Trainee tn;
    private ArrayList<Trainee> trainee;

    public String getTraineeId() {
        return traineeId;
    }

    public void setTraineeId(String traineeId) {
        this.traineeId = traineeId;
    }

    public String getTraineeName() {
        return traineeName;
    }

    public void setTraineeName(String traineeName) {
        this.traineeName = traineeName;
    }

    public String getTraineeDOB() {
        return traineeDOB;
    }

    public void setTraineeDOB(String traineeDOB) {
        this.traineeDOB = traineeDOB;
    }

    public String getTraineeEmail() {
        return traineeEmail;
    }

    public void setTraineeEmail(String traineeEmail) {
        this.traineeEmail = traineeEmail;
    }

    public String getTraineePhone() {
        return traineePhone;
    }

    public void setTraineePhone(String traineePhone) {
        this.traineePhone = traineePhone;
    }

    public String getTraineeAddress() {
        return traineeAddress;
    }

    public void setTraineeAddress(String traineeAddress) {
        this.traineeAddress = traineeAddress;
    }

    public String getTraineeGender() {
        return traineeGender;
    }

    public void setTraineeGender(String traineeGender) {
        this.traineeGender = traineeGender;
    }

    public String getTraineeDes() {
        return traineeDes;
    }

    public void setTraineeDes(String traineeDes) {
        this.traineeDes = traineeDes;
    }

    public Trainee getTn() {
        return tn;
    }

    public void setTn(Trainee tn) {
        this.tn = tn;
    }

    public ArrayList<Trainee> getTrainee() {
        return trainee;
    }

    public void setTrainee(ArrayList<Trainee> trainee) {
        this.trainee = trainee;
    }

    public UpdateTraineeAction() {
    }

    public String execute() throws Exception {
        UpdateProcess up = new UpdateProcess();
        if (up.getTraineeById(traineeId) != null) {
            tn = up.getTraineeById(traineeId);
            return "success";
        }
        return "fail";
    }
    
    public String doUpdate() throws Exception{
        UpdateProcess up = new UpdateProcess();
        if (up.UpdateTrainee(traineeId, traineeName, traineeDOB, traineeEmail, traineePhone, traineeAddress, traineeDes, traineeGender)) {
            return "success";
        }
        return "fail";
    }
}
