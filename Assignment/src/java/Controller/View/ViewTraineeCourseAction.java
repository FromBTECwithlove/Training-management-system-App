/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.View;

import Entity.TraineeCourse;
import Model.UpdateProcess;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;

/**
 *
 * @author luuka
 */
public class ViewTraineeCourseAction extends ActionSupport {

    private ArrayList<TraineeCourse> traineeCourse;
    private String id;

    public ViewTraineeCourseAction() {
    }

    public ArrayList<TraineeCourse> getTraineeCourse() {
        UpdateProcess up = new UpdateProcess();
        traineeCourse = up.getTraineeAssigned(id);
        return traineeCourse;
    }

    public void setTraineeCourse(ArrayList<TraineeCourse> traineeCourse) {
        this.traineeCourse = traineeCourse;
    }

    public String getTraineeId() {
        return id;
    }

    public void setTraineeId(String id) {
        this.id = id;
    }

    public String execute() throws Exception {
        UpdateProcess up = new UpdateProcess();
        traineeCourse = up.getTraineeAssigned(id);
        return "success";
    }

}
