package ui.view;


import domain.model.DomainException;
import domain.model.Shapes.Vorm;
import domain.model.Speler;
import domain.model.Tekening;
import ui.controller.Controller;

import javax.swing.*;

/**
 * Created by yanice on 08/07/2017.
 */
public class PictionaryUi {
        private Controller controller;
        private Tekening tekening;
        public PictionaryUi(Controller c){
            setController(c);
        }

        public void setController(Controller controller) {
            if(controller == null){
                throw new DomainException("The controller can't be null");
            }
            this.controller = controller;
        }

        public Speler createPlayer() {
            String naam = JOptionPane.showInputDialog(null,"Wat is de speler zijn naam.");
            if(naam.trim().isEmpty()){
                return createPlayer();
            }
            return new Speler(naam);
        }

        public void showMenuCreateVorm(){
            Object[] shapes = {"Punt", "Cirkel","Driehoek", "Rechthoek", "Lijnstuk"};
            Object keuze = JOptionPane.showInputDialog(null, "Wat wilt u tekenen", "input", JOptionPane.INFORMATION_MESSAGE, null, shapes, null);
            switch (keuze.toString()){
                case "Punt":
                    controller.createPunt();
                    break;
                case "Cirkel":
                    controller.createCirkel();
                    break;
                case "Driehoek":
                    controller.createDriehoek();
                    break;
                case "Rechthoek":
                    controller.createRechthoek();
                    break;
                case "Lijnstuk":
                    controller.createLijnstuk();
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Whoops hier ging hies mis.");
                    showMenuCreateVorm();
                    break;
            }
        }


    public void createTekening() {
            String naam = JOptionPane.showInputDialog(null,"Geef de tekening een naam.");
            if(naam.trim().isEmpty()){
                createTekening();
            }else{
                tekening = new Tekening(naam);
            }
    }

    public void voegToe(Vorm v) {
            tekening.voegToe(v);
    }

    public void showTekenMenu() {
        String keuze = JOptionPane.showInputDialog("Wat wil je doen? \n" +
                "\n"
            + "1. Vorm  toevoegen \n" +
            "2. Toon tekening \n" +
            "0. Stop");

        switch (keuze) {
            case "1":
                showMenuCreateVorm();
                showTekenMenu();
                break;
            case "2":
                GameMainWindow view = new GameMainWindow("HangMan", tekening);
                view.setVisible(true);
                view.teken();
                showTekenMenu();
                break;
            case "0":
                return;

            default:
                JOptionPane.showMessageDialog(null, "Whoop hier ging iets mis. Probeer opniew");
                showTekenMenu();
                break;
        }
    }

    public void showMainMenu() {
        Object[] shapes = {"Galgje","Tekenen","Stop","Voeg woord toe"};
        Object keuze = JOptionPane.showInputDialog(null, "Dag " + controller.getHuidigeSpeler().getNaam() + " welk spel wil je spelen?", "input", JOptionPane.INFORMATION_MESSAGE, null, shapes, null);
        switch (keuze.toString()){
            case "Galgje":
                controller.playGalgje();
                break;
            case "Tekenen":
                controller.showTekenMenu();
                break;
            case "Voeg woord toe":
                break;
            case "Stop":
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Whoops hier ging hies mis.");
                showMainMenu();
                break;
        }
        showMainMenu();
    }
}
