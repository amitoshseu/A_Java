
import model.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amitoshseu
 */ 
public class LoginService {
    private Map<String,User>userMap;
    public static String getDB_URL() {
        return DB_URL;
    }

    public static String getDB_USER() {
        return DB_USER;
    }

    public static String getDB_PASS() {
        return DB_PASS;
    }
    private Connection connection;
    private Statement statement;
    private static final String DB_URL = "jdbc:mysql://127.0.0.1/logindb";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "mrgain";
    
    public LoginService(){
        userMap = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            statement = connection.createStatement();
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean authenticate(String username, String password){
       String query = "select * from Login where username='" + username + "' and password = md5('" + password + "');";
        
        try {
            ResultSet resultset = statement.executeQuery(query);
            resultset.next();
            String user = resultset.getString("username");
            String full = resultset.getString("fullname");
            if(user.equals(username)){
                User userObject = new User(user,full);
                userMap.put(username, userObject);
                return true;
            } else{
                return false;
            }
            /* Above if else loop not mandatory becase we can check is it empty set or not is enought for this */
        } catch (SQLException ex) {
            Logger.getLogger(LoginService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public User getUserDetails(String username){
        return userMap.get(username);
    }

    public Connection getConnection() {
        return connection;
    }

    public Statement getStatement() {
        return statement;
    }
} 
