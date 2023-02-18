import java.util.ArrayList;
import java.util.List;

public class Bookcase {
    private String name;
    private List<Book> books = new ArrayList<>();
    ;
    private int maxValueOfBooks;

    public Bookcase(String name, int maxValue) {
        this.name = name;
        this.maxValueOfBooks = maxValue;
    }

    public void addBook(Book book) {
        if (books.size() < maxValueOfBooks) {
            books.add(book);
        } else {
            System.out.println("Шкаф переполнен, вы не можете добавить еще одну книгу");
        }
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void numberOfBooks() {
        System.out.println("Количество книг в шкафу " + name + ": " + books.size());
    }

    public void getBookByName(String name) {
        for (Book book : books) {
            if (name.equalsIgnoreCase(book.getName())) {
                System.out.println("Книга '" + name + "' есть в наличии");
                return;
            }
        }
        System.out.println("Книги '" + name + "' нет в наличии");
    }

    public String toString() {
        return "Книжный шкаф: " + name + ", перечень книг: " + books;
    }
}
