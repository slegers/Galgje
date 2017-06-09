package ui.view;

import domain.model.DomainException;
import domain.model.Shapes.Punt;
import domain.model.Speler;

import javax.swing.*;

/**
 * Created by yanice on 07/06/2017.
 */
public class PictonaryUi {
    private Speler speler;
    private Punt p;

    public PictonaryUi(){
        createSpeler();
        ShowMenu();
    }

    private void createSpeler() {
        String naam = JOptionPane.showInputDialog(null,"Wat is de speler zijn naam.");
        if(naam.trim().isEmpty()){
            createSpeler();
        }else{
            speler = new Speler(naam);
        }
    }

    public void ShowMenu(){
        String choice = JOptionPane.showInputDialog(null,"1. Maak een punt");
        try{
            int keuze = Integer.parseInt(choice);
            menuHandler(keuze);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Whoops daar ging iets mis! \n " +
                    "Probeer het nog eens.");
            ShowMenu();
        }
    }

    private void menuHandler(int keuze) {
        switch (keuze){
            case 1:
                createPunt();
                break;
            default:
                ShowMenu();
                break;
        }
    }

    private void createPunt() {

    }
}
