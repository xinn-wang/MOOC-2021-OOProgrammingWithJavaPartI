import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<BooksInformation> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            String pages = scanner.nextLine();
            System.out.println("Publication year:");
            String publicationYear = scanner.nextLine();

            books.add(new BooksInformation(title, pages, publicationYear));

        }
        System.out.println("What information will be printed?");
        String input = scanner.nextLine();
        for (BooksInformation book : books){
            if (input.equals("everything")){
            System.out.println(book.toString());
            }else if (input.equals("name")){
            System.out.print(book.getTitle());
            }
        }
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

    }
}
