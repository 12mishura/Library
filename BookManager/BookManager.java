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
            for (Book books : paper_list) {
                System.out.println(books.toString());
            }
        }
    }

    public void audiolist() {
        if (list.isEmpty()) {
            System.out.println("No books available");
        } else {
            for (Book books : audio_list) {
                System.out.println(books.toString());
            }
        }
    }

    public void interactivelist() {
        if (list.isEmpty()) {
            System.out.println("No books available");
        } else {
            for (Book books : interactive_list) {
                System.out.println(books.toString());
            }
        }
    }

    // add

    public void add(String name, String writter, String description, String type) {
        if (type.equals(Type.AUDIO.toString())) {
            AudioBook audiobook = new AudioBook(name, writter, description);
            list.add(audiobook);
            audio_list.add(audiobook);
        } else if (type.equals(Type.INTERACTIVE.toString())) {
            InteractiveBook interactivebook = new InteractiveBook(name, writter, description);
            list.add(interactivebook);
            interactive_list.add(interactivebook);
        } else if (type.equals(Type.PAPER.toString())) {
            PaperBook paperbook = new PaperBook(name, writter, description);
            list.add(paperbook);
            paper_list.add(paperbook);
        } else {
            System.out.println("You can not add a book with this type");
        }
    }

    // remove

    public void remove(String name) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (name.equals(list.get(i).getBook())) {
                list.remove(i);
            }
        }

        for (int i = audio_list.size() - 1; i >= 0; i--) {
            if (name.equals(audio_list.get(i).getBook())) {
                audio_list.remove(i);
            }
        }

        for (int i = paper_list.size() - 1; i >= 0; i--) {
            if (name.equals(paper_list.get(i).getBook())) {
                paper_list.remove(i);
            }
        }

        for (int i = interactive_list.size() - 1; i >= 0; i--) {
            if (name.equals(interactive_list.get(i).getBook())) {
                interactive_list.remove(i);
            }
        }

        System.out.println("Book removed");
    }

    // Search by Book or Writter

    public void find(String bookorname) {
        if (list.isEmpty()) {
            System.out.println("No books in the library");
        } else {
            for (Book book : list) {
                if (bookorname.equals(book.getBook()) || bookorname.equals(book.getWritter())) {
                    System.out.println(book.toString());
                } else {
                    System.out.println("No book with this name or writter");
                }
            }
        }
    }
}