/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fodder;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class LoginPageTest {
    
    public LoginPageTest() {
    }
    
    @Before
    public void setUp() {
    }

    
    @Test
    public void testMain() {
        System.out.println("login request");
        String[] args = null;
        LoginPage.main(args);
        
    }
    
}
