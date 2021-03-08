import java.util.ArrayList;

public class Disk {
    private ArrayList<Composition> Playlist;

    public ArrayList<Composition> getPlaylist() {
        return Playlist;
    }

    public void setPlaylist(ArrayList<Composition> playlist) {
        Playlist = playlist;
    }

    public void AddComposition(Composition comp) {
        this.Playlist.add(comp);
    }
}
