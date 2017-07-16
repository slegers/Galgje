package ui.controller;


import domain.db.WoordenLezer;
import domain.model.*;
import domain.model.Shapes.*;
import domain.model.Speler;
import domain.model.Tekenings.TekeningHangMan;
import domain.model.Woord.WoordenLijst;
import jdk.nashorn.internal.scripts.JO;
import ui.view.*;
import ui.view.creators.*;

import javax.swing.*;

import static sun.plugin.ClassLoaderInfo.reset;

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
        showMainMenu();
    }

    private WoordenLijst createWoordenLijst() {
        WoordenLezer lezer = new WoordenLezer();
        return lezer.createWoordenLijst();
    }

    private void showMainMenu() {
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

    public boolean AskForLetter(String s) {
        if(s.length() != 1){
            JOptionPane.showMessageDialog(null,"Gelieve een letter in tegeven");
            return false;
        }else{
              return game.doeGok(s);
            }
    }

    public void playGalgje() {
        new HangManUi(this).play();
    }

    public void restart() {
        Speler s = game.getHuidigeSpeler();
        game = new HangMan(s,createWoordenLijst());
    }

    public HangMan getGame() {
        return game;
    }
}
