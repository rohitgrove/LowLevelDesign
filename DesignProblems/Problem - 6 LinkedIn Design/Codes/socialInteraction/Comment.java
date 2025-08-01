package socialInteraction;

import java.util.List;
import person.User;

public abstract class Comment {
    private int commentId;
    private User commentOwner;
    private String text;
    private int totalReacts;
    private List<Comment> comments;

    public abstract boolean updateText();

    public int getCommentId() {
        return this.commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public User getCommentOwner() {
        return this.commentOwner;
    }

    public void setCommentOwner(User commentOwner) {
        this.commentOwner = commentOwner;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getTotalReacts() {
        return this.totalReacts;
    }

    public void setTotalReacts(int totalReacts) {
        this.totalReacts = totalReacts;
    }

    public List<Comment> getComments() {
        return this.comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}