package ui.controller;

import domain.domain.model.HangmanGame;
import domain.domain.model.Shapes.LijnStuk;
import domain.domain.model.Shapes.Punt;
import domain.domain.model.Shapes.Rechthoek;
import domain.domain.model.Speler;
import ui.view.PictonaryUi;
import ui.view.creators.CirkelCreator;
import ui.view.creators.LijnStukCreator;
import ui.view.creators.PuntCreator;
import ui.view.creators.RechthoekCreator;

/**
 * Created by yanice on 10/06/2017.
 */
public class Controller {
    PictonaryUi ui;
    HangmanGame game;

    public Controller(){
        game = new HangmanGame();
        ui = new PictonaryUi(this);
        createPlayer();
        showMenu();
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
