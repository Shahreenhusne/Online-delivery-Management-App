
package Backend;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class CustomerTest {
    
    public CustomerTest() {
    }
    
    @Before
    public void setUp() {
    }

    
    @Test
    public void testToString() {
        System.out.println("toString");
        Customer instance = new Customer ("shahreen","");
        String expResult = "shahreen";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetName() {
        System.out.println("getName");
        Customer instance= new Customer ("shahreen","") ;
        String expResult = "shahreen";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Customer instance = new Customer ("","shahreenrabbani@gmail.com");
        
        String expResult = "shahreenrabbani@gmail.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    @Test
    public void testUpdateCart() {
        System.out.println("updateCart");
       // ArrayList<Integer> updatedOrder =  null ;
        Customer instance = new Customer ("shahreen","shahreenrabbani@gmail.com");
       // instance.updateCart(updatedOrder);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetCart() {
        System.out.println("getCart");
       Customer instance = new Customer ("","");
        ArrayList<FoodItem> expResult = null  ;
        ArrayList<FoodItem> result = instance.getCart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetTotalPrice() {
        System.out.println("getTotalPrice");
        Customer instance = new Customer("","");
        int expResult = 0;
        int result = instance.getTotalPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetTaxedPrice() {
        System.out.println("getTaxedPrice");
        Customer instance = new Customer("","");
        double expResult = 0.0;
        double result = instance.getTaxedPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetTax() {
        System.out.println("getTax");
        Customer instance = new Customer("","");;
        String expResult = "0.00";
        String result = instance.getTax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
