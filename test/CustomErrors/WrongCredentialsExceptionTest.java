/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomErrors;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class WrongCredentialsExceptionTest {
    
    public WrongCredentialsExceptionTest() {
    }
    
    @Before
    public void setUp() {
    }

    
    @Test
    public void testToString() {
        System.out.println("toString");
        WrongCredentialsException instance = new WrongCredentialsException();
        String expResult = "Entered Credentials are Wrong";
        String result = instance.toString();
        assertEquals(expResult, result);
       
    }
    
}
