package src;
import java.util.List;

public class System {
    private List<User> users;
    private List<Video> videos;
    private List<Channel> channels;
    private List<Playlist> playlists;

    // Methods for managing users, videos, channels, and playlists
    public void addUser(User user) {
        users.add(user);
    }

    public void addVideo(Video video) {
        videos.add(video);
    }

    public void addChannel(Channel channel) {
        channels.add(channel);
    }

    public void addPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }

    // Other necessary methods (e.g., search videos, create playlists, etc.)
}

