package ua.opnu;

import java.util.function.Function;

public class Task7StringifyNumbers {

    public static String[] stringify(int[] arr, Function<Integer, String> f) {
        String[] out = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            out[i] = f.apply(arr[i]);
        }
        return out;
    }

    public static void run() {

        Function<Integer, String> numToWord = n -> switch (n) {
            case 0 -> "нуль";
            case 1 -> "один";
            case 2 -> "два";
            case 3 -> "три";
            case 4 -> "чотири";
            case 5 -> "п'ять";
            case 6 -> "шість";
            case 7 -> "сім";
            case 8 -> "вісім";
            case 9 -> "дев'ять";
            default -> "???";
        };

        int[] arr = {0,1,2,3,4,5,6,7,8,9};

        String[] out = stringify(arr, numToWord);

        System.out.println("Перетворення в слова:");
        for (String s : out) System.out.println(s);
    }
}

