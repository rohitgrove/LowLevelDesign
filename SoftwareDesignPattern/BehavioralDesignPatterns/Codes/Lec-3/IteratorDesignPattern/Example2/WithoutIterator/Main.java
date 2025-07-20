public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addVideo("Video 1");
        playlist.addVideo("Video 2");
        playlist.addVideo("Video 3");

        playlist.playAll(); // Manually iterating
    }
}
/*
 * OUTPUT:
 * Playing: Video 1
 * Playing: Video 2
 * Playing: Video 3
 */