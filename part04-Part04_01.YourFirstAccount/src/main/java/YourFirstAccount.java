
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account xinsAccount = new Account("Xin's account", 100.00);
        

        System.out.println("Initial state");
        System.out.println(xinsAccount);

        xinsAccount.deposit(20);
        System.out.println("The balance of Xin's account is now: " + xinsAccount);

        System.out.println("End state");
        System.out.println(xinsAccount);
    }
}
