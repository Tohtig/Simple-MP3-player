package listeners.playlist;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import playlist.Mp3ListModel;
import playlist.PlaylistItem;

/**
 *
 */
public class FindBtnActionListener implements ActionListener{
    private Mp3ListModel mp3ListModel;
    private String xTrack;
    
    public FindBtnActionListener(JTextField findLine, Mp3ListModel mp3ListModel){
        this.mp3ListModel = mp3ListModel;
        xTrack = findLine.getText();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        mp3ListModel.contains(xTrack);
    }
}
