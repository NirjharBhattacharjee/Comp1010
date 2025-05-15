package src;
public class Main {
    public static void main(String[] args) {
        // Create a new User
        User user1 = new User("1", "Alice", "password123", "alice@mq.edu.au", "Student");
        
        // Create a new Video
        Video video1 = new Video("1", "Introduction to MqTube", "A brief intro to MqTube.", "http://video_url.com", "2025-05-07");
        
        // Create a new Channel
        Channel channel1 = new Channel("1", "Education Channel", user1, List.of(video1));
        
        // Test the functionality
        System.out.println("Channel: " + channel1.getChannelName() + " created by " + channel1.getCreator().getUsername());
        System.out.println("Video: " + video1.getTitle() + " uploaded by " + video1.getCreator().getUsername());
    }
}

