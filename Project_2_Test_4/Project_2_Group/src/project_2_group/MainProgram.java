/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_2_group;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Yahya
 */
public class MainProgram {
    // Static instances of Database for managing different aspects of the program
    static Database signup_list = new Database(); // Database for sign-up information
    static Database shop_items = new Database(); // Database for shop items 
    static Database shopping_cart = new Database(); // Database for shopping cart
    
     // Instances of Shop and ShoppingCart classes
    Shop product = new Shop();
    //ShoppingCart cart = new ShoppingCart();
    
    
    public MainProgram(){
    }
    
    /**
     * The main method to start the program.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainProgram mp = new MainProgram();

        // Set up the GUI for sign-up screen
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp_Screen().setVisible(true);
            }
        });
    }
}
