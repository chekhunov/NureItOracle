package ua.org.oa.evlashdv.lecture4;


public class Human {

    public static String type = "Sapiens";
    public String name;
    public int age;

    public Human() {

    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name) {
        this(name, 1);
    }

    public void sayHello() {
        System.out.println("Hello my name is " + name);
    }

    public void sayHelloSeveralTimes(int times) {
        for (int i = 0; i < times; i++) {
            sayHello();
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
