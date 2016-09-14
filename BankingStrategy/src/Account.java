/**
 * Created by janatana on 9/13/2016.
 */
public class Account {

    private int balance;
    private int overdraft;
    private int numWithdrawals;
    private int withdrawalLimit;
    private String holderName;

    GrantWithdrawalStrategy grantWithdrawal;
    ApplyFeesStrategy applyFees;
    DepositStrategy depositStrat;

    // Account class default constructor
    public Account(){
        this.holderName = "name not set";
        this.balance = 0;
        this.overdraft = 0;
        this.numWithdrawals = 0;
        this.withdrawalLimit = 1;
    }

    // Constructor that allows user to differentiate account behavior
    public Account(GrantWithdrawalStrategy grantWithdrawalStrat, ApplyFeesStrategy applyFeesStrat, DepositStrategy depositStrat, String name, int withdrawalLimit, int overdraft){
        this.holderName = name;
        this.grantWithdrawal = grantWithdrawalStrat;
        this.applyFees = applyFeesStrat;
        this.depositStrat = depositStrat;
        this.withdrawalLimit = withdrawalLimit;
        this.overdraft = overdraft;
    }

    // Allows user to change how the account withdraws money
    public void changeWithdrawalStrategy(GrantWithdrawalStrategy strategy){
        this.grantWithdrawal = strategy;
    }

    // Allows user to change how the account applies fees
    public void changeFeeStrategy(ApplyFeesStrategy strategy){
        this.applyFees = strategy;
    }

    // Returns amount of money to be withdrawn plus any withdrawal fees
    public void withdraw(int ammount){
        int withdrawAmmount = grantWithdrawal.withdraw(overdraft, ammount, this.balance, numWithdrawals, withdrawalLimit);
        int withdrawalFees = applyFees.applyWithdrawalFee(numWithdrawals);
        numWithdrawals++;
        transaction("amount withdrawn:", -1 * (withdrawAmmount + withdrawalFees));
    }

    // Get current account balance
    public void deposit(int amount){
        transaction("amount deposited:", this.depositStrat.deposit(amount));
    }

    // Get name of account holder
    public String getHolderName(){
        return this.holderName;
    }

    // Set name of the account holder
    public void setName(String name){
        this.holderName = name;
    }

    public void getBalance(){
        System.out.println("The current account balance for: " + this.holderName + " is " + this.balance);
    }

    // Apply transaction to account
    private final void transaction(String msg, int ammount){
        System.out.println(this.holderName + " " + msg + " " + ammount);
        this.balance = this.balance + ammount;
    }

}
