/**
 * Created by janatana on 9/13/2016.
 */
public interface GrantWithdrawalStrategy {

    public int withdraw(int overdraft, int withdrawalAmmount, int balance, int numWithdrawals, int withdrawalLimit);
}
