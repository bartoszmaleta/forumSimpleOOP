package app;

public class Comment extends Entry {

    public boolean isModerated = false;
    
    public Comment(String message) {
        super(message);
    }
}
