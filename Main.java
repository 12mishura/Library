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
                    String book = scanner.nextLine();
                    String writter = scanner.nextLine();
                    String desciption = scanner.nextLine();
                    String type = scanner.nextLine().toUpperCase();
                    manager.add(book, writter, desciption, type);
                    break;
                default:
                    break;
            }
        }
    }
}