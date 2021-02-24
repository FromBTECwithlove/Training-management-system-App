/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.View;

import Entity.Topic;
import Model.UpdateProcess;
import java.util.ArrayList;

/**
 *
 * @author luuka
 */
public class ViewTopicAction {
    private ArrayList<Topic> topic;
    public ViewTopicAction() {
    }
    
    public String execute() throws Exception {
        UpdateProcess up = new UpdateProcess();
        topic = up.getTopic();
        return "success";
    }

    public ViewTopicAction(ArrayList<Topic> topic) {
        this.topic = topic;
    }    
    
    public ArrayList<Topic> getTopic() {
        return topic;
    }

    public void setTopic(ArrayList<Topic> topic) {
        this.topic = topic;
    }
}
