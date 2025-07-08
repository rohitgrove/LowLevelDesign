// Client code
public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.playAudio("song.mp3"); // This will work fine

        // Cannot play video files!
        // audioPlayer.playVideo("movie.mp4"); -> This won't work
    }
}
