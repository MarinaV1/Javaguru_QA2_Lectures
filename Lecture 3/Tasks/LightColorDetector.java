package lecture3;

public class LightColorDetector {

    public String detect(int waveLenght) {
        String result = "";
        if ((waveLenght >= 380) && (waveLenght <= 449)) {
            result = "Violet";
        } else if ((waveLenght >= 450) && (waveLenght <= 494)) {
            result = "Blue";
        } else if ((waveLenght >= 495) && (waveLenght <= 569)) {
            result = "Green";
        } else if ((waveLenght >= 570) && (waveLenght <= 589)) {
            result = "Yellow";
        } else if ((waveLenght >= 590) && (waveLenght <= 619)) {
            result = "Orange";
        } else if ((waveLenght >= 620) && (waveLenght <= 750)) {
            result = "Red";
        } else {
            result = "Invisible light";
        }
        return result;
    }
}
