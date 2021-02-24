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
public class DeleteCourseAction extends ActionSupport {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public DeleteCourseAction() {
    }

    public String execute() throws Exception {
        DeleteProcess del = new DeleteProcess();
        if (del.delCourse(id)) {
            return "success";
        }
        return "fail";
    }

}
