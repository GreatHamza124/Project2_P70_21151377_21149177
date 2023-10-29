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
public class Payment_ScreenTest {
    
    public Payment_ScreenTest() {
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
     * Test of shop_adjustments method, of class Payment_Screen.
     */
    @Test
    public void testShop_adjustments() {
        System.out.println("shop_adjustments");
        Payment_Screen instance = new Payment_Screen();
        instance.shop_adjustments();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shop_Details method, of class Payment_Screen.
     */
    @Test
    public void testShop_Details() {
        System.out.println("shop_Details");
        Payment_Screen instance = new Payment_Screen();
        instance.shop_Details();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of end_program method, of class Payment_Screen.
     */
    @Test
    public void testEnd_program() {
        System.out.println("end_program");
        Payment_Screen instance = new Payment_Screen();
        instance.end_program();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Payment_Screen.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Payment_Screen.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
