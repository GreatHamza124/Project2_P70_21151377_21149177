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
public class Shop {
    
    public Shop(){
        shop_Database();//Initialize sho database
        shop_Insert();//Insert initial data into the shop database
    }
    
    //Setting up shop database
    //Creates a table for products with specific columns and data types
    public void shop_Database(){
        String tablename = "shop";
        String primarykey = "id";
        HashMap<String,String> products = new HashMap<>();
        products.put("id", "int");
        products.put("name","varchar(40)");
        products.put("price","double");
        products.put("quantity","int");
        products.put("category","varchar(40)");
        
        // Drop the existing table and create a new one with the specified structure
        MainProgram.shop_items.dropTable(tablename);
        MainProgram.shop_items.createTable(tablename, products, primarykey);
        
    }
    
    //Method to insert initial data into the shop database.
    //Inserts a set of product records into the shop table.
    public void shop_Insert(){
        String tablename = "Shop";
        String column = " (id, name, price, quantity, category)";
        StringBuilder insert = new StringBuilder();
        insert.append("(1,'potato',23.99,67,'Vegetable'), ");
        insert.append("(2,'orange',9.99,78,'Fruit'), ");
        insert.append("(3,'Blue_TShirt',9.99,78,'Shirts'), ");
        insert.append("(4,'Black_Pants',9.99,78,'Pants'), ");
        insert.append("(5,'Pencil',9.99,78,'Stationary'), ");
        insert.append("(6,'apple',9.99,78,'Fruit'), ");
        insert.append("(7,'Black_TShirt',34.99,190,'Shirts')");
        // Insert the specified data into the shop table
        MainProgram.shop_items.insertTable(insert.toString(), tablename, column);
    }
    
}
