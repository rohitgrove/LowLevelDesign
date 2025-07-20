import java.util.ArrayList;
import java.util.List;
// Step 6: Concrete Collection for ArrayList

public class ArrayListPlaylist implements PlaylistCollection {
    private List<String> videos = new ArrayList<>();

    @Override
    public void addVideo(String video) {
        videos.add(video);
    }

    @Override
    public Iterator createIterator() {
        return new ArrayListIterator(videos);
    }
}