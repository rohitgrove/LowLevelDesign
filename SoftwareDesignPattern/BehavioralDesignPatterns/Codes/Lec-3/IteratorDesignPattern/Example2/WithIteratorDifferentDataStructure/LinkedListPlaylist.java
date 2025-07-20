import java.util.LinkedList;
import java.util.List;

// Step 7: Concrete Collection for LinkedList

public class LinkedListPlaylist implements PlaylistCollection {
    private List<String> videos = new LinkedList<>();

    public void addVideo(String video) {
        videos.add(video);
    }

    @Override
    public Iterator createIterator() {
        return new LinkedListIterator(videos);
    }
}