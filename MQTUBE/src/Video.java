package src;
public class Video {

        private String videoID;
        private String title;
        private String description;
        private String url;
        private String dateUploaded;
    
        // Constructor
        public Video(String videoID, String title, String description, String url, String dateUploaded) {
            this.videoID = videoID;
            this.title = title;
            this.description = description;
            this.url = url;
            this.dateUploaded = dateUploaded;
        }
    
        // Getters and Setters
        public String getVideoID() {
            return videoID;
        }
    
        public void setVideoID(String videoID) {
            this.videoID = videoID;
        }
    
        public String getTitle() {
            return title;
        }
    
        public void setTitle(String title) {
            this.title = title;
        }
    
        public String getDescription() {
            return description;
        }
    
        public void setDescription(String description) {
            this.description = description;
        }
    
        public String getUrl() {
            return url;
        }
    
        public void setUrl(String url) {
            this.url = url;
        }
    
        public String getDateUploaded() {
            return dateUploaded;
        }
    
        public void setDateUploaded(String dateUploaded) {
            this.dateUploaded = dateUploaded;
        }
    }
    

