// Step 4: Client Code
public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaAdapter();
        mediaPlayer.play("audio", "song.mp3");
        mediaPlayer.play("video", "movie.mp4");
    }
}
