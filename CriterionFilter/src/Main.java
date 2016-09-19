import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by janatana on 9/19/2016.
 */
public class Main {

    public static List<String> getLongStrings(List<String> ls, int threshold){
        List<String> tempList = new ArrayList<String>();
        for(int i = 0; i < ls.size(); i++) {
            if (ls.get(i).length() > threshold)
                tempList.add(ls.get(i));
        }
        return tempList;
    }

    public static void main(String[] args){
        List<String> ls = Arrays.asList( "Fred", "Jim", "William", "Susannah", "Lucy", "Orinoco", "Toby");
        StringCriterion longThres = new LongerThanThres(6);
        StringCriterion letterRange = new HasFirstLetterAtoM();
        StringCriterion eqThres = new EqualsThres(3);

        List<String> longList = StringCriterion.stringFilter(ls, longThres);
        List<String> charList = StringCriterion.stringFilter(ls, letterRange);
        List<String> eqList = StringCriterion.stringFilter(ls, eqThres);

        assert longList.size() == 3;
        assert charList.size() == 3;
        assert eqList.size() == 1;

        List<Integer> intLs = Arrays.asList(1,2,3,4,5,6,7,800,90000000);
        List<Integer> longListInt = StringCriterion.stringFilter(intLs, longThres);
        List<Integer> charListInt = StringCriterion.stringFilter(intLs, letterRange);
        List<Integer> eqListInt = StringCriterion.stringFilter(intLs, eqThres);

        assert longListInt.size() == 1;
        assert charListInt.size() == 0;
        assert eqListInt.size() == 1;

    }
}
