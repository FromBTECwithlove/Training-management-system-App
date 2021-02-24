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
public class Topic {
    private String topId;
    private String topName;
    private String topDes;
    private String assigned;
    private String status;

    public Topic(String topId, String topName, String topDes, String assigned, String status) {
        this.topId = topId;
        this.topName = topName;
        this.topDes = topDes;
        this.assigned = assigned;
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

    
    public Topic() {
    }
}
