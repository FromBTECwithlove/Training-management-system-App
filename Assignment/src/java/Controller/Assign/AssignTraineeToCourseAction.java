/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Assign;

import Model.DataProcess;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author luuka
 */
public class AssignTraineeToCourseAction extends ActionSupport {

    private String courseId;
    private String traineeId;

    public AssignTraineeToCourseAction() {
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getTraineeId() {
        return traineeId;
    }

    public void setTraineeId(String traineeId) {
        this.traineeId = traineeId;
    }    

    public String execute() throws Exception {
        DataProcess dp = new DataProcess();
        if (dp.assignTrainee(courseId, traineeId)) {
            return "success";
        }
        return "fail";
    }

}
