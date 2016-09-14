/**
 * Created by janatana on 9/13/2016.
 */
public class SpySatellite implements Photographer{
    public void prepareScene(){

        System.out.println("Spy satellite photographer");
    }

    public String takePhotograph(){

        return "Pictures of failed North Korean nuke tests were taken";
    }
}
