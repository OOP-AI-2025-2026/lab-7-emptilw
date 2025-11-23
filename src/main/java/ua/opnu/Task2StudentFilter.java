package ua.opnu;

import java.util.function.Predicate;

public class Task2StudentFilter {

    public static Student[] filter(Student[] arr, Predicate<Student> p) {
        Student[] res = new Student[arr.length];
        int cnt = 0;

        for (Student s : arr) {
            if (p.test(s)) {
                res[cnt++] = s;
            }
        }
        Student[] out = new Student[cnt];
        System.arraycopy(res, 0, out, 0, cnt);
        return out;
    }

    public static void run() {
        Student[] students = {
                new Student("Іванов", "IP-11", new int[]{70, 80, 90}),
                new Student("Петров", "IP-11", new int[]{40, 75, 60}),
                new Student("Сидоренко", "IP-12", new int[]{55, 50, 45}),
                new Student("Коваленко", "IP-12", new int[]{100, 95, 90})
        };

        Predicate<Student> hasDebts = Student::hasDebts;

        Student[] filtered = filter(students, hasDebts);

        System.out.println("Студенти з заборгованостями:");
        for (Student s : filtered) {
            System.out.println(s);
        }
    }
}
