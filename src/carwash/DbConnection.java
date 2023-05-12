package carwash;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    public static Connection myconn(){
       Connection con = null;
       
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_wash","root","");
           
           
       
       }catch(Exception e){
           System.out.println(e);
         
         
       }
       
       
       
       
       return con;
    }
    
}
/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.File;
import java.io.PrintStream;
import javax.swing.JOptionPane;


public class DbConnection {
    private static DbConnection connection = null;
    private static Connection con;
    private static String URL="jdbc:mysql://localhost:3306/register";    
    private static String USER_NAME="root";
    private static String PASSWORD="";
    

    private DbConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(URL,USER_NAME,PASSWORD);
           
        }catch(Exception e){
           
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }

    public static DbConnection getInstance(){
        if(connection == null)
            connection = new DbConnection();
        return connection;
    }
    public PreparedStatement insertData(String query){
        try{
            return con.prepareStatement(query);
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,e.getMessage());
            return null;
        }
    }
    public void AddData(String query){
        try{
            con.createStatement().execute(query);
        }catch(Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    
    public ResultSet getData(String query){
        try{
            return con.prepareStatement(query).executeQuery();
        }catch(Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return null;
    }
   
}*/
