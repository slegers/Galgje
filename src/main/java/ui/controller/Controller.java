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
    }

    private void showMenu() {
        ui.showMenu();
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
        c.show();
    }

    public void createCirkel() {
        CirkelCreator cc = new CirkelCreator();
        cc.cirkelCreator();
        cc.show();
    }

    public void createRechthoek() {
        RechthoekCreator rc = new RechthoekCreator();
        Rechthoek r = rc.create();
        rc.show();
    }

    public void createLijnstuk() {
        LijnStukCreator lc = new LijnStukCreator();
        LijnStuk l = lc.create();
        lc.show();
    }


}
