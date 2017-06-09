package ui.controller;

import domain.model.HangmanGame;
import domain.model.Speler;
import ui.view.PictonaryUi;

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
    }

    public void createPlayer() {
        ui.createPlayer();
    }
    public void setHuidigeSpeler(Speler s){
        game.setHuidigeSpeler(s);
    }

}
