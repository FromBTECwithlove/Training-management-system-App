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
public class AddCourseAction extends ActionSupport {

    private String id;
    private String name;
    private String start;
    private String end;
    private String fee;
    private String cont;
    private String location;
    private String topic;
    private String des;
    private String trainer;

    public String execute() throws Exception {
        DataProcess dp = new DataProcess();
        if (dp.addCourse(id, name, start, end, fee, cont, location, topic, des, trainer)) {
            return "success";
        }
        return "fail";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public AddCourseAction() {
    }

}
