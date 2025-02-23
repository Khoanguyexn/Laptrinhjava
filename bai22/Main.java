package bai22;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("John Wick", "john@example.com", 'm');
        Author author2 = new Author("Robert Lee", "robert@example.com", 'f');

        Author[] authors = {author1, author2};
        Book book = new Book("Java Programming", authors, 29.99, 10);

        System.out.println(book);
        System.out.println("Author names: " + book.getAuthorNames());
    }

}