/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_2_group_copy_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // Private constants for SQL connection details
    private static final String SQL_USERNAME = "pdc";
    private static final String SQL_PASSWORD = "pdc";
    private static final String SQL_URL = "jdbc:derby:ShoppingProject;create=true";
    
    //Establishes a connection to the database.
    public Connection establishConnection() {
        Connection connect = null;
        try {
             connect = DriverManager.getConnection(SQL_URL, SQL_USERNAME, SQL_PASSWORD);
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
        return connect;
    }
    
    //Closes the provided database connection.
    public void closeConnection(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
