// Step 5: Client Code (Main Method)
public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addVideo("Video 1");
        playlist.addVideo("Video 2");
        playlist.addVideo("Video 3");

        Iterator iterator = playlist.createIterator();
        
        while (iterator.hasNext()) {
            System.out.println("Playing: " + iterator.next());
        }
    }
}
