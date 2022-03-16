package lecture5;

import java.util.Scanner;


public class BallGameDemo {

    public static void main(String[] args) {
        int[] board = {0, 0, 0};
//        hide ball  on board
//        try until person enter 1-3
        System.out.println("Please enter number from 1-3 ");
        Scanner scanner = new Scanner(System.in);
        int personGuess = scanner.nextInt();
        System.out.println(personGuess);
//        Computer show the answer = where was the ball
//        if person guessed - write You have won else you lose!!
    }
}
