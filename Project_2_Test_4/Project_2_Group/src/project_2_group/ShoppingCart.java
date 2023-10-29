/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_2_group;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

/**
 *
 * @author Hamza
 */
public class ShoppingCart {
    public ShoppingCart(){
        cart_Database();
    }
    
    //Method to set up the shopping cart database.
    //Creates a table for cart items with specific columns and data types.
    public void cart_Database(){
        String tablename = "shoppingcart";
        String primarykey = "id";
        HashMap<String,String> products = new HashMap<>();
        products.put("id", "int");
        products.put("name","varchar(40)");
        products.put("price","double");
        products.put("quantity","int");
        products.put("category","varchar(40)");
        MainProgram.shopping_cart.dropTable(tablename);
        MainProgram.shopping_cart.createTable(tablename, products, primarykey);
    }
   
    
}
