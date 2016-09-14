/**
 * Created by janatana on 9/13/2016.
 */
public class Main {
    public static void main(String[] args){

        GrantWithdrawalStrategy checkingWithStrat = new checkingWithdrawal();
        ApplyFeesStrategy checkingFeeStrat = new checkingFees();
        DepositStrategy depositStrat = new CheckingDeposit();

        GrantWithdrawalStrategy mortgageWithStrat = new mortgageWithdrawal();
        ApplyFeesStrategy mortgageFeeStrat = new MortgageFees();
        DepositStrategy mortgageDepositStrat = new MortgageDeposit();

        int overdraftLimit = 50;
        int withdrawLimit = 6;
        String name = "James Natanauan";

        Account bankAccount = new Account(checkingWithStrat, checkingFeeStrat, depositStrat, name, withdrawLimit, overdraftLimit);

        // Test basic withdrawals and deposits to checking account
        bankAccount.deposit(500);
        bankAccount.getBalance();
        bankAccount.deposit(500);
        bankAccount.getBalance();
        bankAccount.withdraw(500);
        bankAccount.getBalance();

        // Test withdrawal fee
        bankAccount.withdraw(10);
        bankAccount.getBalance();
        bankAccount.withdraw(10);
        bankAccount.getBalance();
        bankAccount.withdraw(10);
        bankAccount.getBalance();
        bankAccount.withdraw(10);
        bankAccount.getBalance();
        bankAccount.withdraw(10);
        bankAccount.getBalance();
        bankAccount.withdraw(10);
        bankAccount.getBalance();

        // Test successful change from checking to mortgage account
        bankAccount.changeWithdrawalStrategy(new mortgageWithdrawal());
        bankAccount.changeFeeStrategy(new MortgageFees());
        bankAccount.withdraw(10);
        bankAccount.getBalance();
    }
}
