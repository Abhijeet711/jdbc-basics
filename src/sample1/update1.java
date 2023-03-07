/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sample1;

/**
 *
 * @author Abhi
 */
import java.sql.*;
public class update1 {
     public static void main(String[] args) throws ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            Statement st = conn.createStatement();
            System.out.println("Updating records in employee table");
            String sql = "UPDATE emp SET salary=85000 WHERE emp_id=3;";
            st.executeUpdate(sql);
            System.out.println("Record updated!");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
