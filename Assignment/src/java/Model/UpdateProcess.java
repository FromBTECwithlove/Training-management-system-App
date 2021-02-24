/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Account;
import Entity.Category;
import Entity.Course;
import Entity.Topic;
import Entity.Trainee;
import Entity.TraineeCourse;
import Entity.Trainer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luuka
 */
public class UpdateProcess {

    private Connection conn;
    private PreparedStatement prst;
    private ResultSet rs;
    private Statement st;

    public UpdateProcess() {
        conn = getConnection();
    }

    public Connection getConnection() {
        conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=WEB";
            String user = "sa";
            String pass = "191020";
            try {
                conn = DriverManager.getConnection(url, user, pass);
            } catch (SQLException ex) {
                Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    public Course getById(String courseId) {
        Course c = null;
        String sql = "SELECT * FROM tblCourse WHERE _courId=?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, courseId);
            rs = prst.executeQuery();
            while (rs.next()) {
                c = new Course(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
                prst.executeUpdate();
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }

    public Course getCourseByTrainerId(String trainerId) {
        Course c = null;
        String sql = "Select * from tblCourse where _trainerId = ?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, trainerId);
            rs = prst.executeQuery();
            while (rs.next()) {
                c = new Course(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
                prst.executeUpdate();
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }

    public List<Course> getCourseList() {
        String sql = " SELECT * FROM tblCourse ORDER BY _courId DESC";
        List<Course> list = new ArrayList();
        try {
            prst = conn.prepareStatement(sql);
            rs = prst.executeQuery();
            while (rs.next()) {
                Course c = new Course();
                c.setId(rs.getString(1));
                c.setName(rs.getString(2));
                c.setStart(rs.getString(3));
                c.setEnd(rs.getString(4));
                c.setLocation(rs.getString(7));
                list.add(c);
            }
            prst.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList<Account> getAccount() {
        ArrayList<Account> accounts = new ArrayList<>();
        String sql = "SELECT * FROM tblAccount";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Account ac = new Account();
                ac.setUser(rs.getString(1));
                ac.setPass(rs.getString(2));
                ac.setFullName(rs.getString(3));
                accounts.add(ac);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return accounts;
    }

    public Account getAcById(String user) {
        Account ac = null;
        String sql = "SELECT * FROM tblAccount WHERE _user=?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, user);
            rs = prst.executeQuery();
            while (rs.next()) {
                ac = new Account(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
                prst.executeUpdate();
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ac;
    }

    public Category getCateById(String id) {
        Category cate = null;
        String sql = "SELECT * FROM tblCategory WHERE _cateId=?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, id);
            rs = prst.executeQuery();
            while (rs.next()) {
                cate = new Category(rs.getString(1), rs.getString(2), rs.getString(3));
                prst.executeUpdate();
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cate;
    }

    public Topic getTopById(String id) {
        Topic top = null;
        String sql = "SELECT * FROM tblTopic WHERE _topId=?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, id);
            rs = prst.executeQuery();
            while (rs.next()) {
                top = new Topic(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                prst.executeUpdate();
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return top;
    }

    public ArrayList<Topic> getTopic() {
        ArrayList<Topic> topic = new ArrayList<>();
        String sql = "SELECT * FROM tblTopic";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Topic t = new Topic();
                t.setTopId(rs.getString(1));
                t.setTopName(rs.getString(2));
                t.setTopDes(rs.getString(3));
                t.setAssigned(rs.getString(4));
                t.setStatus(rs.getString(5));
                topic.add(t);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return topic;
    }

    public ArrayList<Category> getCategory() {
        ArrayList<Category> cate = new ArrayList<>();
        String sql = "SELECT * FROM tblCategory";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Category c = new Category();
                c.setCateId(rs.getString(1));
                c.setCateName(rs.getString(2));
                c.setCateDes(rs.getString(3));
                cate.add(c);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cate;
    }

    public ArrayList<Category> getCategory2(String id) {
        ArrayList<Category> cate2 = new ArrayList<>();
        String sql = "SELECT * FROM tblCategory WHERE _cateId=?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, id);
            rs = prst.executeQuery();
            while (rs.next()) {
                Category c = new Category();
                c.setCateId(rs.getString(1));
                c.setCateName(rs.getString(2));
                c.setCateDes(rs.getString(3));
                cate2.add(c);
                prst.executeUpdate();
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cate2;
    }

    public List<Course> getAllCourseList(String courseId) {
        String sql = "SELECT tblCourse._courId, tblCourse._courName, tblCourse._courStart, tblCourse._courEnd, tblCourse._courFee, tblCourse._courCont, tblCourse._location, tblTopic._topName, tblCourse._courDes, tblTrainer._trainerName FROM ((tblCourse INNER JOIN tblTrainer ON tblCourse._trainerId= tblTrainer._trainerId) INNER JOIN tblTopic ON tblCourse._topId = tblTopic._topId) WHERE tblCourse._courId=?";
        Course c = null;
        List<Course> courseList = new ArrayList();
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, courseId);
            rs = prst.executeQuery();
            while (rs.next()) {
                c = new Course();
                c.setId(rs.getString(1));
                c.setName(rs.getString(2));
                c.setStart(rs.getString(3));
                c.setEnd(rs.getString(4));
                c.setFee(rs.getString(5));
                c.setCont(rs.getString(6));
                c.setLocation(rs.getString(7));
                c.setTopic(rs.getString(8));
                c.setDes(rs.getString(9));
                c.setTrainer(rs.getString(10));
                courseList.add(c);
                prst.executeUpdate();
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return courseList;
    }

    public ArrayList<Trainer> getAllTrainer(String trainerId) {
        Trainer tn = null;
        String sql = "SELECT * FROM tblTrainer WHERE _trainerId=?";
        ArrayList<Trainer> trainer = new ArrayList<>();
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, trainerId);
            rs = prst.executeQuery();
            while (rs.next()) {
                tn = new Trainer();
                tn.setTrainerId(rs.getString(1));
                tn.setTrainerName(rs.getString(2));
                tn.setTrainerDOB(rs.getString(3));
                tn.setTrainerGender(rs.getString(4));
                tn.setTrainerPhone(rs.getString(5));
                tn.setTrainerEmail(rs.getString(6));
                tn.setTrainerDes(rs.getString(7));
                tn.setTrainerDes(rs.getString(8));
                trainer.add(tn);
                prst.executeUpdate();
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return trainer;
    }

    public ArrayList<Trainer> getTrainer() {
        String sql = "SELECT * FROM tblTrainer";
        ArrayList<Trainer> trainer = new ArrayList();
        try {
            prst = conn.prepareStatement(sql);
            rs = prst.executeQuery();
            while (rs.next()) {
                Trainer tn = new Trainer();
                tn.setTrainerId(rs.getString(1));
                tn.setTrainerName(rs.getString(2));
                tn.setTrainerGender(rs.getString(4));
                tn.setTrainerEmail(rs.getString(6));
                trainer.add(tn);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return trainer;
    }

    public Trainer getTrainerById(String trainerId) {
        Trainer tn = null;
        String sql = "SELECT * FROM tblTrainer WHERE _trainerId=?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, trainerId);
            rs = prst.executeQuery();
            while (rs.next()) {
                tn = new Trainer(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
                prst.executeUpdate();
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tn;
    }

    public Trainee getTraineeById(String traineeId) {
        Trainee tn = null;
        String sql = "SELECT * FROM tblTrainee WHERE _traineeId=?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, traineeId);
            rs = prst.executeQuery();
            while (rs.next()) {
                tn = new Trainee(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
                prst.executeUpdate();
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tn;
    }

    public ArrayList<Trainee> getTrainee() {
        String sql = "SELECT * FROM tblTrainee";
        ArrayList<Trainee> trainee = new ArrayList();
        try {
            prst = conn.prepareStatement(sql);
            rs = prst.executeQuery();
            while (rs.next()) {
                Trainee tn = new Trainee();
                tn.setTraineeId(rs.getString(1));
                tn.setTraineeName(rs.getString(2));
                tn.setTraineePhone(rs.getString(5));
                tn.setTraineeEmail(rs.getString(6));
                trainee.add(tn);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return trainee;
    }

    public ArrayList<TraineeCourse> getTraineeCourse() {
        String sql = "SELECT * FROM TraineeCourse";
        ArrayList<TraineeCourse> traineeCourse = new ArrayList<>();
        try {
            prst = conn.prepareStatement(sql);
            rs = prst.executeQuery();
            while (rs.next()) {
                TraineeCourse tc = new TraineeCourse();
                tc.setCourseId(rs.getString(1));
                tc.setTraineeId(rs.getString(2));
                traineeCourse.add(tc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return traineeCourse;
    }

    public ArrayList<Trainee> getAllTrainee(String traineeId) {
        Trainee tn = null;
        String sql = "SELECT * FROM tblTrainee WHERE _traineeId=?";
        ArrayList<Trainee> trainee = new ArrayList<>();
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, traineeId);
            rs = prst.executeQuery();
            while (rs.next()) {
                tn = new Trainee();
                tn.setTraineeId(rs.getString(1));
                tn.setTraineeName(rs.getString(2));
                tn.setTraineeDOB(rs.getString(3));
                tn.setTraineeGender(rs.getString(4));
                tn.setTraineePhone(rs.getString(5));
                tn.setTraineeEmail(rs.getString(6));
                tn.setTraineeDes(rs.getString(7));
                tn.setTraineeDes(rs.getString(8));
                trainee.add(tn);
                prst.executeUpdate();
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return trainee;
    }

    public ArrayList<TraineeCourse> getTraineeAssigned(String id) {
        ArrayList<TraineeCourse> traineeCourse = new ArrayList<>();
        String sql = "SELECT tblTrainee._traineeName FROM TraineeCourse INNER JOIN tblTrainee ON TraineeCourse._traineeId = tblTrainee._TraineeId WHERE TraineeCourse._courId=?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, id);
            rs = prst.executeQuery();
            while (rs.next()) {
                TraineeCourse TC = new TraineeCourse();
                TC.setTraineeId(rs.getString(2));
                traineeCourse.add(TC);
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return traineeCourse;
    }
    
    public static void main(String[] args) {
        UpdateProcess up = new UpdateProcess();
        System.out.println(up.getTraineeAssigned("C02"));
    }
    
    public boolean UpdateTrainee(String traineeId, String traineeName, String traineeDOB, String traineeEmail, String traineePhone, String traineeAddress, String traineeDes, String traineeGender) {
        int result = 0;
        String sql = "UPDATE tblTrainee SET _traineeName=?, _traineeDOB=?, _traineeGender=?, _traineePhone=?, _traineeEmail=?, _traineeAddress=?, _traineeDes=? WHERE _traineeId=?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, traineeName);
            prst.setString(2, traineeDOB);
            prst.setString(3, traineeGender);
            prst.setString(4, traineePhone);
            prst.setString(5, traineeEmail);
            prst.setString(6, traineeAddress);
            prst.setString(7, traineeDes);
            prst.setString(8, traineeId);
            result = prst.executeUpdate();
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }

    public boolean updateCate(String cateId, String cateName, String cateDes) {
        int result = 0;
        String sql = "UPDATE tblCategory SET _cateName=?, _cateDes=? WHERE _cateId=?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, cateName);
            prst.setString(2, cateDes);
            prst.setString(3, cateId);
            result = prst.executeUpdate();
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }

    public boolean updateTopic(String topId, String topName, String topDes, String assigned, String status) {
        int result = 0;
        String sql = "UPDATE tblTopic SET _topName=?, _topDes=?, _date=?, _status=? WHERE _topId=?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, topName);
            prst.setString(2, topDes);
            prst.setString(3, assigned);
            prst.setString(4, status);
            prst.setString(5, topId);
            result = prst.executeUpdate();
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }

    public boolean editCourse(String id, String name, String des, String end, String start, String fee, String cont, String location, String topic, String trainer) {
        int result = 0;
        String sql = "UPDATE tblCourse  SET _courName=?, _courStart=?, _courEnd=?, _courFee=?, _courCont=?, _location=?, _topId=?, _courDes=?, _trainerId=? WHERE _courId=?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, name);
            prst.setString(2, start);
            prst.setString(3, end);
            prst.setString(4, fee);
            prst.setString(5, cont);
            prst.setString(6, location);
            prst.setString(7, topic);
            prst.setString(8, des);
            prst.setString(9, trainer);
            prst.setString(10, id);
            result = prst.executeUpdate();
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }

    public boolean updateAccount(String user, String pass, String fullName) {
        int result = 0;
        String sql = "UPDATE tblAccount SET _pass=?, _fullName=? WHERE _user=?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, pass);
            prst.setString(2, fullName);
            prst.setString(3, user);
            result = prst.executeUpdate();
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }

    public boolean updateTrainer(String trainerId, String trainerName, String trainerDOB, String trainerEmail, String trainerPhone, String trainerAddress, String trainerDes, String trainerGender) {
        int result = 0;
        String sql = "UPDATE tblTrainer SET _trainerName=?, _trainerDOB=?, _trainerGender=?, _trainerPhone=?, _trainerEmail=?, _trainerAddress=?,_trainerDes=? WHERE _trainerId=?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, trainerName);
            prst.setString(2, trainerDOB);
            prst.setString(3, trainerGender);
            prst.setString(4, trainerPhone);
            prst.setString(5, trainerEmail);
            prst.setString(6, trainerAddress);
            prst.setString(7, trainerDes);
            prst.setString(8, trainerId);
            result = prst.executeUpdate();
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }

}
