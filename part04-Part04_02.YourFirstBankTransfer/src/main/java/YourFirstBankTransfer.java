
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account matthewsAccount = new Account("Matthews account", 1000.00);
        Account myAccount = new Account("My account", 0.0);

        System.out.println("Initial state");
        System.out.println(matthewsAccount);
        System.out.println(myAccount);

        matthewsAccount.withdrawal(100.0);
        System.out.println("The balance of Arto's account is now: " + matthewsAccount);
        myAccount.deposit(100.0);
        System.out.println("The balance of Arto's other account is now: " + myAccount);

        System.out.println("End state");
        System.out.println(matthewsAccount);
        System.out.println(myAccount);
    }
}
