public class Main{
    public static void main(String[] args){
        Account[] accArray = new Account[3];
        accArray[0] = new MortgageAccount("Sejong", 100000);
        accArray[1] = new CheckingAccount("Peter", 200);
        accArray[2] = new CheckingAccount("Justinian", 1000);

        for(int i = 0; i < 3; i++){
            accArray[i].deposit(1000);
            System.out.println(accArray[i].getBalance());
            accArray[i].withdraw(500);
            System.out.println(accArray[i].getBalance());
            accArray[i].withdraw(1000);
            accArray[i].withdraw(2000);
        }

        System.out.println(accArray[0].getBalance());
        System.out.println(accArray[1].getBalance());
        System.out.println(accArray[2].getBalance());
    }
}