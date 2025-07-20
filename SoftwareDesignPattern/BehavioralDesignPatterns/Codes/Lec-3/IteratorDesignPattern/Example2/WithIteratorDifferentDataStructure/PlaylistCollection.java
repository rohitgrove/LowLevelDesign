// Step 5: Collection Interface (Aggregate)
public interface PlaylistCollection {
    public void addVideo(String video);

    public Iterator createIterator();
}