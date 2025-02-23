package bai2_3;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("John Wick", "John@example.com");
        Book book = new Book("123-456-789", "Java Basics", author, 19.99, 5);

        System.out.println(book);
        System.out.println("Author Name: " + book.getAuthorName());

    }

}