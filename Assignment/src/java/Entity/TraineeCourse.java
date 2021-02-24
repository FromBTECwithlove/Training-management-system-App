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
public class TraineeCourse {
    
    private String courseId;
    private String traineeId;

    public TraineeCourse() {
    }

    public TraineeCourse(String courseId, String traineeId) {
        this.courseId = courseId;
        this.traineeId = traineeId;
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
   
}
