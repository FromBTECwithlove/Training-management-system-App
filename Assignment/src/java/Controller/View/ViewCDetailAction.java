/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.View;

import Entity.Course;
import Model.UpdateProcess;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

/**
 *
 * @author luuka
 */
public class ViewCDetailAction extends ActionSupport {
    private List<Course> courseList;
    private String courseId;

    public ViewCDetailAction() {
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String execute() throws Exception {
        UpdateProcess up = new UpdateProcess();
        courseList = up.getAllCourseList(courseId);
        return "success";
    }
    
}
