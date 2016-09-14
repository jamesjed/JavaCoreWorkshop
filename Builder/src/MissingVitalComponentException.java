/**
 * Created by janatana on 9/14/2016.
 */
public class MissingVitalComponentException extends Exception {

    public MissingVitalComponentException(String reason, String statement){
        super(reason + " " + statement);
    }

    public MissingVitalComponentException(String reason, String statement, Throwable cause){
        super(reason + " " + statement, cause);
    }

}
