/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author minh
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Connect {
    private  static Connection conn=null;
    
    public static Connection getConnect(){
        final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        final String username = "c##user6";
        final String password = "CAMVAN";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, username, password);
            //JOptionPane.showMessageDialog(null,"Ket noi co so du lieu thanh cong ");
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,"Ket noi co so du lieu khong thanh cong ");
        }
        return conn;
    }
}