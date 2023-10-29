/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_2_group;

import java.util.HashMap;
import java.sql.Connection;
import java.util.Map;

/**
 *
 * @author Yahya
 */
public class DatabaseTable {
    //Private Variables
    private DatabaseQuery query;
    
    //Constructor
    public DatabaseTable(){
        query = new DatabaseQuery();
    }
    
    //Method for creating a database table
    public void createTable(Connection conn, String tablename,HashMap<String,String> columns, String primarykey){
        //StringBuilder variable for creating a SQL query
        StringBuilder sql = new StringBuilder("CREATE TABLE " + tablename + " (");
        
        //Iterate through the columns hashmap to define table columns
        for (Map.Entry<String, String> entry : columns.entrySet()){
            sql.append(entry.getKey()).append(" ").append(entry.getValue()).append(", ");
        }
        
        //Add the primary key constraint to the SQL query
        sql.append("CONSTRAINT PK_").append(tablename).append(" PRIMARY KEY (").append(primarykey).append("))");
        
        //Create a table
        query.executeUpdate(conn,sql.toString());
    }
    
    //Method for inserting information in the table
    public void insertStatement(Connection conn, String insert, String tablename, String columns){
        //SQL query for inserting values in a table
        String sql = "INSERT INTO " + tablename + columns + " Values" + insert;
        
        //Insert values
        query.executeUpdate(conn, sql);
    }
    
    //Method for removing the table
    public void dropTable(Connection conn, String tablename){
        //SQL query for removing the table
        String sql = "DROP TABLE " + tablename;
        
        //Remove the table
        query.executeUpdate(conn,sql);
    }
    
}
