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
public class CSdemo {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            CallableStatement cs = conn.prepareCall("{call empDisplay(?,?)}");
            cs.setInt(1, 2);
            cs.registerOutParameter(2,Types.VARCHAR);
            cs.execute();
            System.out.println(cs.getString(2));
            cs.close();
            conn.close();
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
