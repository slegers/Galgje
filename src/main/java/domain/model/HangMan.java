package domain.model;

import domain.model.Woord.HintWoord;
import domain.model.Woord.WoordenLijst;

/**
 * Created by yanice on 10/06/2017.
 */
public class HangMan {

    private Speler huidigeSpeler;
    private HintWoord woord;
    private String hint;
    private Tekening tekening;
    private boolean isGameOver = false;
    public HangMan(Speler s, WoordenLijst geldigeWoordenlijst) {
        setHuidigeSpeler(s);
        setWoord(geldigeWoordenlijst.getRandomWoord());
        setTekening();
    }

    private void setTekening() {
        tekening = new Tekening("Hangman");
    }

    public void setWoord(String woord){
        this.woord = new HintWoord(woord);
    }

    public void setHuidigeSpeler(Speler s){
        if(s == null){
            throw  new DomainException("De huidige speler kan niet null zijn.");
        }huidigeSpeler = s;
    }

    public Speler getHuidigeSpeler() {
        return huidigeSpeler;
    }

    public String getWoord() {
        return woord.toString();
    }

    public boolean isFinished() {
        return woord.isGeraden();
    }

    public boolean doeGok(String s) {
        return woord.raad(s.charAt(0));
        }


    public Speler getSpeler() {
        return huidigeSpeler;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public boolean isGewonnen() {
        return woord.isGeraden();
    }

    public String getHint() {
        return hint;
    }

    public Tekening getTekening() {
        return tekening;
    }

    public void raad(char letter) {
        woord.raad(letter);
    }

    public void setIsGameOver(boolean isGameOver) {
        this.isGameOver = isGameOver;
    }
}
