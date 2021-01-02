
package Backend;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class FoodItemTest {
    
    public FoodItemTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getName method, of class FoodItem.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        FoodItem instance = new FoodItem("Chicken Fry",160);
        String expResult =  "Chicken Fry";
        String result = instance.getName();
        assertEquals(expResult, result);
    }
        
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        FoodItem instance = new FoodItem ("",160);
        int expResult = 160;
        int result = instance.getPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantity method, of class FoodItem.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        FoodItem instance = new FoodItem("",10);
        int expResult =  0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantity method, of class FoodItem.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 10 ;
        FoodItem instance = new FoodItem("", 10 );
        instance.setQuantity(quantity);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
