/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luuka
 */
public class DeleteProcess {

    private Connection conn;
    private PreparedStatement prst;
    private ResultSet rs;
    private Statement st;

    public DeleteProcess() {
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

    public boolean delCategory(String id) {
        int result = 0;
        String sql = "DELETE tblCategory WHERE _cateId=?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, id);
            result = prst.executeUpdate();
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }

    public boolean delTopic(String id) {
        int result = 0;
        String sql = "DELETE tblTopic WHERE _topId=?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, id);
            result = prst.executeUpdate();
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }

    public boolean delCourse(String id) {
        int result = 0;
        String sql = "DELETE tblCourse WHERE _courId=?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, id);
            result = prst.executeUpdate();
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }
    public static void main(String[] args) {
        DeleteProcess dp = new DeleteProcess();
        System.out.println(dp.delCourse("C10"));
    }

    public boolean delAccount(String id) {
        int result = 0;
        String sql = "DELETE tblAccount WHERE _user=?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, id);
            result = prst.executeUpdate();
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }

    public boolean delTrainer(String trainerId) {
        int result = 0;
        String sql = "DELETE tblTrainer WHERE _trainerId=?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, trainerId);
            result = prst.executeUpdate();
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }

    public boolean delTrainee(String traineeId) {
        int result = 0;
        String sql = "DELETE tblTrainee WHERE _traineeId=?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, traineeId);
            result = prst.executeUpdate();
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }

    public boolean delTraineeCourse(String traineeName) {
        int result = 0;
        String sql = "DELETE TraineeCourse WHERE _traineeName=?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, traineeName);
            result = prst.executeUpdate();
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }
}
