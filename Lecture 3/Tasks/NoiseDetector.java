package lecture3;

public class NoiseDetector {

    public static void main(String[] args) {
        int noiseLevel = 23;
        noiseDetector(noiseLevel);
    }

    public static void noiseDetector(int noiseLevel) {
        if (noiseLevel < 39) {
            System.out.println("Faint");
        } else if ((noiseLevel >= 40) && (noiseLevel <= 69)) {
            System.out.println("Moderate");
        } else if ((noiseLevel >= 70) && (noiseLevel <= 99)) {
            System.out.println("Very Loud");
        } else if ((noiseLevel >= 100) && (noiseLevel <= 129)) {
            System.out.println("Extremely Loud");
        } else {
            System.out.println("Painful");
        }
    }
}
