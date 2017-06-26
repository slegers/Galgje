package ui.view.creators;

import domain.model.DomainException;
import domain.model.Shapes.LijnStuk;
import domain.model.Shapes.Punt;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

/**
 * Created by yanice on 26/06/2017.
 */
public class LijnStukCreator {
    private Punt p1,p2;
    private LijnStuk l;
    public LijnStuk create() {
        PuntCreator pc = new PuntCreator();
        p1 = pc.create();
        p2 = pc.create();
        try{
            l = new LijnStuk(p1,p2);
        }catch (NullPointerException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            create();
        }catch (DomainException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            create();
        }
        return l;
    }

    public void show() {
        JOptionPane.showMessageDialog(null,"U hebt een correcte cirkel aangemaakt: " + l.toString());
    }
}
