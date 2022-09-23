package arrays_task2;
import org.junit.Assert;
import org.junit.Test;

public class ArrayTaskTest {


    @Test
    public void isRepeatedTrue(){
        int[] ar = {1, 3 ,2, 2, 3 ,0};
        int[] res = {2,3};
        Assert.assertArrayEquals(ArraysTask.repeatedNumbers(ar), res);
    }

    @Test
    public void isRepeated1True(){
        int[] ar = {0, 0};
        int[] res = {0};
        Assert.assertArrayEquals(ArraysTask.repeatedNumbers(ar), res);
    }

    @Test
    public void isRepeated2True(){
        int[] ar = {1, 7, 8, 8, 7, 7, 8, 9};
        int[] res = {8, 7};
        Assert.assertArrayEquals(ArraysTask.repeatedNumbers(ar), res);
    }
}
