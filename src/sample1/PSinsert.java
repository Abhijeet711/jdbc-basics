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
public class PSinsert {
    public static void main(String[] args) throws ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            String insertquery = "INSERT INTO emp VALUES(?,?,?)";
            PreparedStatement ps = conn.prepareStatement(insertquery);
            ps.setString(1,"3");
            ps.setString(2,"Audrey");
            ps.setString(3,"88000");
            int i = ps.executeUpdate();
            System.out.println("Number of records inserted: " +i);
            ps.close();
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
