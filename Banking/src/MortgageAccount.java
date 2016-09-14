public class MortgageAccount extends Account{

    private String name;
    private long borrowed;

    public MortgageAccount(String name, long borrowed){
        setName(name);
        this.borrowed = borrowed;

        transaction("Initial borrowed amount ", borrowed);
    }

    public boolean deposit(long amount){
        transaction("Mortgage payment ", amount);
        return true;
    }

    public boolean withdraw(long amount){
        return false;
    }
}