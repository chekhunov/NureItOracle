package ua.org.oa.evlashdv.lecture2;

public class App {

    static int age;

    final int MAX_AGE = Math.abs(2);

    public static void main(String[] args) {
        int i = 34568;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(-i));
        System.out.println(~i + 1);

        int y = 0x3f3;

        System.out.println(y);
        System.out.println(Integer.toHexString(y));

        char myChar = 'A';
        char myChar1 = '\u0041';
        char myChar2 = 65;

        System.out.println("myChar = " + myChar);
        System.out.println("myChar1 = " + myChar1);
        System.out.println("myChar2 = " + myChar2);

        int z = 'А';
        System.out.println("z = " + z);

        double d = 0;
        for (int j = 0; j < 100; j++) {
            d = d + 0.1;
            System.out.println("d = " + d);
        }

        double dd = 0.1;
        float ff = 0.1f;
        System.out.println(dd == ff);

        System.out.println(age);

        int price;
        price = 2;
        price = 3;
        System.out.println("price = " + price);

        final int MIN_AGE;

        MIN_AGE = 2;
        System.out.println(age);
        int age = 1;
        System.out.println(age);
        System.out.println(App.age);

        System.out.println(9 % 2 == 0);
        System.out.println(47347 % 100);


        for (int j = 0; j < 100; j++) {
            System.out.println(j % 4);
        }

        i = 1;
        i++; //i = i + 1;

        /*
        i=2

        i += i++ + ++i * i++

        i = i + (i++ + ++i * i++)


         */

        byte b = 5;
        int myInt = b;

        int bigInt = 786764234; // 786764220
        float f = bigInt;
        System.out.println(f);

        final byte b1 = 4;
        final byte b2 = 5;

        byte b3 = (b1 + b2);

        System.out.println(b3);

        b3 = 4 + 5;

        long i2 = 1000000 * 10001000L;
        System.out.println(i2);

        double d2 = 3 / 4.;
        System.out.println(d2);

        d2 = 0. / 0;
        System.out.println(d2);
        System.out.println(2 / 0. - 2 / 0.);

    }
}
