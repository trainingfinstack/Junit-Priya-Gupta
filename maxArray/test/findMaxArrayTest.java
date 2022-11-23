import org.junit.Test;

import static org.junit.Assert.*;

public class findMaxArrayTest {

    @Test
    public void testMaxArraySum()
    {
        findMaxArray fma = new findMaxArray();
        int result = fma.maxArray(new int[]{2, 6, 9, 1, 5, 0});
        assertEquals(2,result);
    }

}