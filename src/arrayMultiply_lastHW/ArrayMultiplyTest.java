package arrayMultiply_lastHW;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArrayMultiplyTest {

    int[] arr = {2, 5, 18, 50};
    @Test
    public void isMultiplyTestTrue(){
        assertTrue(ArrayMultiply.isMultiply(arr,36));
    }

    @Test
    public void isMultiplyTestFalse(){
        assertFalse(ArrayMultiply.isMultiply(arr,40));
    }
}