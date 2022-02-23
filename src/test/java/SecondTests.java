import org.testng.annotations.Test;

import java.security.SecureRandom;
import java.util.Random;

import static org.testng.AssertJUnit.assertEquals;

public class SecondTests {

    @Test(groups = "smoke")
    public void testFourth() {
        Random random = new SecureRandom();
        assertEquals(random.nextInt(16) % 2 , 0);
    }

    @Test(groups = "g2")
    public void testFifth() {
        Random random = new SecureRandom();
        assertEquals(random.nextInt(16) % 2 , 0);
    }

    @Test(groups = "g3")
    public void testSixth() {
        Random random = new SecureRandom();
        assertEquals(random.nextInt(16) % 2 , 0);
    }

    @Test(groups = "g1")
    public void testSeventh() {
        Random random = new SecureRandom();
        assertEquals(random.nextInt(16) % 2 , 0);
    }
}