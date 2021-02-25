import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetClassString()
    {
        String x = new MainClass().getClassString();
        String find = "Hello";
        String find1 = "hello";
        Assert.assertTrue("Method getClassString do not has Value : Hello or hello",x.contains(find) || x.contains(find1));
    }


}
