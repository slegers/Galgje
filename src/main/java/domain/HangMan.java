package domain;

import domain.model.Speler;
import domain.model.Tekening;

/**
 * Created by yanice on 15/07/2017.
 */
public class HangMan {
    private Speler speler;
    private String hint;
    private Tekening tekening;

    public HangMan(Speler s, WoordenLijst geldigeWoordenlijst) {

    }

    public Speler getSpeler() {
        return speler;
    }

    public boolean isGameOver() {
        return false;
    }

    public boolean isGewonnen() {
        return false;
    }

    public String getHint() {
        return hint;
    }

    public void raad(char letter) {
    }

    public Tekening getTekening() {
        return tekening;
    }
}
