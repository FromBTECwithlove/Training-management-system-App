/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.Add;

import Model.DataProcess;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author luuka
 */
public class AddTraineeAction extends ActionSupport {
    
    private String traineeId;
    private String traineeName;
    private String traineeDOB;
    private String traineeEmail;
    private String traineePhone;
    private String traineeAddress;
    private String traineeGender;
    private String traineeDes;

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
    
    public AddTraineeAction() {
    }
    
    public String execute() throws Exception {
        DataProcess dp = new DataProcess();
        if (dp.addTrainee(traineeId, traineeName, traineeDOB, traineeEmail, traineePhone, traineeAddress, traineeDes, traineeGender)) {
            return "success";
        }
        return "fail";
    }
    
}
