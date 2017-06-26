package ui.view.creators;

import domain.model.Shapes.Punt;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

/**
 * Created by yanice on 10/06/2017.
 */
public class PuntCreator {
    private int x,y;
    private Punt p;
    public PuntCreator(){

    }

    private void vraagY() {
        try {
            y = Integer.parseInt(JOptionPane.showInputDialog("Geef een y-coordinaat"));
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Whoops hier ging iets mis.");
            vraagY();
        }
    }

    private void vraagX() {
        try {
            x = Integer.parseInt(JOptionPane.showInputDialog("Geef een x-coordinaat"));
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Whoops hier ging iets mis.");
            vraagX();
        }
    }

    public Punt create() {
        vraagX();
        vraagY();
        p =  new Punt(x,y);
        return p;
    }

    public void show() {
        JOptionPane.showMessageDialog(null,"U hebt een correct punt aangemaakt: " + p.toString());
    }
}
