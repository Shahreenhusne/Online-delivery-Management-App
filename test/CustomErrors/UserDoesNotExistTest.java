
package CustomErrors;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class UserDoesNotExistTest {
    
    public UserDoesNotExistTest() {
    }
    
    @Before
    public void setUp() {
    }

    
    @Test
    public void testToString() {
        System.out.println("toString");
        UserDoesNotExist instance = new UserDoesNotExist();
        String expResult = "Username entered does not exist";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
