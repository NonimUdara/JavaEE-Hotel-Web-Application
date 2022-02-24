/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.*;
public class dbCon2 {
    
    public Connection createConnection() throws ClassNotFoundException, SQLException
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelwebdata","root","");
                return con;
                
            }
         
                public  boolean checkUser(String uname,String pass) 
                {
                  boolean st =false;
                  try {

                      
                      PreparedStatement ps = createConnection().prepareStatement("select * from admin where userName=? and password=?");
                      ps.setString(1, uname);
                      ps.setString(2, pass);
                      ResultSet rs =ps.executeQuery();
                      st = rs.next();

                  }
                    catch(Exception e) {
                        e.printStackTrace();
                    }
        
                     return st;    
    
               }
                
    
}
