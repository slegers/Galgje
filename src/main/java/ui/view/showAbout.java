package ui.view;

import javax.swing.*;

/**
 * Created by yanice on 16/07/2017.
 */
public class showAbout extends JFrame{
    public showAbout(String message) {
        setResizable(false);
        setBounds(0,0,650,500);
        JTextArea textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setText(message);
        textArea.setEditable(false);
        add(scrollPane);
        setVisible(true);
    }
}
