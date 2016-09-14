/**
 * Created by janatana on 9/13/2016.
 */
public class TrafficCam implements Photographer{

    public void prepareScene(){
        System.out.println("Traffic camera photographer");
    }

    public String takePhotograph(){
        return "Pictures of people running red lights were taken";
    }
}
