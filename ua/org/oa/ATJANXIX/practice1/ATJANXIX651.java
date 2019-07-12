package practice1;

//переменные примитивных типов
public class ATJANXIX651 {
    static byte b;
    static char c;
    static short s;
    static int i;
    static float f;
    static double d;
    static long a;
    static boolean y;

    public static void primitiveTypes() {
//значения полей без предварительной инициализации
        System.out.println("byte " + b);
        System.out.println("char " + c);
        System.out.println("short " + s);
        System.out.println("int " + i);
        System.out.println("float " + f);
        System.out.println("double " + d);
        System.out.println("long " + a);
        System.out.println("boolean " + a);
    }

    public static void localTypes() {
        //локальные переменные
        byte b = 12;
        char c = 'a';
        short s = 11;
        int i = 1;
        float f = 4;
        double d = 3.2;
        long a = 2;
        boolean y = true;

        System.out.println(c);
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
        System.out.println(a);
        //System.out.println(Integer.parseInt(String.valueOf(y)));
        System.out.println(y);
    }

    public static void typeFloat() {
        float nk = (float) 1.;
        float jl = 1;
        float fr = 0x1;
        float lk = 0b1;
        float re = (float) 1.0e1;
        float pr = 01;

        System.out.println(nk);
        System.out.println(jl);
        System.out.println(fr);
        System.out.println(lk);
        System.out.println(re);
        System.out.println(pr);
    }

    public static void typeShort() {
        short err;
        byte be = 12;
        int we = 2;
        int ww = 5;
        float jj = 1;
        double se = 1.7;
        err = (short) (we + ww);// суммой двух целых чисел;
        System.out.println(err);
        err = (short) (we + se);// суммой целого и дробного чисел;
        System.out.println(err);
        err = (short) (jj + we);// суммой значений переменных типов float и int;
        System.out.println(err);
        err = (short) (be + err);// суммой значений переменных типа byte + short;
        System.out.println(err);
        err = (short) (jj + se); // суммой значений переменных типа float + double;
        System.out.println(err);
    }

    //проверить является ли треугольник прямоугольным
    public static boolean triangleTest(double a, double b, double c) {

        return c * c == a * a + b * b ? true : false;
    }

    //расчитать сумму чисел от 0 до 20
    public static void sumNumbers() {
        int sum = 0;
        for (int j = 1; j <= 20; j++) {
            sum += j;
        }
        System.out.println(sum);
    }

    //расчитать сумму четных чисел от 0 до 20
    public static void sumEvenNumbers() {
        int sum1 = 0;
        for (int j = 0; j <= 20; ) {
            sum1 += j;
            j = j + 2;
        }
        System.out.println(sum1);
    }

    //посчитать сумму простых чисел от 1 до 20
    public static void sumSimpleNumbers() {
        int sum2 = 0;
        for (int j = 1; j <= 20; ) {
            sum2 += j;
            j = j + 2;
        }
        System.out.println(sum2);
    }

    //Имея три переменных типа int a, b, c выведите на экран “true”,
// если сумма значений двух любых из этих переменных равна значению третьей.
    public static boolean typeVariablesTest(int a2, int b2, int c2) {
        if (c2 == a2 + b2) {
            return true;
        } else if (a2 == b2 + c2) {
            return true;
        } else if (b2 == a2 + c2) {
            return true;
        }

        return false;
    }
    //Две переменные типа int, имеют положительные значения int a - начало диапазона,
    // int b - конец диапазона, a>b. Вычислить среднее значение чисел в заданном диапазоне.

    public static void averageValue(int start, int end) {
        int average = 0;
        if (start < end) {
            average = (end - start) / 2;
        }
        System.out.println(average);
    }

    //а) Для каждого месяца вывести на экран сумму к оплате по телу кредита и начисленные проценты
    //б) Суммарное значение выплаченных процентов за период пользования кредитом.
    public static void creditDog(int sumCredit, double percent, int creditTerm) {

        double sc = sumCredit; //1200 uah

        double bodyCreditPercent = (double) (sumCredit / creditTerm); // 1200 / 12 = 100 uah

        double totalCredit = sumCredit;

        double loanOverpayment = 0;

        for (int i = 0; i < creditTerm; i++) {
            double temp = bodyCreditPercent + ((sc * percent / 100));
            sc -= bodyCreditPercent;

            System.out.println("Ежемесячная сумма к оплате по тело кредита плюс процент " + temp + " грн.");
            loanOverpayment += temp;

        }
        totalCredit += loanOverpayment;

        System.out.println("Переплата за " + creditTerm + " месяцев составит " + loanOverpayment + " грн.");
        System.out.println("Общая сумма, которую нужно вернуть " + totalCredit + " грн.");
    }
}