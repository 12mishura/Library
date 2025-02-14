import BookManager.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BookManager manager = new BookManager();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String command = scanner.nextLine();
            switch (command) {
                case "list":
                    manager.list();
                    break;
                case "add":
                    System.out.println("Enter the name of the book");
                    String book = scanner.nextLine();
                    System.out.println("Enter the writter");
                    String writter = scanner.nextLine();
                    System.out.println("Enter the short description of the book");
                    String desciption = scanner.nextLine();
                    System.out.println("Enter  the type of the book (paper/audio/interactive)");
                    String type = scanner.nextLine().toUpperCase();
                    manager.add(book, writter, desciption, type);
                    break;
                case "remove":
                    System.out.println("Enter the name of the book to remove it");
                    String name = scanner.nextLine();
                    manager.remove(name);
                    break;
                default:
                    System.out.println("Unknown command!");
                    break;
            }
        }
    }
}