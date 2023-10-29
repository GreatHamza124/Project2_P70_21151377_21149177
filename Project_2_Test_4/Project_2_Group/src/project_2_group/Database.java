/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_2_group;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;

/**
 *
 * @author Yahya
 */
public class Database extends DatabaseAbstract{
    //Private variables holding instances of different database related classes
    final private DatabaseConnection connection;
    final private DatabaseQuery query;
    final private DatabaseTable table;
    
    //Constructor to initialize database components and establish a connection
    public Database(){
        connection = new DatabaseConnection();
        query = new DatabaseQuery();
        table = new DatabaseTable();
        this.establishConnection();
    }
    
    //Overridable methods from the abstract class
    //Establishes a connection to the database
    @Override
    public void establishConnection(){
        conn = connection.establishConnection();
    }
    
    //Closes existing database connection
    @Override
    public void closeConnection(){
        connection.closeConnection(conn);
    }
    
    //Executes a SQL query and returns the result set.
    //@param sql The SQL query string to execute.
    @Override
    public ResultSet executeQuery(String sql){
        return query.executeQuery(conn, sql);
    }
    
    //Executes SQL update statement
    @Override
    public void executeUpdate(String sql){
        query.executeUpdate(conn,sql);
    }
    
    //Creates table in database
    @Override
    public void createTable(String tablename, HashMap<String,String> columns, String primarykey){
        table.createTable(conn, tablename, columns, primarykey);
    }
    
    //Insert data into the table
    @Override
    public void insertTable(String insert, String tablename, String columns){
        table.insertStatement(conn, insert, tablename, columns);
    }
    
    //Drops table from the database
    @Override
    public void dropTable(String tablename){
        table.dropTable(conn, tablename);
    }

    
    
}
