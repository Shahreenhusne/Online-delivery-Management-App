/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hp
 */
public class DatabaseAccessTest {
    
    public DatabaseAccessTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of registerUser method, of class DatabaseAccess.
     */
    @Test
    public void testRegisterUser() throws Exception {
        System.out.println("registerUser");
        String username = "ramisa";
        String password = "ramisa";
        String email = "ramisa@gmail.com";
        DatabaseAccess instance = new DatabaseAccess();
        //Customer expResult = new Customer("ramisa","ramisa@gmail.com");
        //Customer result = instance.registerUser(username, password, email);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class DatabaseAccess.
     */
    @Test
    public void testLoginUser() throws Exception {
        System.out.println("loginUser");
        String username = "shahreen";
        String password = "arpa";
        DatabaseAccess instance = new DatabaseAccess();
       // Customer expResult = new Customer("shahreen","arpa");
       //Customer result = instance.loginUser(username, password);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
