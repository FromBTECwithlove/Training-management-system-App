/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Course;
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
public class SearchProcess {

    private Connection conn;
    private PreparedStatement prst;
    private ResultSet rs;
    private Statement st;

    public SearchProcess() {
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

    public List<Course> getSearchList(String searchValue) {
        List<Course> listCourse = new ArrayList<>();
        String sql = "SELECT * FROM tblCourse WHERE _courName LIKE ? ";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, "%" + searchValue + "%");
            rs = prst.executeQuery();
            while (rs.next()) {
                Course c = new Course();
                c.setId(rs.getString(1));
                c.setName(rs.getString(2));
                c.setStart(rs.getString(3));
                c.setEnd(rs.getString(4));
                c.setLocation(rs.getString(7));
                listCourse.add(c);
            }
            rs.close();
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listCourse;
    }
    public static void main(String[] args) {
        SearchProcess sp = new SearchProcess();
        System.out.println(sp.getSearchList("%k%"));
    }
}
