package BookManager;

import java.util.ArrayList;

public class BookManager {
    ArrayList<Book> list = new ArrayList<>();
    ArrayList<PaperBook> paper_list = new ArrayList<>();
    ArrayList<AudioBook> audio_list = new ArrayList<>();
    ArrayList<InteractiveBook> interactive_list = new ArrayList<>();

    // lists
    public void list() {
        if (list.isEmpty()) {
            System.out.println("No books available");
        } else {
            for (Book books : list) {
                System.out.println(books.toString());
            }
        }
    }

    public void paperlist() {
        if (list.isEmpty()) {
            System.out.println("No books available");
        } else {
            for (Book books : list) {
                System.out.println(books.toString());
            }
        }
    }

    public void audiolist() {
        if (list.isEmpty()) {
            System.out.println("No books available");
        } else {
            for (Book books : list) {
                System.out.println(books.toString());
            }
        }
    }

    public void interactivelist() {
        if (list.isEmpty()) {
            System.out.println("No books available");
        } else {
            for (Book books : list) {
                System.out.println(books.toString());
            }
        }
    }

    // add

    public void add(String name, String writter, String description, String type) {
        if (type.equals(Type.AUDIO.name())) {
            AudioBook audiobook = new AudioBook(type, writter, description);
            list.add(audiobook);
            audio_list.add(audiobook);
        } else if (type.equals(Type.INTERACTIVE.name())) {
            InteractiveBook interactivebook = new InteractiveBook(type, writter, description);
            list.add(interactivebook);
            interactive_list.add(interactivebook);
        } else if (type.equals(Type.PAPER.name())) {
            PaperBook paperbook = new PaperBook(type, writter, description);
            list.add(paperbook);
            paper_list.add(paperbook);
        } else {
            System.out.println("You can not add a book with this type");
        }
    }

}