import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void test()
        {
            MainClass mainClass = new MainClass();
        int value = mainClass.getLocalNumber();
        Assert.assertTrue("getLocalNumber != 14",value == 14);
    }


}
