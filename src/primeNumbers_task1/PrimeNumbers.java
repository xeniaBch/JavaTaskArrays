package primeNumbers_task1;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

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


        public static void printPrime2(int n) {
            List<Integer> list = new ArrayList<Integer>();

            for (int i = 2; i <= n; i++) {
                list.add(i);
            }
            //System.out.println("ArrayList : " + list.toString());


            for (int i = 0; list.get(i) * list.get(i) <= n; i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(j) % list.get(i) == 0) {
                        list.remove(j);
                    }
                }
            }
            System.out.println(list.toString());

        }




    public static void main(String[] args) {
        printPrime();
        printPrime2(100);
    }
}
