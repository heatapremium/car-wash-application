package carwash;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StoreDateToDatabase {

    public static Date lastWashDate = null;

    public void setLastWashDate(Date date) {
        this.lastWashDate = date;
    }

    public static void main(String[] args) throws ParseException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        try {
            // Establish a connection to the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/car_wash?user=root&password=");

            // Create a prepared statement
            String sql = "INSERT INTO vehicles (last_washed_date) VALUES (?)";
            pstmt = conn.prepareStatement(sql);

            // Set the parameters
            //setLastWashDate s1 = new setLastWashDate(lastWashDate); // or any other date value
            pstmt.setDate(1, new java.sql.Date(lastWashDate.getTime()));

            // Execute the query
            int rows = pstmt.executeUpdate();
            System.out.println(rows + " row(s) affected");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(); // or handle the exception appropriately
        } finally {
            // Close the connection and statement
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace(); // or handle the exception appropriately
            }
        }
    }
}



