package BookManager;

abstract class Book {
    private String book;
    private String writter;
    private String description;
    private Type type; // Добавляем поле типа

    Book(String book, String writter, String description, Type type) {
        this.book = book;
        this.writter = writter;
        this.description = description;
        this.type = type;
    }

    // getters
    public String getBook() {
        return book;
    }

    public String getWritter() {
        return writter;
    }

    public String getDescription() {
        return description;
    }

    public Type getType() {
        return type;
    }

    // setters
    public void setBook(String newBook) {
        this.book = newBook;
    }

    public void setWritter(String newWritter) {
        this.writter = newWritter;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    @Override
    public String toString() {
        return "Book: " + book + ", Writter: " + writter + ", Description: " + description + ", Type: " + type;
    }
}

class PaperBook extends Book {
    PaperBook(String book, String writter, String description) {
        super(book, writter, description, Type.PAPER);
    }
}

class AudioBook extends Book {
    AudioBook(String book, String writter, String description) {
        super(book, writter, description, Type.AUDIO);
    }
}

class InteractiveBook extends Book {
    InteractiveBook(String book, String writter, String description) {
        super(book, writter, description, Type.INTERACTIVE);
    }
}