import java.util.ArrayList;
import java.util.List;

public class Playlist {
    List<String> videos = new ArrayList<>();

    public void addVideo(String video) {
        videos.add(video);
    }

    public void playAll() {
        for (int i = 0; i < videos.size(); i++) {
            System.out.println("Playing: " + videos.get(i));
        }
    }
}