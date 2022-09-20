
package lab02test;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoggerTest {
    
   

    @Test
    public void testSomeMethod() {
         Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();
        assertEquals(log1, log2);
    }
    
}
