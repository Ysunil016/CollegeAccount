/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rec.account;

/**
 *
 * @author sunil016
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class JavaConnect {
Connection Conn;

public static Connection connect(){
    try{
        String username ="root";
        String passw = "root";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/RECAccount", username, passw);
        System.out.println("Connected");
        return conn;
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Not Connected to Database");
        System.out.println("Not Connected");
        
    }
    return null;
    
}
}
