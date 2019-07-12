package ua.org.oa.evlashdv.lecture3;

public class App {

    public static final int MIN_NAME_LENGTH = 2;
    public static String name;

    public static void main(String[] args) {
        System.out.println(2 > 3 && 3 < 4);
        System.out.println(method1(false) & method2(false));

        if (name != null && name.length() > MIN_NAME_LENGTH) {
            System.out.println("name = " + name);
        }

        System.out.println("true ^ true = " + (true ^ true));
        System.out.println("false ^ false = " + (false ^ false));
        System.out.println("false ^ true = " + (false ^ true));

        int i = 64646;
        int x = 63232;
        System.out.println("i -> " + Integer.toBinaryString(i));
        System.out.println("x -> " + Integer.toBinaryString(x));
        System.out.println("i&x->" + Integer.toBinaryString(i & x));
        System.out.println("i|x->" + Integer.toBinaryString(i | x));
        System.out.println("i^x->" + Integer.toBinaryString(i ^ x));

        int y = Integer.parseInt("10100", 2);//00100
        for (int ii = 0; ii <= 4; ii++) {
            System.out.println("state of " + ii + "th sensor is " + ((y & (int) Math.pow(2, ii)) != 0));
        }
        System.out.println("i>>2 -> " + Integer.toBinaryString(i >> 2));
        System.out.println("i<<2 -> " + Integer.toBinaryString(i << 2));

        System.out.println("i>>2 -> " + (i >> 2));
        System.out.println("i>>>2 -> " + (i >>> 2));
        System.out.println("i<<2 -> " + (i << 2));

        int day = 2;

        final int secondDay = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case secondDay:
                System.out.println("Tuesday");
                break;
        }

        int a = 3;
        int b = 4;
        int c = 5;
        System.out.println((c * c == a * a + b * b) ? "rectangular" : "not rectangular");

        m:
        for (i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 3) {
                    continue m;
                }
                System.out.print("m" + i + j + " ");
            }
            System.out.println();
        }

        n:
        {
            System.out.println("A");
            {
                if (true) {
                    break n;
                }
                System.out.println("B");
            }
            System.out.println("C");
        }
    }

    private static boolean method1(boolean b) {
        System.out.println("method1(" + b + ")");
        return b;
    }

    private static boolean method2(boolean b) {
        System.out.println("method2(" + b + ")");
        return b;
    }
}
