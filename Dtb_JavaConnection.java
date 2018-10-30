/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.managemment.system;

/**
 *
 * @author Harry
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class Dtb_JavaConnection {
    Connection con;public static Connection ConnectDb(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/dorianproject","root","");
                    String sql="Select * from loginform where username =? and password=?";
                            return con;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    }
}
