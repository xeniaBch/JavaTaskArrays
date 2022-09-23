package arrays_task2;
import org.junit.Assert;
import org.junit.Test;

public class ArrayTaskTest {
    int[] ar = {1, 3 ,2, 2, 3 ,0};
    int[] res = {2,3};


    @Test
    public void isRepeatedTrue(){
        Assert.assertArrayEquals(ArraysTask.repeatedNumbers(ar), res);
    }


}
