package ua.org.oa.evlashdv.lecture5;

import java.util.Arrays;

public class AppArrays {
    public static void main(String[] args) {
        int[] ints;
        ints = new int[5];

        System.out.println(ints);
        System.out.println(Arrays.toString(ints));

        ints[1] = 34;
        System.out.println(Arrays.toString(ints));
        int[] ints1 = {23, 4, 5, 11, 23, 55};
        System.out.println(Arrays.toString(ints1));

        int[] ints2;

        ints2 = new int[]{2, 3, 4, 2, 3, 6, 77, 88};
        System.out.println(Arrays.toString(ints2));
        for (int i = 0; i < ints2.length; i++) {
            System.out.println(ints2[i]);
        }

        for (int i : ints2) {
            System.out.println(i);
        }

        System.out.println(Arrays.toString(args));

        System.out.println(Integer.parseInt(args[1]) + 25);

        int[][] ints3 = {{1, 2, 3}, {}, {2, 3, 4, 5, 6}, null, {33}, {44, 55, 66}};
        System.out.println(Arrays.deepToString(ints3));

        ints3[0][1] = 9;
        System.out.println(Arrays.deepToString(ints3));
        ints3[3] = new int[]{3, 3, 3, 3};
        System.out.println(Arrays.deepToString(ints3));

        for (int[] ints4 : ints3) {
            for (int i : ints4) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
