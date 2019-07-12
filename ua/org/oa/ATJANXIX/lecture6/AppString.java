package ua.org.oa.evlashdv.lecture6;

public class AppString {
    public static void main(String[] args) {
        String name = "Vasya";
        String name1 = new String("Vasya");
        String name2 = "Vasya";
        System.out.println(name == name1);
        System.out.println(name == name2);

        String s = "mama mila ramu";

        System.out.println(s.charAt(3));

        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf('a', 4));
        System.out.println(s.indexOf("mi"));
        findSymbolsIndexInString(s, 'a');

        String s1 = s.substring(2, 7);
        System.out.println(s1);

        System.out.println(s.replace('m', 'p'));

        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("sb.length() = " + sb.length());
        System.out.println("sb.capacity() = " + sb.capacity());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(i).append(" ");
            System.out.println("sb.length() = " + sb.length());
            System.out.println("sb.capacity() = " + sb.capacity());
        }
        sb.trimToSize();
        System.out.println("sb.length() = " + sb.length());
        System.out.println("sb.capacity() = " + sb.capacity());
    }

    public static void findSymbolsIndexInString(String s, char ch) {
        int index = 0;
        while ((index = s.indexOf(ch, index)) != -1) {
            System.out.println(index++);
        }
    }
}
