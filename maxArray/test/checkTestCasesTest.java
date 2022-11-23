import com.sun.org.glassfish.gmbal.NameValue;
import org.junit.*;

import javax.annotation.Generated;
import javax.xml.ws.soap.Addressing;
import java.beans.Transient;

import static org.junit.Assert.*;

public class checkTestCasesTest {




    @Test
    public  void add()
    {
        checkTestCases ctc = new checkTestCases();
        int sum = ctc.addNumber(3,8);
        assertEquals(11,sum);
        System.out.println(ctc.addNumber(3,8));
    }
    @Before
    public void be()
    {
        checkTestCases ctc = new checkTestCases();
        ctc.beforeExecute();
    }

    @BeforeClass

    public static void bea()
    {
        checkTestCases ctc = new checkTestCases();
        ctc.alwaysBeforeExecuted();
    }

    @After

    public  void alw()
    {
        checkTestCases ctc = new checkTestCases();
        ctc.afterExecuted();
    }

    @Test
    public  void cub()
    {
        checkTestCases ctc = new checkTestCases();
        assertEquals(27,ctc.cube(3));
        System.out.println(ctc.cube(3));
    }
    @AfterClass
    public static void aea()
    {
        checkTestCases ctc = new checkTestCases();
        ctc.afterAlwaysExecuted();
    }
}