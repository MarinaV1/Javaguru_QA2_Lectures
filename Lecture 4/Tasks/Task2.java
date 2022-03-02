package lecture4;

public class Task2 {
    public static void main(String[] args) {
        int dice1;
        int dice2;
        int dice3;
        int counter = 0;
        do {
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;
            dice3 = (int) (Math.random() * 6) + 1;
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);
            System.out.println("Dice 3: " + dice3);
            counter++;
            System.out.println("Try number " + counter);
        }while ((dice1 != dice2) | (dice2 != dice3));
        System.out.println("You have won the game. It took you " + counter + " tries");
    }
}
