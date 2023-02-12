import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Thread.State;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonListener implements ActionListener {
    private static TTS ttsEngine = new TTS();
    private JFrame parent;

    public ButtonListener(JFrame parent) {
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = ((GUISwing) parent).getTfText();
        if (text != null && !text.isEmpty()) {
            ttsEngine.readOutLoud(text);
        } else {
            JOptionPane.showMessageDialog(parent, "Please enter some text to read out loud.");
        }
    }

}