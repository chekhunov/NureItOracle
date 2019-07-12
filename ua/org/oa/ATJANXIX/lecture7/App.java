package ua.org.oa.evlashdv.lecture7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        String time = ldt.format(formatter);
        System.out.println(time);
        formatter = DateTimeFormatter.ofPattern("dd,MMMM,yyyy H:m", new Locale("uk", "ua"));
        time = ldt.format(formatter);
        System.out.println(time);
        System.out.println(LocalDateTime.of(2019, 3, 8, 10, 17).format(formatter));

        System.out.println(LocalDateTime.parse(time, formatter));

        Shirt shirt = new Shirt("blue Shirt", 300, 51);
        System.out.println(shirt);
        shirt.setName("green Shirt");
        shirt.setPrice(250);
        System.out.println(shirt);

        C c = new C();
        System.out.println(c.a);
        A a = c;
        System.out.println(a.a);
        System.out.println(((B) a).a);
        System.out.println(shirt);
        shirt.clean();
        Clothing clothing = shirt;
        System.out.println(clothing);

        Object o = new B();

        System.out.println(o instanceof A);
        System.out.println(o instanceof B);
        System.out.println(o instanceof C);

        Shirt shirt1 = new Shirt("shirt", 250, 50);

        System.out.println(shirt1.equals(shirt));
        System.out.println(shirt1.hashCode());
        System.out.println(shirt.hashCode());
    }
}

class A {
    char a = 'A';
}

class B extends A {
    char a = 'B';
}

class C extends B {
    char a = 'C';
}
