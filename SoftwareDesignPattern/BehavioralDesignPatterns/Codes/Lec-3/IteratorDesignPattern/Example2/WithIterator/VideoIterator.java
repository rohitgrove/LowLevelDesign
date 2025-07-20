import java.util.List;

// Step 2: Concrete Iterator Class
public class VideoIterator implements Iterator {
    private List<String> videos;
    private int index = 0;

    public VideoIterator(List<String> videos) {
        this.videos = videos;
    }

    @Override
    public boolean hasNext() {
        return index < videos.size();
    }

    @Override
    public String next() {
        if (hasNext()) {
            return videos.get(index++);
        }
        return null;
    }
}