public class Book {
    private final String title;
    private final Author author;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {

        this.title = title;
        this.publicationYear= publicationYear;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Author getAuthor() {
        return this.author;
    }
}
