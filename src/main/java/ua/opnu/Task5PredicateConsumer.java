package ua.opnu;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Task5PredicateConsumer {

    public static void apply(int[] arr, Predicate<Integer> p, Consumer<Integer> c) {
        for (int x : arr) {
            if (p.test(x)) {
                c.accept(x);
            }
        }
    }

    public static void run() {
        int[] arr = {5, 10, 13, 20, 25};

        Predicate<Integer> even = x -> x % 2 == 0;
        Consumer<Integer> printSquare = x -> System.out.println(x + "^2 = " + (x * x));

        System.out.println("Парні числа у квадраті:");
        apply(arr, even, printSquare);
    }
}

