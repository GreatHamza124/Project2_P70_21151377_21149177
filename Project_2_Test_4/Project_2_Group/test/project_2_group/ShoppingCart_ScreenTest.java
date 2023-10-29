/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package project_2_group;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yahya
 */
public class ShoppingCart_ScreenTest {
    
    public ShoppingCart_ScreenTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of cart_adjustments method, of class ShoppingCart_Screen.
     */
    @Test
    public void testCart_adjustments() {
        System.out.println("cart_adjustments");
        ShoppingCart_Screen instance = new ShoppingCart_Screen();
        instance.cart_adjustments();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cart_Details method, of class ShoppingCart_Screen.
     */
    @Test
    public void testCart_Details() {
        System.out.println("cart_Details");
        ShoppingCart_Screen instance = new ShoppingCart_Screen();
        instance.cart_Details();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateShoppingCart method, of class ShoppingCart_Screen.
     */
    @Test
    public void testUpdateShoppingCart() {
        System.out.println("updateShoppingCart");
        int quantity_left = 0;
        int quantity_input = 0;
        int product_id = 0;
        ShoppingCart_Screen instance = new ShoppingCart_Screen();
        instance.updateShoppingCart(quantity_left, quantity_input, product_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of emptyInventory method, of class ShoppingCart_Screen.
     */
    @Test
    public void testEmptyInventory() {
        System.out.println("emptyInventory");
        int quantity_left = 0;
        int quantity_input = 0;
        int product_id = 0;
        ShoppingCart_Screen instance = new ShoppingCart_Screen();
        instance.emptyInventory(quantity_left, quantity_input, product_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValuefromtable method, of class ShoppingCart_Screen.
     */
    @Test
    public void testGetValuefromtable() {
        System.out.println("getValuefromtable");
        int row = 0;
        ShoppingCart_Screen instance = new ShoppingCart_Screen();
        Object expResult = null;
        Object result = instance.getValuefromtable(row);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of end_program method, of class ShoppingCart_Screen.
     */
    @Test
    public void testEnd_program() {
        System.out.println("end_program");
        ShoppingCart_Screen instance = new ShoppingCart_Screen();
        instance.end_program();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ShoppingCart_Screen.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ShoppingCart_Screen.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
