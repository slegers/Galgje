package domain;

import domain.model.Shapes.Vorm;

/**
 * Created by yanice on 08/06/2017.
 */
public class Tekening {
    private String naam;
    private int aantalVormen;

    public Tekening(String huis) {

    }

    public String getNaam() {
        return naam;
    }

    public int getAantalVormen() {
        return aantalVormen;
    }

    public boolean bevat(Vorm deur) {
        return false;
    }

    public void verwijder(Vorm schouwNietInTekening) {
    }

    public void voegToe(Vorm deur) {
    }
}
