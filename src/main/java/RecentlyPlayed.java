import java.util.ArrayList;
import java.util.List;


public class RecentlyPlayed {
    private int capacity;
    private List<String> songs;

    public RecentlyPlayed(int capacity) {
        this.capacity = capacity;
        this.songs = new ArrayList<>();
    }

    public void playSong(String song) {
        if (songs.contains(song)) {
            songs.remove(song);
        } else if (songs.size() == capacity) {
            songs.remove(0);
        }
        songs.add(song);
    }

    public void printPlaylist() {
        System.out.println(songs);
    }
}