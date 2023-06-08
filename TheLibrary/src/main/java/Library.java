import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    static List<Reader> readers = new ArrayList<>();
    static List<Book> books = new ArrayList<>();

    static {
        init();
    }

    public static void main(String[] args) {
        runApp();
    }

    static void init() {
        Library.readers.add(new Reader("Петров", "Филология", LocalDate.of(1998, 5, 17), "987345"));
        Library.readers.add(new Reader("Иванов", "Информатика", LocalDate.of(2005, 10, 22), "456321"));
        Library.readers.add(new Reader("Сидоров", "Медицина", LocalDate.of(2000, 2, 8), "789012"));

        Library.books.add(new Book("Словарь", ""));
        Library.books.add(new Book("Приключения", ""));
        Library.books.add(new Book("Энциклопедия", ""));
        Library.books.add(new Book("Сказки", ""));
    }

    static void runApp() {
        int choice = 0;
        while (choice != 3) {
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("1 - зарегистрированный читатель");
                System.out.println("2 - новый читатель");
                System.out.println("3 - выйти");
                System.out.print("Введите ваш выбор 1-3: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("1 - зарегистрированный читатель");
                    System.out.println("2 - новый читатель");
                    System.out.println("3 - выйти");
                    System.out.println("Введите ваш выбор 1-3: ");
                    scanner.next();
                }
                choice = scanner.nextInt();
            } while (choice <= 0 || choice > 3);
            if (choice == 1) {
                existingReader();
            } else if (choice == 2) {
                newReader();
            }
        }
    }

    static void newReader() {
        Reader readerToAdd = new Reader();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите ваше имя ");
            readerToAdd.setFullName(scanner.nextLine());
            System.out.print("Введите ваш факультет ");
            readerToAdd.setFaculty(scanner.nextLine());
            System.out.print("Введите дату рождения(дд.мм.гггг) ");
            String dob = scanner.nextLine();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            readerToAdd.setDateOfBirth(LocalDate.parse(dob, dtf));
            System.out.print("Введите ваш номер телефона ");
            readerToAdd.setPhoneNumber(scanner.nextLine());
            readerToAdd.setLibraryCardNumber(Reader.readersCount + 1);
            Reader.readersCount++;
            Library.readers.add(readerToAdd);
            System.out.printf("Номер вашего читательского билета %d%n", readerToAdd.getLibraryCardNumber());
            System.out.println("Регистрация успешна, продолжите как зарегистрированный читатель");
        } catch (Exception e) {
            System.out.println("Что-то пошло не так, попробуйте снова");
        }
    }

    static void existingReader() {
        String name;
        int libraryCardNumber;
        Reader reader;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите ваше имя ");
            name = scanner.nextLine();
            System.out.print("Введите номер вашего читательского билета ");
            libraryCardNumber = scanner.nextInt();
            reader = checkReader(name, libraryCardNumber);
            if (reader != null) {
                takeOrReturnBook(reader);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static Reader checkReader(String name, int libraryCardNumber) throws Exception {
        for (Reader reader : Library.readers) {
            if (reader.getLibraryCardNumber() == libraryCardNumber && reader.getFullName().equals(name)) {
                return reader;
            }
        }
        throw new Exception("Читатель не найден");
    }

    static void takeOrReturnBook(Reader reader) throws Exception {
        System.out.println("1 - вернуть книги, 2 - взять книги ");
        Scanner scanner = new Scanner(System.in);
        try {
            int choice = scanner.nextInt();
            if (choice == 1) {
                returnBooks(reader);
            } else if (choice == 2) {
                takeBooks(reader);
            }
        } catch (Exception e) {
            throw new Exception("Вы ввели некорректный выбор");
        }
    }

    static void returnBooks(Reader reader) throws Exception {
        if (reader.getBooks().isEmpty()) {
            System.out.println("У вас нет книг");
            throw new Exception();
        }
        reader.returnBook(reader.getBooks().toArray(Book[]::new));
        Library.books.addAll(reader.getBooks());
        reader.getBooks().clear();
        reader.getBooks().stream().map(Book::getTitle).forEach(System.out::println);
    }

    static void takeBooks(Reader reader) throws Exception {
        Library.books.stream().map(Book::getTitle).forEach(System.out::println);
        System.out.println("Какую книгу взять? ");
        Scanner scanner = new Scanner(System.in);
        try {
            String bookTitle = scanner.next();
            Book book = Library.books.stream().filter(b -> b.getTitle().equals(bookTitle)).findAny().orElseThrow();
            reader.takeBook(book);
            reader.getBooks().add(book);
            Library.books.remove(book);
        } catch (Exception e) {
            throw new Exception("Вы ввели некорректный выбор");
        }
    }
}
