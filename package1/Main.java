package package1;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static Integer anyNumber;

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(3, "2 Stroke", "Tempo", "VIK001", 500000);
        System.out.println(v1);

        Swift s1 = new Swift("Swift", "White", "15", "Sony");
        System.out.println(s1);

        Swift s3 = new Swift();

        Swift s2 = new Swift("Swift", "White", "15", "Sony");
        System.out.println(s1.equals(s2));

        Set<Swift> set = new HashSet<>();
        set.add(s1);
        set.add(s2);

        System.out.println(set);

        func();
        func(10);
        func("Prakhar", 100);
        func(150, "Shailendra");
    }

    //Overloading allowed with different return types.
    //Static polymorphism

    public static void func(int a) {
        System.out.println(a);
    }

    public static void func() {
        System.out.println("No parameters!");
    }

    public static void func(String a, Integer b) {
        System.out.println(a + b);
    }

    public static void func(Integer c, String d) {
        System.out.println(c + d);
    }

}
