package Controller.Add;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Entity.Topic;
import Model.DataProcess;
import Model.UpdateProcess;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;

/**
 *
 * @author luuka
 */
public class AddTopicAction extends ActionSupport {

    private String topId;
    private String topName;
    private String topDes;
    private String assigned;
    private String status;
    private ArrayList<Topic> topic;

    public String execute() throws Exception {
        DataProcess dp = new DataProcess();
        UpdateProcess up = new UpdateProcess();
        if (dp.addTopic(topId, topName, topDes, assigned, status)) {
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

    
    public ArrayList<Topic> getTopic() {
        return topic;
    }

    public void setTopic(ArrayList<Topic> topic) {
        this.topic = topic;
    }

    public AddTopicAction(String topId, String topName, String topDes, String assigned, String status, ArrayList<Topic> topic) {
        this.topId = topId;
        this.topName = topName;
        this.topDes = topDes;
        this.assigned = assigned;
        this.status = status;
        this.topic = topic;
    }

    public AddTopicAction() {
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
   
}
