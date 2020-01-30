package app;

import java.time.LocalDate;
import java.util.Random;

public abstract class Entry {
    public int id;
    public LocalDate creationDate;
    public String message;

    public String toString() {
        return "";      
    }
 
    
    public int generateId() {
        Random random = new Random();
        int generatedId = random.nextInt(Integer.MAX_VALUE);

        return generatedId;
    }
}