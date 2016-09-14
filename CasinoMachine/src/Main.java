import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Main extends Thread{

    public enum state{ BAR, MEDAL, COIN, SMILEY, CHERRY }


    // Method takes random number and adds associated state to the state array
    public static void getWheelPicture(int randNum, ArrayList<state> array){

        switch(randNum){
            case 0: array.add(state.values()[0]);
                    break;
            case 1: array.add(state.values()[1]);
                    break;
            case 2: array.add(state.values()[2]);
                    break;
            case 3: array.add(state.values()[3]);
                    break;
            default: array.add(state.values()[4]);
                    break;
        }

    }

    public static void main(String[] args){

        // Array to store states
        ArrayList<state> pictureArray = new ArrayList<state>();

        // Spin the wheel three times
        for(int i = 0; i < 3; i++){
            getWheelPicture(ThreadLocalRandom.current().nextInt(6), pictureArray);
        }

        // Print states in the array
        System.out.println(pictureArray.get(0) + " : " + pictureArray.get(1) + " : " + pictureArray.get(2));
    }
}