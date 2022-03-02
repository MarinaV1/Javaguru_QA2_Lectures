package lecture4;

public class Statistics {

    public void maxValue(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Max value is " + max);
    }

    public void minValue(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Min value is " + min);
    }

    public void averageValue(int[] numbers) {
        double avg;
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        avg = sum / numbers.length;
        System.out.println("Average number is " + avg);
    }
}
