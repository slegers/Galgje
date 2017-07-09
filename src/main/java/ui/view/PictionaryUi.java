package ui.view;


import domain.model.DomainException;
import domain.model.Speler;
import ui.controller.Controller;

import javax.swing.*;

/**
 * Created by yanice on 08/07/2017.
 */
public class PictionaryUi {
        private Controller controller;

        public PictionaryUi(Controller c){
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
            }else{
                controller.setHuidigeSpeler(new Speler(naam));
            }
        }

        public void showMenu(){
            Object[] shapes = {"Punt", "Cirkel","Driehoek", "Rechthoek", "Lijnstuk","Tekening" };
            Object keuze = JOptionPane.showInputDialog(null, "Wat wilt u tekenen", "input", JOptionPane.INFORMATION_MESSAGE, null, shapes, null);
            switch (keuze.toString()){
                case "Punt":
                    controller.createPunt();
                    break;
                case "Cirkel":
                    controller.createCirkel();
                    break;
                case "Driehoek":
                    break;
                case "Rechthoek":
                    controller.createRechthoek();
                    break;
                case "Lijnstuk":
                    controller.createLijnstuk();
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Whoops hier ging hies mis.");
                    showMenu();
                    break;
            }
        }


}
