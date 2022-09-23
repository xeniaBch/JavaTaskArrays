package primeNumbers_task1;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    //it is slower on big amount of numbers
    public static void printPrime(){
        boolean isPrime;
        for (int n = 2; n <= 100; n++) {
            isPrime = true;
            for (int k = 2; k <=Math.sqrt(n); k++){
                if (n % k == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }

    //it is faster on big amount of numbers
    public static void printPrimeWithList(int number) {

        // there are [2, 3, 5, 7] for numbers less than 100
        List<Integer> listOfPrimeDivisors = createListOfPrimeDivisors((int) Math.sqrt(number));

        boolean isPrime;
        for (int i = 2; i <= number; i++) {
            isPrime = true;

            for (int item : listOfPrimeDivisors) {
                if (i % item == 0 && i != item) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static List<Integer> createListOfPrimeDivisors(int n) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            list.add(i);
        }
        for (int i = 0; list.get(i) * list.get(i) <= n; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) % list.get(i) == 0) {
                    list.remove(j);
                }
            }
        }
        return list;

    }


    public static void main(String[] args) {
        printPrime();
        printPrimeWithList(100);
    }
}
