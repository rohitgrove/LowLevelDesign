import java.util.List;

// Step 3: Concrete Iterator for LinkedList

public class LinkedListIterator implements Iterator {
    private List<String> videos;
    private int index = 0;

    public LinkedListIterator(List<String> videos) {
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