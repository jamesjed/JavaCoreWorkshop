/**
 * Created by janatana on 9/13/2016.
 */
public class checkingFees implements ApplyFeesStrategy {

    // Check if a checking accounts withdrawal limit will be applied
    // Fee of $50 applied if withdrawals > 5
    public int applyWithdrawalFee(int numWithdrawals){
        if(numWithdrawals > 5) {
            System.out.println("$50 fee applied for exceeding 5 withdrawals");
            return 50;
        }
        else {
            System.out.println("No withdrawal fees applied");
            return 0;
        }
    }
}
