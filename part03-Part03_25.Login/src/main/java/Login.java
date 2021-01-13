
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] userNames = {"alex","emma"};
        String[] passWords = {"sunshine","haskell"};
        
        System.out.print("Enter Username: ");
        String enteredName = scanner.nextLine();
        System.out.print("Enter password: ");
        String enteredPassWord = scanner.nextLine();
        if (userNames[0].equals(enteredName) && passWords[0].equals(enteredPassWord)) {
            System.out.println("You have successfully logged in!");
        } else if (userNames[1].equals(enteredName) && passWords[1].equals(enteredPassWord)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
