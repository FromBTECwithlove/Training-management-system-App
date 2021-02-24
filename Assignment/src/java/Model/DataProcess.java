/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Account;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luuka
 */
public class DataProcess {

    private Connection conn;
    private PreparedStatement prst;
    private ResultSet rs;
    private Statement st;

    public DataProcess() {
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

    public String CheckLogin(Account acc) {
        String user = acc.getUser();
        String pass = acc.getPass();
        String userDB = null;
        String userPass = null;
        int roleDB;
        String sql = "SELECT _user, _pass, _role FROM tblAccount";
        try {
            prst = conn.prepareStatement(sql);
            rs = prst.executeQuery();
            while (rs.next()) {
                userDB = rs.getString("_user");
                userPass = rs.getString("_pass");
                roleDB = rs.getInt("_role");
                if (user.equals(userDB) && pass.equals(userPass) && roleDB == 1) {
                    return "Admin";
                } else if (user.equals(userDB) && pass.equals(userPass) && roleDB == 2) {
                    return "Trainer";
                }
            }
            rs.close();
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "F";
    }

    public static void main(String[] args) {
        DataProcess dp = new DataProcess();
        Account acc = new Account();
        acc.setUser("Tinhtv1910");
        acc.setPass("191020");
        System.out.println(dp.CheckLogin(acc));
    }

    public ArrayList<Account> getAcData() {
        ArrayList<Account> accounts = new ArrayList<>();
        String sql = "SELECT * FROM tblAccount";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Account ac = new Account();
                ac.setUser(rs.getString(1));
                ac.setPass(rs.getString(2));
                accounts.add(ac);
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return accounts;
    }

    public boolean addCourse(String id, String name, String start, String end,
            String fee, String cont, String location, String topic, String des, String trainer) {
        int result = 0;
        String sql = "INSERT INTO tblCourse VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, id);
            prst.setString(2, name);
            prst.setString(3, start);
            prst.setString(4, end);
            prst.setString(5, fee);
            prst.setString(6, cont);
            prst.setString(7, location);
            prst.setString(8, topic);
            prst.setString(9, des);
            prst.setString(10, trainer);
            result = prst.executeUpdate();
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }

    public boolean addAccount(String user, String pass, String fullName) {
        int result = 0;
        String sql = "INSERT INTO tblAccount VALUES(?,?,?)";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, user);
            prst.setString(2, pass);
            prst.setString(3, fullName);
            result = prst.executeUpdate();
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }

    public boolean addTopic(String topId, String topName, String topDes, String assigned, String status) {
        int result = 0;
        String sql = "INSERT INTO tblTopic VALUES(?,?,?,?,?)";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, topId);
            prst.setString(2, topName);
            prst.setString(3, topDes);
            prst.setString(4, assigned);
            prst.setString(5, status);
            result = prst.executeUpdate();
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }

    public boolean addCate(String cateId, String cateName, String cateDes) {
        int result = 0;
        String sql = "INSERT INTO tblCategory VALUES(?,?,?)";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, cateId);
            prst.setString(2, cateName);
            prst.setString(3, cateDes);
            result = prst.executeUpdate();
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }

    public boolean addTrainer(String trainerId, String trainerName, String trainerDOB, String trainerEmail, String trainerPhone, String trainerAddress, String trainerDes, String trainerGender) {
        int result = 0;
        String sql = "INSERT INTO tblTrainer VALUES(?,?,?,?,?,?,?,?)";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, trainerId);
            prst.setString(2, trainerName);
            prst.setString(3, trainerDOB);
            prst.setString(4, trainerGender);
            prst.setString(5, trainerPhone);
            prst.setString(6, trainerEmail);
            prst.setString(7, trainerAddress);
            prst.setString(8, trainerDes);
            result = prst.executeUpdate();
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }

    public boolean addTrainee(String traineeId, String traineeName, String traineeDOB, String traineeEmail, String traineePhone, String traineeAddress, String traineeDes, String traineeGender) {
        int result = 0;
        String sql = "INSERT INTO tblTrainee VALUES(?,?,?,?,?,?,?,?)";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, traineeId);
            prst.setString(2, traineeName);
            prst.setString(3, traineeDOB);
            prst.setString(4, traineeGender);
            prst.setString(5, traineePhone);
            prst.setString(6, traineeEmail);
            prst.setString(7, traineeAddress);
            prst.setString(8, traineeDes);
            result = prst.executeUpdate();
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }

    public boolean assignTrainee(String courseId, String traineeId) {
        int result = 0;
        String sql = "INSERT INTO TraineeCourse VALUES(?,?)";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, courseId);
            prst.setString(2, traineeId);
            result = prst.executeUpdate();
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }

}
