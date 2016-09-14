/**
 * Created by janatana on 9/13/2016.
 */
public class MortgageDeposit implements DepositStrategy{
    public int deposit(int amount){
        System.out.println("Cannot deposit to mortgage accounts");
        return 0;
    }
}
