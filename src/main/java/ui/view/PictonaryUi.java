package ui.view;

import com.sun.codemodel.internal.JOp;
import domain.model.DomainException;
import domain.model.Shapes.Punt;
import domain.model.Speler;
import ui.controller.Controller;

import javax.swing.*;

/**
 * Created by yanice on 07/06/2017.
 */
public class PictonaryUi {
    private Speler speler;
    private Controller controller;
    private Punt p;

    public PictonaryUi(Controller c){
        setController(c);
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

    public void setController(Controller controller) {
        if(controller == null){
            throw new DomainException("The controller can't be null");
        }
        this.controller = controller;
    }

    public void createPlayer() {
        String naam = JOptionPane.showInputDialog(null,"Wat is de speler zijn naam.");
        if(naam.trim().isEmpty()){
            createPlayer();
        }else{
            controller.setHuidigeSpeler(new Speler(naam));
        }
    }

    public void showMenu() {
       String in = JOptionPane.showInputDialog(null,"Menu: \n" +
                "1. Maak punt \n" +
                "2. Maak Een cirkel \n" +
                "3. Maak driehoek \n" +
                "4. Maak tekening \n" +
                "5. Maak Rechthoek \n" +
                "6. Stop \n");

        switch(in.trim()){
            case "1":
                controller.createPunt();
                break;
            case "2":
                controller.createCirkel();
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                controller.createRechthoek();
                break;
            default:
                JOptionPane.showMessageDialog(null,"Whoops hier ging iets mis, probeer opnieuw");
                showMenu();
                break;
        }
        showMenu();
    }
}
