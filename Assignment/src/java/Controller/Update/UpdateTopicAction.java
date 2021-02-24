/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Update;

import Entity.Topic;
import Model.UpdateProcess;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;

/**
 *
 * @author luuka
 */
public class UpdateTopicAction extends ActionSupport {

    private String topId;
    private String topName;
    private String topDes;
    private String assigned;
    private String status;
    private Topic t;
    private ArrayList<Topic> topic;

    public String execute() throws Exception {
        UpdateProcess up = new UpdateProcess();
        if (up.getTopById(topId) != null) {
            t = up.getTopById(topId);
            return "success";
        }
        return "fail";
    }

    public String doUpdate() throws Exception {
        UpdateProcess up = new UpdateProcess();
        if (up.updateTopic(topId, topName, topDes, assigned, status)) {
            topic = up.getTopic();
            return "success";
        }
        return "fail";
    }

    public String getAssigned() {
        return assigned;
    }

    public void setAssigned(String assigned) {
        this.assigned = assigned;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getTopId() {
        return topId;
    }

    public void setTopId(String topId) {
        this.topId = topId;
    }

    public String getTopName() {
        return topName;
    }

    public void setTopName(String topName) {
        this.topName = topName;
    }

    public String getTopDes() {
        return topDes;
    }

    public void setTopDes(String topDes) {
        this.topDes = topDes;
    }

    public Topic getT() {
        return t;
    }

    public void setT(Topic t) {
        this.t = t;
    }

    public ArrayList<Topic> getTopic() {
        return topic;
    }

    public void setTopic(ArrayList<Topic> topic) {
        this.topic = topic;
    }
    
}
