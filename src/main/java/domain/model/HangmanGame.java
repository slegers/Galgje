package domain.model;

import domain.model.Woord.HintWoord;

import java.util.ArrayList;

/**
 * Created by yanice on 10/06/2017.
 */
public class HangmanGame {
    private Speler huidigeSpeler;
    private HintWoord woord;
    public HangmanGame(){
        setWoord("Test");
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

    public void doeGok(String s) {
        woord.raad(s.charAt(0));
    }
}
