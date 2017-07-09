package ui.view.creators;

import domain.model.Shapes.Cirkel;
import domain.model.Shapes.Punt;

import javax.swing.*;

/**
 * Created by yanice on 25/06/2017.
 */
public class CirkelCreator {
    private Punt p;
    private int radius;
    private Cirkel c;

    public void askRadius(){
        try {
            radius = Integer.parseInt(JOptionPane.showInputDialog("Geef een radius in."));
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Whoops hier ging iets mis.");
            askRadius();
        }
    }
    public Cirkel cirkelCreator(){
        PuntCreator pc = new PuntCreator();
        askRadius();
        c =  new Cirkel(pc.create(),radius);
        return c;
    }

    public void show() {
        JOptionPane.showMessageDialog(null,"U hebt een correcte cirkel aangemaakt: " + c.toString());
    }
}
