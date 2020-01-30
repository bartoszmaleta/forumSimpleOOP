package app;

import java.time.LocalDate;

public class Comment extends Entry {
    
    public Comment(String message) {
        this.message = message;
        this.id = generateId();
        this.creationDate = LocalDate.now();
    }
}
