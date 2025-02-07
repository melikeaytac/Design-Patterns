public class MusicPlayer {
    private static MusicPlayer uniqueInstance;

    private MusicPlayer(){}

    public static synchronized MusicPlayer getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new MusicPlayer();
        }
        return uniqueInstance;
    }

    public void playMusic(){
        System.out.println("Music is playing...");
    }

    public void addToPlaylist(){
        System.out.println("Song is added to the playlist.");
    }

    public void removeFromPlaylist(){
        System.out.println("Song is removed to the playlist.");

    }

    public void showPlaylist(){
        System.out.println("Songs are listed.");
    }
}
