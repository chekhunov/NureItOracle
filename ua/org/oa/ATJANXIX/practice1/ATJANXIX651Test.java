package practice1;

import static com.sun.tools.doclint.Entity.sum;

public class ATJANXIX651Test {


    public static void main(String[] args) {

        System.out.println("-----Test1-----");
        ATJANXIX651.primitiveTypes();
        ATJANXIX651.localTypes();

        System.out.println("-----Test2-----");
        ATJANXIX651.typeFloat();

        System.out.println("-----Test3-----");
        ATJANXIX651.typeShort();

        System.out.println("-----Test4-----");
        double a = 3;
        double b = 4;
        double c = 5;

        if (ATJANXIX651.triangleTest(a, b, c)) {
            System.out.println("Прямоугольный треугольник");

        } else {
            System.out.println("Не прямоугольный треугольник");
        }

        System.out.println("-----Test5-----");

        ATJANXIX651.sumNumbers();

        System.out.println("-----Test6-----");

        ATJANXIX651.sumEvenNumbers();

        System.out.println("-----Test7-----");

        ATJANXIX651.sumSimpleNumbers();

        System.out.println("-----Test8-----");
        int a2 = 7;
        int b2 = 7;
        int c2 = 4;
        if (ATJANXIX651.typeVariablesTest(a2, b2, c2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


        System.out.println("-----Test9-----");
        int start = 18;
        int end = 20;
        ATJANXIX651.averageValue(start, end);

        System.out.println("-----Test10-----");
        int sumCredit = 1200; //гривна
        double percent = 16;   //годовых %
        int creditTerm = 12;    //месяцев
        ATJANXIX651.creditDog(sumCredit, percent, creditTerm);

    }
}