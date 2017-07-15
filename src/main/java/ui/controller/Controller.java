package ui.controller;


import domain.model.*;
import domain.model.Shapes.LijnStuk;
import domain.model.Shapes.*;
import domain.model.Speler;
import ui.view.*;
import ui.view.creators.*;

/**
 * Created by yanice on 10/06/2017.
 */
public class Controller {
    private PictionaryUi ui;
    private HangmanGame game;
    public Controller(){
        game = new HangmanGame();
        ui = new PictionaryUi(this);
        createPlayer();
        ui.createTekening();
        showMainMenu();
    }
    public void showMainMenu(){
        ui.showMainMenu();
    }

    public void createPlayer() {
        ui.createPlayer();
    }

    public void setHuidigeSpeler(Speler s){
        game.setHuidigeSpeler(s);
    }

    public void createPunt() {
        PuntCreator c = new PuntCreator();
        Punt p = c.create();
        ui.voegToe(p);
    }

    public void createCirkel() {
        CirkelCreator cc = new CirkelCreator();
        ui.voegToe(cc.cirkelCreator());
    }

    public void createRechthoek() {
        RechthoekCreator rc = new RechthoekCreator();
        ui.voegToe(rc.create());
    }

    public void createLijnstuk() {
        LijnStukCreator lc = new LijnStukCreator();
        ui.voegToe(lc.create());
    }


    public void createDriehoek() {
        DriehoekCreator dc = new DriehoekCreator();
        ui.voegToe(dc.createDrieHoek());
    }
}
