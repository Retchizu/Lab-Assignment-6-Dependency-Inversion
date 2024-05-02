package dependencyinversion;

public class Book implements Resource{
    private String bookTitle;

    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public void borrow() {
        System.out.println("A student borrowed a book named "+bookTitle);
    }

    //getters and setters
    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
}
