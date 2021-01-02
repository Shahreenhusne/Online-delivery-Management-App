
package CustomErrors;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class InternalServerExceptionTest {
    
    public InternalServerExceptionTest() {
    }
    
    @Before
    public void setUp() {
    }

    
    @Test
    public void testToString() {
        System.out.println("toString");
        InternalServerException instance = new InternalServerException();
        String expResult = "Some Error Occurred";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
