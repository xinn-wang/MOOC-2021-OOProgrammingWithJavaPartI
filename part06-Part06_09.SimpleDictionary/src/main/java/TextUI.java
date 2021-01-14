/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mac
 */
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye Bye!");
                break;
            } else if (command.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                this.dictionary.add(word, translation);
            } else if (command.equalsIgnoreCase("search")) {
                System.out.println("To be translated: ");
                String word = scanner.nextLine();
                String translationOfWord = this.dictionary.translate(word);
                if (translationOfWord == null) {
                    System.out.println("Word " + word + " was not found");
                } else {
                    System.out.println("Translation: " + this.dictionary.translate(word));
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
