package ua.org.oa.evlashdv.lecture5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        MyClass myClass = new MyClass();
        System.out.println("~~~~~~~~");
        MyClass myClass1 = new MyClass();
        System.out.println("~~~~~~~~");
        MyClass myClass2 = new MyClass();
        System.out.println("~~~~~~~~");

        new Field("");

        Human human = new Human("Vasya", 200);
        System.out.println(human);

        System.out.println(human.getAge());

        Human human1 = createHumanConsole();

        System.out.println(human1);

        Boss boss = Boss.newInstance("Vasya");
        Boss boss1 = Boss.newInstance("Kolya");

        System.out.println(boss);

    }

    public static Human createHumanConsole() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input human's name:");
        String name = br.readLine();
        System.out.println("Input human's age:");
        int age = Integer.parseInt(br.readLine());
        return new Human(name, age);
    }
}

class MyClass {
    public Field field1 = new Field("field1");
    public static Field staticField1 = new Field("staticField1");

    public MyClass() {
        System.out.println("Constructor");
    }

    {
        System.out.println("init block");
    }

    static {
        System.out.println("static init block");
    }

    public Field field2 = new Field("field2");
    public static Field staticField2 = new Field("staticField2");
}

class Field {
    public Field(String s) {
        System.out.println(s);
    }
}