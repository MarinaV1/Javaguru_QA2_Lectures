package lecture2;

import java.util.Random;

public class Exercise1 {

    public static void main(String[] args) {
//        String name = "Konstantins";
//        System.out.println("Hello, my name is " + name);

//        int a = 10;
//        int b = 4;
//        double result = a / (double) b;
//        System.out.println("result " + result);

        Random randomVariable = new Random();
        int randomNumber = randomVariable.nextInt(101);
        int randomNumber2 = randomVariable.nextInt(101);
        int randomNumber3 = randomVariable.nextInt(101);
        int result = randomNumber + randomNumber2 + randomNumber3;
        System.out.println("First Random Number is " + randomNumber);
        System.out.println("Second Random Number is " + randomNumber2);
        System.out.println("Third Random Number is " + randomNumber3);
        System.out.println("result is " + result);

    }
}
