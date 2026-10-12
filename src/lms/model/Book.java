package lms.model;

public class Book extends LibraryItem {

    private String author;

    public Book(String id, String title, String author) {
        super(id, title);
        setAuthor(author);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Author cannot be blank");
        }

        this.author = author;
    }
}