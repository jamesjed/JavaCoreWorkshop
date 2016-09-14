/**
 * Created by janatana on 9/13/2016.
 */
public class checkingWithdrawal implements GrantWithdrawalStrategy {

    public int withdraw(int overdraft, int withdrawalAmmount, int balance, int numWithdrawals, int withdrawalLimit){
        if(balance - withdrawalAmmount >= overdraft){
            if(numWithdrawals <= withdrawalLimit)
                return withdrawalAmmount;
            else
                return 0;
        }
        else {
            System.out.println("Overdraft exceeded withdrawal failure");
            return 0;
        }
    }

}
