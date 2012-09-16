package playlist;

public class PlaylistItem {
    protected String name;
    protected String location;

    public PlaylistItem(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}