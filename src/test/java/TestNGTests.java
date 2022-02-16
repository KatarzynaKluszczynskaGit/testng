import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTests {

    @Test(groups = {"g1", "g2"})
    public void first_test() {
        Assert.assertTrue(false);
    }

    @Test(groups = {"g1"})
    public void second_test() {
        Assert.assertTrue(true);
    }

    @Test(groups = {"smoke"})
    public void third_test() {
        Assert.assertTrue(true);
    }
}
