abstract class Account{

    private long balance;
    private String holderName;

    public Account(){
        this.holderName = "init";
    }

    public Account(String name){
        this.holderName = name;
    }

    public void setName(String name){
        this.holderName = name;
    }

    public final void transaction(String msg, long amount){
        System.out.println(this.holderName + " " + msg + " " + amount);
        this.balance = this.balance + amount;
    }

    public long getBalance(){
        return this.balance;
    }

    public abstract boolean deposit(long amount);
    public abstract boolean withdraw(long amount);

}