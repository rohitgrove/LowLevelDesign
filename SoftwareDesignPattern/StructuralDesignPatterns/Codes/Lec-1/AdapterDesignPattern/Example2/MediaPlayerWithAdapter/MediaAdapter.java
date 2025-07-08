// Step 3: Adapter Class
public class MediaAdapter implements MediaPlayer {
    private AudioPlayer audioPlayer = new AudioPlayer();
    private VideoPlayer videoPlayer = new VideoPlayer();

    @Override
    public void play(String mediaType, String fileName) {
        if (mediaType.equalsIgnoreCase("audio")) {
            audioPlayer.playAudio(fileName);
        } else if (mediaType.equalsIgnoreCase("video")) {
            videoPlayer.playVideo(fileName);
        } else {
            System.out.println("Invalid media type: " + mediaType);
        }
    }
}