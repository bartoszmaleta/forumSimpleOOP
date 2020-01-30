package app;

import java.time.LocalDate;
import java.util.ArrayList;

public class Topic extends Entry {
    public String title;
    public ArrayList<Comment> comments;

    public Topic(String message, String titleOfTopic) {
        super(message);
        this.title = titleOfTopic;
        this.comments = new ArrayList<>();
        this.creationDate = LocalDate.now();
    }

    public void addComment(String commentContent) {
        comments.add(new Comment(commentContent));
    }

    
}