package Model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nonim
 */
public class feedbackcon {
    private static feedbackcon dbConnection;
    private Connection connection;
    private feedbackcon() throws SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelwebdata","root","");
            System.out.println("Connected");
        } catch (ClassNotFoundException | SQLException e) {

            e.printStackTrace();

        }
    }

    public static feedbackcon getInstance() throws SQLException{
        return (dbConnection==null)? dbConnection = new feedbackcon() : dbConnection;
    }
    public Connection getConnection(){
        return connection;
    }
    
}
