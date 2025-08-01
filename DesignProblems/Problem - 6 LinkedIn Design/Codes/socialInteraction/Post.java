package socialInteraction;

import java.util.List;
import person.User;

public abstract class Post {
    private int postId;
    private User postOwner;
    private String text;
    private List<Character> media;
    private int totalReacts;
    private int totalShares;
    private List<Comment> comments;

    public abstract boolean updateText();

    public int getPostId() {
        return this.postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public User getPostOwner() {
        return this.postOwner;
    }

    public void setPostOwner(User postOwner) {
        this.postOwner = postOwner;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Character> getMedia() {
        return this.media;
    }

    public void setMedia(List<Character> media) {
        this.media = media;
    }

    public int getTotalReacts() {
        return this.totalReacts;
    }

    public void setTotalReacts(int totalReacts) {
        this.totalReacts = totalReacts;
    }

    public int getTotalShares() {
        return this.totalShares;
    }

    public void setTotalShares(int totalShares) {
        this.totalShares = totalShares;
    }

    public List<Comment> getComments() {
        return this.comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}