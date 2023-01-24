package personal.model;

import java.util.List;

public interface Library {
    List<Book> getAllBooks();
    String createBooks(Book book);
    void updateBook (Book book);
    Void deleteById (String inputId);
}
