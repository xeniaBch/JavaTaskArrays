package arrayMultiply_lastHW;

public class ArrayMultiply {
    public static boolean isMultiply(int[]arr, int value) {
        int i = 0;
        int j = arr.length - 1;
        while (i != j) {
            if (arr[i] * arr[j] > value) {
                j -= 1;
                continue;
            }
            if (arr[i] * arr[j] < value) {
                i += 1;
                continue;
            }
            return true;
        }
        return false;
    }

}
