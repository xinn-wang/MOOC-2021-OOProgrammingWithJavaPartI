
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }
            if (number != 0) {
                sumOfNumbers = sumOfNumbers + number;
            }
        }
        System.out.println("Sum of the numbers: " + sumOfNumbers);
    }
}
