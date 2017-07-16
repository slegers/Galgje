package ui.view;

import domain.model.Tekenings.TekeningHangMan;
import ui.controller.Controller;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by yanice on 16/07/2017.
 */
public class HangManUi {
    private GameMainWindow gameMainWindow;
    private TekeningHangMan th;
    private Controller controller;
    public HangManUi(Controller c){
        controller = c;
        th = new TekeningHangMan("Hangman");
        gameMainWindow = new GameMainWindow("Hangman - " + controller.getHuidigeSpeler().getNaam(),th);
        JTextField textField = new JTextField();
        JLabel woord = new JLabel(controller.getGame().getWoord());
        woord.setBounds(10,440,190,20);
        woord.setVisible(true);
        textField.setBounds(220,440,100,20);
        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }
            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    if(!textField.getText().isEmpty()){
                        if(!controller.AskForLetter(textField.getText())) {
                            if (!th.zetVolgendeZichtbaar()) {
                                controller.getGame().setIsGameOver(true);
                                controller.restart();
                            }
                        }
                        gameMainWindow.teken();
                        woord.setText(controller.getGame().getWoord());
                        textField.setText("");
                    }
                }
            }
        });
        gameMainWindow.add(woord);
        gameMainWindow.add(textField);
        gameMainWindow.invalidate();
        gameMainWindow.validate();
        gameMainWindow.repaint();
        gameMainWindow.setVisible(true);

    }

    public void play(){
        while (!controller.getGame().isFinished() && !controller.getGame().isGameOver()) {
            gameMainWindow.teken();
        }
        gameMainWindow.dispose();
        if(controller.getGame().isFinished()){
            JOptionPane.showMessageDialog(null,"Proiciat u hebt het spel gewonnen.");
            controller.restart();
        }else{
            JOptionPane.showMessageDialog(null,"Helaas probeer het opnieuw.");
        }
    }
}
