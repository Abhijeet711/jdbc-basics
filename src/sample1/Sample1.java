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
public class Sample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM emp");
		while(rs.next()){
                    //System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
                    System.out.println(rs.getInt("emp_id")+" "+rs.getString("emp_name")+" "+rs.getString("salary"));
                    //System.out.println(+" ");
                    //System.out.println();
		}//while
		stmt.close();
		conn.close();
        }catch(Exception e){
        System.out.print(e.toString());
        }

    }
    
}
