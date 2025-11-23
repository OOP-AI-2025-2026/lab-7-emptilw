package ua.opnu;

import java.util.function.Predicate;

public class Task1PrimePredicate {

    // Предикат простого числа
    public static Predicate<Integer> isPrime = n -> {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    };

    public static void run() {
        int[] arr = {1, 2, 3, 4, 5, 11, 15, 17};

        System.out.print("Прості числа: ");
        for (int x : arr) {
            if (isPrime.test(x)) {
                System.out.print(x + " ");
            }
        }
    }
}

