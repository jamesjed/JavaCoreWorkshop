/**
 * Created by janatana on 9/13/2016.
 */
public class mortgageWithdrawal implements GrantWithdrawalStrategy{

    public int withdraw(int overdraft, int withdrawalAmmount, int balance, int numWithdrawals, int withdrawalLimit){
        System.out.println("Cannot withdraw from mortgage accounts.");
        return 0;
    }
}
