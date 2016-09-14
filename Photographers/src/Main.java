/**
 * Created by janatana on 9/13/2016.
 */
public class Main {
    public static void main(String[] args){
        Photographer[] photographerArray = new Photographer[3];
        photographerArray[0] = new Parent();
        photographerArray[1] = new TrafficCam();
        photographerArray[2] = new SpySatellite();

        for (int i = 0; i < 3; i++){
            photographerArray[i].prepareScene();
            System.out.println(photographerArray[i].takePhotograph());
        }
    }
}
