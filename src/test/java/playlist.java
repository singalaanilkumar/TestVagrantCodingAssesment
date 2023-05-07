import org.testng.annotations.Test;

public class playlist {

    @Test
    public void setPlaylist() {
        RecentlyPlayed playlist = new RecentlyPlayed(3);
        playlist.playSong("S1");
        playlist.playSong("S2");
        playlist.playSong("S3");
        playlist.printPlaylist(); // [S1, S2, S3]
        playlist.playSong("S4");
        playlist.printPlaylist(); // [S2, S3, S4]
        playlist.playSong("S2");
        playlist.printPlaylist(); // [S3, S4, S2]
        playlist.playSong("S1");
        playlist.printPlaylist(); // [S4, S2, S1]
    }
}
