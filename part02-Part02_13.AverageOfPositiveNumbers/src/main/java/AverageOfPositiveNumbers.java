
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numberOfPositives = 0;
        int numberOfNegatives = 0;
        int sum = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            
            int numberFromUser = Integer.valueOf(scanner.nextLine());

            
            if (numberFromUser == 0) {
                break;
            }

            if (numberFromUser > 0) {
                numberOfPositives = numberOfPositives + 1;
                sum = sum + numberFromUser;
            }
            
            if (numberFromUser < 0) {
                numberOfNegatives = numberOfNegatives + 1;
            }
        }
        
        
        
        if(numberOfPositives == 0 && numberOfNegatives == 0 && sum == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double averageOfPositives = 1.0 * sum / numberOfPositives;
            System.out.println(averageOfPositives);
        }

    }
}
