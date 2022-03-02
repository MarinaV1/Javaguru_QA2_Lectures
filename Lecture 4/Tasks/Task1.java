package lecture4;

import java.util.Arrays;
import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
        Random random = new Random();
        int variable1 = random.nextInt(100);
        int variable2 = random.nextInt(100);
        int variable3 = random.nextInt(100);
        System.out.println("Variable 1 is " + variable1);
        System.out.println("Variable 2 is " + variable2);
        System.out.println("Variable 3 is " + variable3);
        int sum = variable1 + variable2 + variable3;
        System.out.println("Sum is " + sum);
        int[] result = new int[3];
//        int[] numbers = {variable1, variable2, variable3}
        result[0] = variable1;
        result[1] = variable2;
        result[2] = variable3;

        System.out.println("My variables are " + Arrays.toString(result));
    }
}
