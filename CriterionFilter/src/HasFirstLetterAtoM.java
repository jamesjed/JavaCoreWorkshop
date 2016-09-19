/**
 * Created by janatana on 9/19/2016.
 */
public class HasFirstLetterAtoM implements StringCriterion {

    @Override
    public boolean test(Object object) {
        char startChar = object.toString().charAt(0);

        // Use ascii hex to check for char range between capital A to capital M
        if(startChar >= 0x41 && startChar <= 0x4D){
            return true;
        }
        else
            return false;
    }
}
