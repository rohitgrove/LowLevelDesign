package person;

import javax.swing.GroupLayout.Group;
import javax.xml.stream.events.Comment;
import models.Observer;
import professionalComponents.CompanyPage;
import professionalComponents.Job;
import socialInteraction.ConnectionInvitation;
import socialInteraction.Message;
import socialInteraction.Post;

public abstract class User extends Person implements Observer {
    public abstract boolean sendMessage(Message message);

    public abstract boolean sendInvite(ConnectionInvitation invite);

    public abstract boolean cancelInvite(ConnectionInvitation invite);

    public abstract boolean createPage(CompanyPage page);

    public abstract boolean deletePage(CompanyPage page);

    public abstract boolean createGroup(Group group);

    public abstract boolean deleteGroup(Group group);

    public abstract boolean createPost(Post post);

    public abstract boolean deletePost(Post post);

    public abstract boolean createComment(Comment comment);

    public abstract boolean deleteComment(Comment comment);

    public abstract boolean react(Post post);

    public abstract boolean requestRecommendation(User user);

    public abstract boolean acceptRecommendation(User user);

    public abstract boolean applyForJob(Job job);

    public void update() {

    }
}
