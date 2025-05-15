package src;
import java.util.List;

public class Playlist {
    private String playlistID;
    private String playlistName;
    private User creator;
    private List<Video> videos;

    // Constructor
    public Playlist(String playlistID, String playlistName, User creator, List<Video> videos) {
        this.playlistID = playlistID;
        this.playlistName = playlistName;
        this.creator = creator;
        this.videos = videos;
    }

    // Getters and Setters
    public String getPlaylistID() {
        return playlistID;
    }

    public void setPlaylistID(String playlistID) {
        this.playlistID = playlistID;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }
}

