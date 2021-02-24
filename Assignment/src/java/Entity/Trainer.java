/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author luuka
 */
public class Trainer {

    private String trainerId;
    private String trainerName;
    private String trainerDOB;
    private String trainerEmail;
    private String trainerPhone;
    private String trainerAddress;
    private String trainerGender;
    private String trainerDes;

    public Trainer() {
    }

    public Trainer(String trainerId, String trainerName, String trainerDOB, String trainerEmail, String trainerPhone, String trainerAddress, String trainerGender, String trainerDes) {
        this.trainerId = trainerId;
        this.trainerName = trainerName;
        this.trainerDOB = trainerDOB;
        this.trainerEmail = trainerEmail;
        this.trainerPhone = trainerPhone;
        this.trainerAddress = trainerAddress;
        this.trainerGender = trainerGender;
        this.trainerDes = trainerDes;
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

}
