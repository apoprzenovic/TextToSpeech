import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;

public class GUISwing extends JFrame {

    private JFrame frame;
    private JPanel panel2;
    private JPanel panel3;
    JTextField textField;
    JButton button;

    ButtonListener buttonListener = null;

    public GUISwing() {

        frame = new JFrame("TTS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(1, 2));

        textField = new JTextField();
        textField.setPreferredSize(new DimensionUIResource(200, 140));

        button = new JButton("Speak");
        buttonListener = new ButtonListener(this);
        button.addActionListener(buttonListener);

        panel2 = new JPanel();
        panel3 = new JPanel();

        panel2.add(textField);
        panel3.add(button);

        frame.getContentPane().add(panel2);
        frame.getContentPane().add(panel3);

        frame.revalidate();
        frame.repaint();

    }

    public String getTfText() {
        return textField.getText();
    }

}
