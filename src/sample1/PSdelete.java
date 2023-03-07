/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sample1;
import java.sql.*;
/**
 *
 * @author Abhi
 */
public class PSdelete {
    public static void main(String[] args) throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            String sql = "DELETE FROM emp WHERE emp_id = (?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "3");
            ps.executeUpdate();
            System.out.println("Record deleted successfully");
            ps.close();
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
    }
    }
}