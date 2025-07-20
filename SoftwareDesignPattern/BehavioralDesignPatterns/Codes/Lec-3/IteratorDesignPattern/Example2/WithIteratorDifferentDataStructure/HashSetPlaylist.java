import java.util.HashSet;
import java.util.Set;

// Step 8: Concrete Collection for HashSet
public class HashSetPlaylist implements PlaylistCollection {
    private Set<String> videos = new HashSet<>();

    public void addVideo(String video) {
        videos.add(video);
    }

    @Override
    public Iterator createIterator() {
        return (Iterator) new HashSetIterator(videos);
    }
}
