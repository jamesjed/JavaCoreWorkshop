/**
 * Created by janatana on 9/19/2016.
 */
public class LongerThanThres implements StringCriterion {

    private int threshold;

    public LongerThanThres(int thres){
        this.threshold = thres;
    }

    @Override
    public boolean test(Object object) {
        if(object.toString().length() > this.threshold)
            return true;
        else
            return false;
    }
}
