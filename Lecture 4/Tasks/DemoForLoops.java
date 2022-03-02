package lecture4;

public class DemoForLoops {

    public static void main(String[] args) {
        int myIndex = 0;
        while (myIndex < 0) {
            System.out.println("While Element i= " + myIndex);
            myIndex++; //myIndex = myIndex + 1;
            if (myIndex == 10) {
                break;
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Element i= " + i);
        }
        int index = 0;
        do {
            System.out.println("Do while Element i= " + index);
            index++;
        } while (index<0);
    }
}
