
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Statistics first = new Statistics();
        Statistics second = new Statistics();
        Statistics third = new Statistics();
        
        System.out.println("Enter numbers: ");
        
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
                   
            if (input == -1) {
                break;
            }
                            
            first.addNumber(input);
            
            if(input % 2 == 0){
                second.addNumber(input);
            }
            
            if(input % 2 == 1){
                third.addNumber(input);
            }
        }
//        first.addNumber(3);
//        first.addNumber(5);
//        first.addNumber(1);
//        first.addNumber(2);
                
        //System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + first.sum());
        System.out.println("Average: " + first.average());
        System.out.println("Sum of even numbers: " + second.sum());
        System.out.println("Sum of odd numbers: " + third.sum());
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
    }
}
