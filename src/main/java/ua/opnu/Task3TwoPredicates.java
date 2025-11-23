package ua.opnu;

import java.util.function.Predicate;

public class Task3TwoPredicates {

    public static int[] filter(int[] arr, Predicate<Integer> p1, Predicate<Integer> p2) {
        int[] res = new int[arr.length];
        int cnt = 0;

        for (int x : arr) {
            if (p1.test(x) && p2.test(x)) {
                res[cnt++] = x;
            }
        }

        int[] out = new int[cnt];
        System.arraycopy(res, 0, out, 0, cnt);
        return out;
    }

    public static void run() {
        int[] arr = {1, 2, 3, 4, 5, 10, 15, 20};

        Predicate<Integer> even = x -> x % 2 == 0;
        Predicate<Integer> greater10 = x -> x > 10;

        int[] res = filter(arr, even, greater10);

        System.out.print("Числа парні і > 10: ");
        for (int x : res) System.out.print(x + " ");
    }
}

