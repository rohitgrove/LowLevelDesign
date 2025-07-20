import java.util.ArrayList;
import java.util.List;

// Step 4: Concrete Collection Class
public class Playlist implements PlaylistCollection {
    private List<String> videos = new ArrayList<>();

    public void addVideo(String video) {
        videos.add(video);
    }

    @Override
    public Iterator createIterator() {
        return new VideoIterator(videos);
    }
}