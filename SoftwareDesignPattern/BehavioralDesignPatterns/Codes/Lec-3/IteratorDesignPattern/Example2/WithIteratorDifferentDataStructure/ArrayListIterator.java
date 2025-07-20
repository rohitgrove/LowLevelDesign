import java.util.List;

// Step 2: Concrete Iterator for ArrayList

public class ArrayListIterator implements Iterator {
    private List<String> videos;
    private int index = 0;

    public ArrayListIterator(List<String> videos) {
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