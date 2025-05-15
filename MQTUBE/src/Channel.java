package src;
    import java.util.List;

public class Channel {
    private String channelID;
    private String channelName;
    private User creator; // User who created the channel
    private List<Video> videos; // List of videos in the channel

    // Constructor
    public Channel(String channelID, String channelName, User creator, List<Video> videos) {
        this.channelID = channelID;
        this.channelName = channelName;
        this.creator = creator;
        this.videos = videos;
    }

    // Getters and Setters
    public String getChannelID() {
        return channelID;
    }

    public void setChannelID(String channelID) {
        this.channelID = channelID;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
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


