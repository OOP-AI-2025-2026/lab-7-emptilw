package ua.opnu;

import java.util.function.Function;

public class Task6PowerFunction {

    public static void run() {
        Function<Integer, Integer> power2 = n -> (int) Math.pow(2, n);

        int[] arr = {0,1,2,3,4,5,6,7,8,9};

        System.out.println("2^n для кожного числа:");
        for (int x : arr) {
            System.out.println("2^" + x + " = " + power2.apply(x));
        }
    }
}

