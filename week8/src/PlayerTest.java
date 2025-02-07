public class PlayerTest {
    public static void main(String[] args) {
        MusicPlayer mp = MusicPlayer.getInstance();
        mp.playMusic();
        mp.addToPlaylist();
        mp.removeFromPlaylist();
        mp.showPlaylist();
    }
}
