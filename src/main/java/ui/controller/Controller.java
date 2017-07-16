package ui.controller;


import domain.db.WoordenLezer;
import domain.model.*;
import domain.model.Shapes.*;
import domain.model.Speler;
import domain.model.Tekenings.TekeningHangMan;
import domain.model.Woord.WoordenLijst;
import ui.view.*;
import ui.view.creators.*;

import javax.swing.*;

/**
 * Created by yanice on 10/06/2017.
 */
public class Controller {
    private PictionaryUi ui;
    private HangMan game;
    public Controller(){
        ui = new PictionaryUi(this);
        game = new HangMan(createPlayer(),createWoordenLijst());
        ui.createTekening();
        showOptionMenu();
    }

    private WoordenLijst createWoordenLijst() {
        WoordenLezer lezer = new WoordenLezer();
        return lezer.createWoordenLijst();
    }

    private void showOptionMenu() {
        ui.showMainMenu();
    }

    public Speler getHuidigeSpeler(){
        return game.getHuidigeSpeler();
    }

    public void showTekenMenu(){
        ui.showTekenMenu();
    }

    public Speler createPlayer() {
        return ui.createPlayer();
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

    public void AskForLetter() {
        String s = JOptionPane.showInputDialog(null, "RaraRa welk woord zoeken we? \n\n"
        + game.getWoord());
        if(s.length() != 1){
            JOptionPane.showMessageDialog(null,"Gelieve een letter in tegeven");
        }else{
            game.doeGok(s);
        }
    }

    public void playGalgje() {
        while (!game.isFinished()) {
            AskForLetter();
           GameMainWindow w = new GameMainWindow("Hangman",(Tekening) new TekeningHangMan("Hangman"));
            w.setVisible(true);
            w.teken();
        }
        JOptionPane.showMessageDialog(null,"Proficiat u raadde het woord: \n " +
              game.getWoord());
    }
}
