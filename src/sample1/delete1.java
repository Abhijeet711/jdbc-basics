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
public class delete1 {
    public static void main(String args[]) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            Statement stmt  = conn.createStatement();
            System.out.println("Deleting a record from the employee table");
            String sql = "DELETE FROM emp WHERE emp_id=3;";
            stmt.executeUpdate(sql);
            System.out.println("Record Deleted!");
        }catch(SQLException e){
            e.printStackTrace();
        }
}
    
}
