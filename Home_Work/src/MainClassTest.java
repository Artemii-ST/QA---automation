import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetClassNumber()
    {
        MainClass mainClass = new MainClass();
        int x = mainClass.getClassNumber();
        Assert.assertTrue("metod getClassNumber return value < 45",x > 45);
    }


}
