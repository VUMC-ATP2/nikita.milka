package classroom.practice;

public class Example {
    public static void main(String[] args) {

        Author author = new Author("J.K. Rowling", "dontwriteme@gmail.com");

        Book harryPotter = new Book("9780939173570", "Harry Potter and the Deathly Hallows",
                50.00, 10, new Author("J.K. Rowling", "dontwriteme@gmail.com"));

        Book harryPotter2 = new Book("9780939173570", "Harry Potter and the Deathly Hallows",
                50.00, 10, author);

        System.out.println(harryPotter);
        System.out.println("Book author is: " + harryPotter.getAuthor());


        // @Builder annotation created Builder for Book class
        Book builderBook = Book.builder()
                .name("Harry Potter and the Deathly Hallows")
                .isbn("9780939173570")
                .price(60.00)
                .qty(10)
                .author(author).build();

        System.out.println(builderBook);


    }
}
