package lecture4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {

    public static void main(String[] args) {

        Random randomVariable = new Random();
        int[] numbers = new int[15];
        for (int i = 0; i < numbers.length; i++) {
            int random = randomVariable.nextInt(1000) + 1;
            numbers[i] = random;
        }
        System.out.println("My array " + Arrays.toString(numbers));
        Statistics statistics = new Statistics();
        statistics.minValue(numbers);
        statistics.maxValue(numbers);
        statistics.averageValue(numbers);
    }


}
