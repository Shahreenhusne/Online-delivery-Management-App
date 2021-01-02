
package CustomErrors;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class UsernameExistsExceptionTest {
    
    public UsernameExistsExceptionTest() {
    }
    
    @Before
    public void setUp() {
    }

    
    @Test
    public void testToString() {
        System.out.println("toString");
        UsernameExistsException instance = new UsernameExistsException();
        String expResult = "Username is taken";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
