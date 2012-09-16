package listeners.playlist;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JList;
import playlist.Mp3ListModel;
import playlist.PlaylistItem;

public class DelBtnActionListener implements ActionListener{
    private static int index = 0;
    private Mp3ListModel mp3ListModel;
    private PlaylistItem playlistItem;
    
    public DelBtnActionListener(JList list, Mp3ListModel mp3ListModel){
        this.mp3ListModel = mp3ListModel;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        mp3ListModel.add(playlistItem);
    }
}
