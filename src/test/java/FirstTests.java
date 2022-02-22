import org.testng.annotations.Test;

import java.security.SecureRandom;
import java.util.Random;

import static org.testng.AssertJUnit.assertEquals;

public class FirstTests {

    @Test(groups = "g1")
    public void testFirst() {
        Random random = new SecureRandom();
        assertEquals(random.nextInt(16) % 2 , 0);
    }

    @Test(groups = "g2")
    public void testSecond() {
        Random random = new SecureRandom();
        assertEquals(random.nextInt(16) % 2 , 0);
    }

    @Test(groups = "g3")
    public void testThird() {
        Random random = new SecureRandom();
        assertEquals(random.nextInt(16) % 2 , 0);
    }

}