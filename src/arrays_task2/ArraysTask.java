package arrays_task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysTask {


    public static int[] repeatedNumbers(int[] arr) {
        List<Integer> notRepeated = new ArrayList<>();
        List<Integer> alreadyRepeated = new ArrayList<>();
        for (int j : arr) {
            boolean inListNotRepeated = isInList(notRepeated, j);
            boolean inListAlreadyRepeated = isInList(alreadyRepeated, j);

            if (inListNotRepeated && inListAlreadyRepeated) {
                continue;
            }
            if (!inListNotRepeated) {
                notRepeated.add(j);
                continue;
            }

                alreadyRepeated.add(j);

        }

        int[] res = new int[alreadyRepeated.size()];
        for (int i = 0; i < alreadyRepeated.size(); i++) {
            res[i] = alreadyRepeated.get(i);
        }
        return res;
    }

    public static boolean isInList(List<Integer> list, int number) {
        for (Integer integer : list) {
            if (integer == number) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] ar = {1, 3 ,2, 2, 3 ,0};
        System.out.println(Arrays.toString(repeatedNumbers(ar)));
    }
}
