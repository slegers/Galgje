package ui.view.creators;

import domain.model.Shapes.*;

import javax.swing.*;

/**
 * Created by yanice on 26/06/2017.
 */
public class RechthoekCreator {
    private int hoogte, breedte;
    private Punt LinkerbovenHoek;
    private Rechthoek rechthoek;

    public RechthoekCreator(){

    }
    private void vraagHoogte() {
        try {
            hoogte = Integer.parseInt(JOptionPane.showInputDialog("Geef de hoogte van de rechthoek"));
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Whoops hier ging iets mis.");
            vraagHoogte();
        }
    }

    private void vraagBreedte() {
        try {
            breedte = Integer.parseInt(JOptionPane.showInputDialog("Geef de breedte van de rechthoek"));
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Whoops hier ging iets mis.");
            vraagBreedte();
        }
    }
    public Rechthoek create(){
        try {
            vraagHoogte();
            vraagBreedte();
            PuntCreator pc = new PuntCreator();
            LinkerbovenHoek = pc.create();
            rechthoek = new Rechthoek(LinkerbovenHoek,breedte,hoogte);
        }catch (NullPointerException e){
            JOptionPane.showMessageDialog(null,"Whoops hier ging iets mis. \n"
            + e.getMessage());
        }
        return rechthoek;
    }


    public void show() {
        JOptionPane.showMessageDialog(null,"U hebt een correct punt aangemaakt: " + rechthoek.toString());
    }
}

