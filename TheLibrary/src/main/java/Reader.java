import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Reader {
    private String fullName;
    private int libraryCardNumber;
    private String faculty;
    private LocalDate dateOfBirth;
    private String phoneNumber;

    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setLibraryCardNumber(int libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }


    static int readersCount;

    public Reader(String fullName, String faculty, LocalDate dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.libraryCardNumber = ++readersCount;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public Reader() {
    }

    public String getFullName() {
        return fullName;
    }

    public void takeBook(int booksAmountToTake) {
        System.out.printf("%s взял %d книги%n", getFullName(), booksAmountToTake);
    }

    public void takeBook(String... booksNameToTake) {
        String books = String.join(", ", booksNameToTake);
        System.out.printf("%s взял книги: %s%n", getFullName(), books);
    }

    public void takeBook(Book... booksToTake) {
        String books = String.join(", ", Stream.of(booksToTake).map(Book::getTitle).toArray(String[]::new));
        System.out.printf("%s взял книги: %s%n", getFullName(), books);
    }

    public void returnBook(int booksAmountToReturn) {
        System.out.printf("%s вернул %d книги%n", getFullName(), booksAmountToReturn);
    }

    public void returnBook(String... booksNameToReturn) {
        String books = String.join(", ", booksNameToReturn);
        System.out.printf("%s вернул книги: %s%n", getFullName(), books);
    }

    public void returnBook(Book... booksToReturn) {
        String books = String.join(", ", Stream.of(booksToReturn).map(Book::getTitle).toArray(String[]::new));
        System.out.printf("%s вернул книги: %s%n", getFullName(), books);
    }
}
