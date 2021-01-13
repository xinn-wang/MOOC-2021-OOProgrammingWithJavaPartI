
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        System.out.print("Search for?\n");
        int search = Integer.valueOf(scanner.nextLine());
        for(int index = 0; index < list.size(); index++ ){
            if(list.get(index) == search){
                System.out.println(search + " is at index " + index);
            }
        }    
        

        // implement here finding the indices of a number
    }
}
