package listeners.playlist;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import playlist.Mp3ListModel;
import playlist.PlaylistItem;

/**
 *
 */
public class AddBtnActionListener implements ActionListener{
    private static int index = 0;
    private Mp3ListModel mp3ListModel;
    private PlaylistItem playlistItem;
    
    public AddBtnActionListener(Mp3ListModel mp3ListModel){
        this.mp3ListModel = mp3ListModel;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        playlistItem = new PlaylistItem("track " + (++index), "c:\\");
        mp3ListModel.add(playlistItem);
    }
}
