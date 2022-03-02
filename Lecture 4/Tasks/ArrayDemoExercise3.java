package lecture4;

public class ArrayDemoExercise3 {

    public static void main(String[] args) {
        int[] numbers = {41, 12, 20, 3, 44, 35, 64, 71};
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }

        }
        System.out.println("The min is " + min);

    }
}
