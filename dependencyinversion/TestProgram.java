package dependencyinversion;

public class TestProgram {
    public static void main(String[] args) {

        //sample use case where student borrows a book and newspaper

        Student student = new Student();
        Resource book = new Book("Chess Tips");
        Resource newspaper = new Newspaper("Manila Bulletin");

        student.borrowResource(book);
        student.borrowResource(newspaper);


        //output:
        //A student borrowed a book named Chess Tips
        //A student borrowed a Manila Bulletin newspaper
    }
}
