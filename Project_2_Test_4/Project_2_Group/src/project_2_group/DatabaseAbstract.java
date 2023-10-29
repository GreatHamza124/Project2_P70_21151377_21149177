/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_2_group_copy_project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;

public abstract class DatabaseAbstract {
    protected Connection conn;
    
    // Abstract methods to be implemented by subclasses
    //Establishes a connection to the database.
    public abstract void establishConnection();
    //Closes the existing database connection.
    public abstract void closeConnection();
    //Executes a SQL query and returns the result set.
    public abstract ResultSet executeQuery(String sql);
    //Executes an SQL update statement.
    public abstract void executeUpdate(String sql);
    //Creates a table in the database.
    public abstract void createTable(String tablename, HashMap<String,String> columns, String primarykey);
    //Inserts data into tablr
    public abstract void insertTable(String insert, String tablename, String columns);
    //Drops table from the database
    public abstract void dropTable(String tablename);
    
}
