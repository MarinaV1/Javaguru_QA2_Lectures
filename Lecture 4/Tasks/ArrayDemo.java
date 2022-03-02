package lecture4;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        arrayMethod1();
        arrayMethod2();
    }


    public static void arrayMethod1() {
        int[] leapyear = new int[3];
        System.out.println(Arrays.toString(leapyear));
        leapyear[0] = 2020;
        leapyear[1] = 2021;
        leapyear[2] = 2022;
        System.out.println(Arrays.toString(leapyear));
    }

    public static void arrayMethod2() {
        int[] leapYear = {3020, 3021, 3022};
        System.out.println(Arrays.toString(leapYear));
    }
}
