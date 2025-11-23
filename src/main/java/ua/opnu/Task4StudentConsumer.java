package ua.opnu;

import java.util.function.Consumer;

public class Task4StudentConsumer {

    public static void run() {
        Student[] arr = {
                new Student("Іванов Іван", "IP-11", new int[]{70}),
                new Student("Петренко Олег", "IP-12", new int[]{90}),
                new Student("Сидоренко Анна", "IP-13", new int[]{85})
        };

        Consumer<Student> printName = s -> System.out.println(s.getName());

        System.out.println("Вивід прізвище + ім'я:");
        for (Student s : arr) {
            printName.accept(s);
        }
    }
}

