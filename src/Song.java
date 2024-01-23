import java.util.ArrayList;

public class Song {

    private final String title, artist;
    private final ArrayList<String> listens = new ArrayList<>();

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int howMany(ArrayList<String> arrayList) {
        int original = listens.size();
        for (String s: arrayList) {
            if (!listens.contains(s.toLowerCase())) listens.add(s.toLowerCase());
        }
        return listens.size()-original;
    }
}
