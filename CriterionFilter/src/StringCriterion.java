import java.util.ArrayList;
import java.util.List;

/**
 * Created by janatana on 9/19/2016.
 */
public interface StringCriterion<T> {

    // Although the class is named stringCriterion it functions more of a general criterion

    public <U> boolean test(U object);
    public static <U> List<U> stringFilter(List<U> ls, StringCriterion<U> criteria){
        List<U> tempList = new ArrayList<U>();
        for (int i = 0; i < ls.size(); i++){
            if(criteria.test(ls.get(i))){
                tempList.add(ls.get(i));
            }
        }

        return tempList;
    }
}
