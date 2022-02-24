/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Controller.SendMail2;
import static java.lang.System.out;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class dbCon 
     {
    
    
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

                      
                      PreparedStatement ps = createConnection().prepareStatement("select * from signup where Username=? and Password=?");
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
                
                
             public  boolean regUser(String uname, String fname, String lname, String nic, String address, String gender, String phone, String email, String nationality, String pass, String cpass) throws ClassNotFoundException, SQLException 
                { 
                    PreparedStatement ps = createConnection().prepareStatement("insert into signup values(?,?,?,?,?,?,?,?,?,?,?)");
                    ps.setString(1, uname);
                    ps.setString(2, fname);
                    ps.setString(3, lname);
                    ps.setString(4, nic);
                    ps.setString(5, address);
                    ps.setString(6, gender);
                    ps.setString(7, phone);
                    ps.setString(8, email);
                    ps.setString(9, nationality);
                    ps.setString(10, pass);
                    ps.setString(11, cpass);
                    
                    int i = ps.executeUpdate();

                    if(i > 0) 
                        return true;
                      else
                        return false;
                    
                }

            public boolean updateUser(String userName, String firstName, String lastName, String NICNumber, String Address, String Gender, String Phone, String Email, String Nationality, String Password) {
        
                try {
                    
                    PreparedStatement ps = createConnection().prepareStatement("update signup set firstName=?,lastName=?,NICNumber=?,Address=?,Gender=?,Phone=?,Email=?,Nationality=?,Password=? where Username=?");
                    ps.setObject(1, firstName);
                    ps.setObject(2, lastName);
                    ps.setObject(3, NICNumber);
                    ps.setObject(4, Address);
                    ps.setObject(5, Gender);
                    ps.setObject(6, Phone);
                    ps.setObject(7, Email);
                    ps.setObject(8, Nationality);
                    ps.setObject(9, Password);
                    ps.setObject(10, userName);
                    
                    int i = ps.executeUpdate();
                    
                    if(i > 0) 
                        return true;
                      else
                        return false;
                    
                    
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(dbCon.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(dbCon.class.getName()).log(Level.SEVERE, null, ex);
                }
                return false;
            }
            
            
            public boolean deleteUser (String userName)throws ClassNotFoundException, SQLException
            {
                    
                                       
                    PreparedStatement ps = createConnection().prepareStatement("delete from signup where Username=?");
                    ps.setString(1, userName);
                    
                    int i = ps.executeUpdate();
                    
                    if(i > 0) 
                        return true;
                      else
                        return false;
                                                
            }
            
            public boolean updateReserve(String bookingId, String bookingStatus) {
        
                try {
                    
                    PreparedStatement ps = createConnection().prepareStatement("update reservation set bookingStatus=? where bookingId=?");
                    ps.setObject(1, bookingStatus);
                    ps.setObject(2, bookingId);
       
                    
                    int i = ps.executeUpdate();
                    
                    if(i > 0) 
                        return true;
                      else
                        return false;
                    
                    
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(dbCon.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(dbCon.class.getName()).log(Level.SEVERE, null, ex);
                }
                return false;
            }
            
            public ResultSet roomAvailability(String roomName)throws ClassNotFoundException, SQLException
            {
                    Statement statement = createConnection().createStatement();

                    ResultSet rs = statement.executeQuery("select count(*) from "+roomName);

                        return rs;                                                      
            }
            int i;
            int k;
            public String reserveUser(String userName,String name, String email, String checkin, String checkout, String room, String phone, String message,String subject,String emailMsg,String user,String pass) throws ClassNotFoundException, SQLException 
            
            { 
                
                try{
                
                    PreparedStatement ps1 = createConnection().prepareStatement("select * from reservation where (checkOut=? OR checkIn=?) AND (room=?)");
                    ps1.setObject(1, checkin);
                    ps1.setObject(2, checkin);
                    ps1.setObject(3, room);
                    ResultSet resultSet = ps1.executeQuery();
                    boolean next = resultSet.next();
                    
                    if(next){
                        
                        
                    PreparedStatement ps4 = createConnection().prepareStatement("select count(*) from reservation where bookingStatus=? and room=? and checkOut=? and checkIn=?");
                    ps4.setObject(1, 1);
                    ps4.setObject(2, room);
                    ps4.setObject(3, checkout);
                    ps4.setObject(4, checkin);
                    
                    ResultSet resultSet4 = ps4.executeQuery();
                    boolean next4 = resultSet4.next();
                    
                    if(next){
                        
                            String string = resultSet4.getString(1);
                            int count = Integer.parseInt(string);
                            System.out.println(count);
                            if(count<3){
                            
                                
                        PreparedStatement ps5 = createConnection().prepareStatement("select roomId from "+room+" where Roomstatus=? or Roomstatus=?");
                         ps5.setObject(1, 0);
                         ps5.setObject(2, 1);
                    
                        ResultSet resultSet5 = ps5.executeQuery();
                        boolean next5 = resultSet5.next();
                    
                        if(next5){
                                 String id = resultSet5.getString(1);
                                 System.out.println(id);

                            PreparedStatement ps = createConnection().prepareStatement("update "+room+" set Roomstatus=? where roomId=?");
                            ps.setObject(1,1);
                            ps.setObject(2, id);

                            int i = ps.executeUpdate();

                            if(i > 0) {

                                PreparedStatement ps2 = createConnection().prepareStatement("update "+room+" set bookedPerson=? where roomId=?");
                                ps2.setObject(1,userName);
                                ps2.setObject(2,id);

                                k = ps2.executeUpdate();

                                if(k>0){

                                    PreparedStatement ps3 = createConnection().prepareStatement("insert into reservation(Username,name,email,checkIn,checkOut,room,phone,message,bookingStatus) values(?,?,?,?,?,?,?,?,?)");
                                     ps3.setString(1, userName);
                                     ps3.setString(2, name);
                                     ps3.setString(3, email);
                                     ps3.setString(4, checkin);
                                     ps3.setString(5, checkout);
                                    ps3.setString(6, room);
                                    ps3.setString(7, phone);
                                    ps3.setString(8, message);
                                    ps3.setObject(9, 1);


                                    i = ps3.executeUpdate();
                                    System.out.println(i);



                                }else{
                                    return "Your reservation is failed";
                                }


                            }

                            else
                                return "Rooms are full";


                        }else{
                                return "Rooms are full";
                                }
                                
                            }else{
                            return "Already reserved... Please book another Date"; 
                        }
                        

                        }else{
                            return "Already reserved... Please book another Date"; 
                        }
                        
 /////////////////////////////////////////////////////////////////////////
                        
                       
                    }else{
                         PreparedStatement ps5 = createConnection().prepareStatement("select roomId from "+room+" where Roomstatus=? or Roomstatus=?");
                         ps5.setObject(1, 0);
                         ps5.setObject(2, 1);
                    
                    ResultSet resultSet5 = ps5.executeQuery();
                    boolean next5 = resultSet5.next();
                    
                    if(next5){
                             String id = resultSet5.getString(1);
                             System.out.println(id);
                        
                        PreparedStatement ps = createConnection().prepareStatement("update "+room+" set Roomstatus=? where roomId=?");
                        ps.setObject(1,1);
                        ps.setObject(2, id);
                        
                        int i = ps.executeUpdate();
                    
                        if(i > 0) {
                            
                            PreparedStatement ps2 = createConnection().prepareStatement("update "+room+" set bookedPerson=? where roomId=?");
                            ps2.setObject(1,userName);
                            ps2.setObject(2,id);
                        
                            k = ps2.executeUpdate();
                            
                            if(k>0){
                                
                                PreparedStatement ps3 = createConnection().prepareStatement("insert into reservation(Username,name,email,checkIn,checkOut,room,phone,message,bookingStatus) values(?,?,?,?,?,?,?,?,?)");
                                 ps3.setString(1, userName);
                                 ps3.setString(2, name);
                                 ps3.setString(3, email);
                                 ps3.setString(4, checkin);
                                 ps3.setString(5, checkout);
                                ps3.setString(6, room);
                                ps3.setString(7, phone);
                                ps3.setString(8, message);
                                ps3.setObject(9, 1);
             
                    
                                i = ps3.executeUpdate();
                                System.out.println(i);
                                
                                
                                
                            }else{
                                return "Your reservation is failed";
                            }
                            
                            
                        }
                            
                        else
                            return "Rooms are full";
                        
                    
                    }else{
                            return "Rooms are full";
                            }
                    }
                        //////////////////////////

                    
                    
                }catch (SQLException throwables) {
            throwables.printStackTrace();
        }

               if(k>0){
                   
 
                   SendMail2.send(email, subject,emailMsg ,user,pass);
                   
                                    return "You have successfully reserved! Please check your email";
                                    
                                   }
                                else{
                                    return "Your reservation is failed";
                                }  
            }
String bookingId;
int newID;
    public int findBookingId() throws SQLException, ClassNotFoundException {
        
        Statement statement = createConnection().createStatement();

                    ResultSet rs = statement.executeQuery("select bookingId from reservation order by bookingId desc limit 1");
                   
                   boolean IfExif = rs.next();

                    if (IfExif){
                    bookingId = rs.getString(1);
                    newID = Integer.parseInt(bookingId);
                    newID= newID+1;
                    }
                    return newID;
    }

    public boolean bookingCancellation(String bookingId, String cancelReason) {
       
        
        try {
                    
                    PreparedStatement ps = createConnection().prepareStatement("update reservation set bookingStatus=?,cancelReason=? where bookingId=?");
                    ps.setObject(1, 0);
                    ps.setObject(2, cancelReason);
                    ps.setObject(3, bookingId);
       
                    
                    int i = ps.executeUpdate();
                    
                    if(i > 0) 
                        return true;
                      else
                        return false;
                    
                    
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(dbCon.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(dbCon.class.getName()).log(Level.SEVERE, null, ex);
                }
                return false;
        
    }
                    
    }           
