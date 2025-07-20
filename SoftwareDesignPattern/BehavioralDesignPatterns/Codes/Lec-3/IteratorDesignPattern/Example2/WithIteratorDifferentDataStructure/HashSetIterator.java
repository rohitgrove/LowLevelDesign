import java.util.Iterator;
import java.util.Set;

// Step 4: Concrete Iterator for HashSet

public class HashSetIterator implements Iterator {
    private Iterator<String> iterator;

    public HashSetIterator(Set<String> videos) {
        this.iterator = videos.iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public String next() {
        return iterator.hasNext() ? iterator.next() : null;
    }
}
