package domain.model.Woord;

import domain.db.WoordenLezer;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by yanice on 15/07/2017.
 */
public class WoordenLijst {
    private int aantalWoorden;
    private ArrayList<String> lijst = new ArrayList<>();
    public WoordenLijst(){

    }

    public String getRandomWoord() {
        Random r = new Random();
        return lijst.get(r.nextInt(lijst.size()-1));
    }

    public void voegToe(String test) {
        lijst.add(test);
    }


    public int getAantalWoorden() {
        return aantalWoorden;
    }
}
