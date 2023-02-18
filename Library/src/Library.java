public class Library {
    /*
     * Написать программу - реализацию книжного шкафа в библиотеке.
     * Должны иметь возможность добавлять \ удалять книги.
     * Узнать кол-во книг
     * При запросе сообщить есть ли такая книга у нас или нет
     * Делаем с принципом инкапсуляции. Используем геттеры, сеттеры, конструкторы
     */
    public static void main(String[] args) {
        Bookcase bookcase = new Bookcase("Фантастика", 20);
        Book book1 = new Book("Игра престолов", "Джордж Р. Р. Мартин", 1996, 1000);
        Book book2 = new Book("Битва королей", "Джордж Р. Р. Мартин", 1998, 1010);
        Book book3 = new Book("Буря мечей", "Джордж Р. Р. Мартин", 2000, 1300);
        bookcase.addBook(book1);
        bookcase.removeBook(book1);
        bookcase.addBook(book2);
        bookcase.addBook(book3);
        System.out.println(bookcase);
        bookcase.numberOfBooks();
        bookcase.getBookByName("буря мечей");


    }
}