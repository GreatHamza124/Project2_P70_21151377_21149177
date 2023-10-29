/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_2_group;

import java.util.HashMap;

/**
 *
 * @author Yahya
 */
public class SignUp {
    public SignUp(){
        create_Database();//Create Signup database
    }
   
    //Method to create the sign-up database.
    //Creates a table for sign-up information with specific columns and data types.
    public void create_Database(){
        HashMap<String,String> columns = new HashMap();
        columns.put("id","int");
        columns.put("username","varchar(40)");
        columns.put("password","varchar(40)");
        String tablename = "signupsheet";
        String primarykey = "id";
        MainProgram.signup_list.dropTable(tablename);
        MainProgram.signup_list.createTable(tablename, columns, primarykey);
    }
    
}
