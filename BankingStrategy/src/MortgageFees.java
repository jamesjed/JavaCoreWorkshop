/**
 * Created by janatana on 9/13/2016.
 */
public class MortgageFees implements ApplyFeesStrategy{

    // Check if a checking accounts withdrawal limit will be applied
    // Fee of $50 applied if withdrawals > 5
    public int applyWithdrawalFee(int numWithdrawals){
        System.out.println("Withdrawal fees not applicable to mortgage accounts");
        return 0;
    }
}
