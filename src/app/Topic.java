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

    public void moderateComment(int index) {
        comments.get(index).isModerated = true;
    }

    public ArrayList<Comment> getModeratedComments() {
        ArrayList<Comment> moderatedComents = new ArrayList<>();

        // FOR EACH
        // for (Comment comment : comments) {
        //     if (comment.isModerated) {
        //         moderatedComents.add(comment);
        //     }
        // }

        // FOR
        for (int i = 0; i < comments.size(); i++) {
            if (comments.get(i).isModerated) {
                moderatedComents.add(comments.get(i));
            }
        }

        return moderatedComents;
    }
}