package ui.view;


import domain.model.Tekening;

import javax.swing.*;

/**
 * Created by yanice on 14/07/2017.
 */
public class GameMainWindow extends JFrame {
    private TekenVenster tv;
    private Tekening tekening;
    public GameMainWindow(String naam, Tekening tekening){
        super(naam);
        setTekening(tekening);
        setBounds(0,0,500,500);
        tv = new TekenVenster(tekening);
        add(tv);
    }
    public void teken(){
        tv.teken();
    }

    public void setTekening(Tekening tekening) {
        if(tekening == null){
            throw new UiException("De tekening kan niet null zijn wanneer Deze getekend wordt.");
        }
        this.tekening = tekening;
    }
}
