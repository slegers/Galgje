package ui.controller;

import domain.model.HangmanGame;
import domain.model.Shapes.Punt;
import domain.model.Speler;
import ui.view.PictonaryUi;
import ui.view.creators.CirkelCreator;
import ui.view.creators.PuntCreator;

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
}
