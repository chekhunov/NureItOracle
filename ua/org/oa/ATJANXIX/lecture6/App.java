package ua.org.oa.evlashdv.lecture6;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Human> humans = new ArrayList<>(10);
        humans.add(new Human("Vasay", 25));
        humans.add(new Human("Kolya", 15));
        humans.add(new Human("Sveta", 30));

        System.out.println(humans);

        ArrayList<String> stringList = new ArrayList<>(10);
        stringList.add("1");
        stringList.add("3");
        stringList.add("4");
        stringList.add(1, "0");
        stringList.set(2, "5");
        stringList.add(4, "0");
        System.out.println(stringList);

        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

        for (Human human : humans) {
            System.out.println(human);
        }
        System.out.println(stringList);
        stringList.remove(1);
        System.out.println(stringList);

        Integer x, y, z;
        x = 212;
        y = 212;
        z = Integer.valueOf(12);

        System.out.println(x == y);

        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(12);
        integers.add(125);

        String number = Integer.toBinaryString(36372);
        System.out.println(number);
        int i = Integer.parseInt(number, 2);
        System.out.println(i);


    }
}
