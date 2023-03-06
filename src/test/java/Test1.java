import org.junit.Assert;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test1 extends TestCase
{
    //@Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
  public void FailingTest() {
	String message2 = "Test Sec2";
        Assert.assertEquals("Second Test", "Test Sec2", message2);
    }
}
