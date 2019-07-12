package ua.org.oa.evlashdv.lecture4;


import static java.lang.Math.*;

public class App {
    public static int count = 0;

    public static void main(String[] args) {

        System.out.println(PI);
        System.out.println(E);

        Human human = new Human("Vasya", 25);
        human.sayHello();
        System.out.println(human.name);
        System.out.println(human);
        System.out.println(human.toString());

        human.sayHelloSeveralTimes(3);

        System.out.println(human.type);
        Human human1 = new Human("Kolya", 30);
        human1.type = "Mammals";
        System.out.println(human.type);

        Human.type = "Sapiens";

        System.out.println(sum(2, 3));
        method(0);

        System.out.println(fibonachy(30));
        System.out.println(count);
    }

    public static int fibonachy(int number) {
        count++;
        if (number == 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        return fibonachy(number - 1) + fibonachy(number - 2);
    }

    public static void method(int i) {
        System.out.println(i);
        if (i < 10) {
            method(i + 1);
        }
        System.out.println(i);
    }

    public static int sum(short s1, short s2) {
        System.out.println("sum(short s1, short s2)");
        return s1 + s2;
    }

    public static double sum(double s1, double s2) {
        System.out.println("sum(double s1, double s2)");
        return s1 + s2;
    }
}
