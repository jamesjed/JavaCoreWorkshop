public class CheckingAccount extends Account{

    private long overdraft;
    private String name;

    public CheckingAccount(String name, long overdraft){
        this.overdraft = overdraft;
        setName(name);
    }

    public boolean deposit(long amount){
        transaction("Checking deposit", amount);
        return true;
    }

    public boolean withdraw(long amount){
        if(getBalance() - amount >= this.overdraft){
            transaction("Checking withdrawal", amount*-1);
            return true;
        }
        System.out.println("Overdraft " + this.overdraft + " exceeded");
        return false;
    }
}