package playlist;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;

/**
 *
 */
public class Mp3ListModel extends DefaultListModel {
    private ArrayList<PlaylistItem> playlist;
    
    public Mp3ListModel(){
        playlist = new ArrayList<PlaylistItem>();
        playlist.add(new PlaylistItem("constructorTrack", "c:\\"));
        playlist.add(new PlaylistItem("constructorTrack2", "d:\\"));
    }
    
    public void add(PlaylistItem item){
        int index = playlist.size();
        playlist.add(item);
        fireIntervalAdded(this, index, index); // I spend long time to find it!
    }
    
    @Override
    public int getSize() {
        return playlist.size();
    }
    
    @Override
    public String getElementAt(int index) {
        return playlist.get(index).getName();
    }

    @Override
    public boolean contains(Object elem) {
        String xStr = (String) elem;
        
        for(PlaylistItem temp: playlist)
            if (temp.name.contains(xStr)){
                System.out.println(temp.location + "  ");
                return true;
            }
        
        return false;
    }
    
    
}
