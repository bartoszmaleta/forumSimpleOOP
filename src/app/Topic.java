package app;

import java.util.ArrayList;

public class Topic extends Entry {
    public String title;
    public ArrayList<Comment> comments;

    public Topic(String titleOfTopic, ArrayList<Comment> commentsInTopic) {
        this.title = titleOfTopic;
        this.comments = commentsInTopic;
    }
}