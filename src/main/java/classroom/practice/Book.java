package classroom.practice;

import lombok.*;

@ToString
@AllArgsConstructor
@Builder
public class Book {

    @Getter
    public String isbn;
    @Getter
    public String name;
    @Getter
    @Setter
    public double price;
    @Getter
    @Setter
    public int qty = 0;
    Author author;

    public Book(String isbn, String name, int qty, Author author) {
        this.isbn = isbn;
        this.name = name;
        this.qty = qty;
        this.author = author;
    }

    public String getAuthor() {
        return author.getName();
    }
}
