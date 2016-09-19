/**
 * Created by janatana on 9/19/2016.
 */
public class EqualsThres implements StringCriterion {

    private int threshold;

    public EqualsThres(int thres){
        this.threshold = thres;
    }

    @Override
    public boolean test(Object object) {
        if(object.toString().length() == threshold)
            return true;
        else
            return false;
    }
}
