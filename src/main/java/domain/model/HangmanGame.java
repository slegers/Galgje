package domain.model;

import java.util.ArrayList;

/**
 * Created by yanice on 10/06/2017.
 */
public class HangmanGame {
    private Speler huidigeSpeler;
    private String woord;
    private ArrayList<String> geraden = new ArrayList();

    public HangmanGame(){

    }

    public void setHuidigeSpeler(Speler s){
        if(s == null){
            throw  new DomainException("De huidige speler kan niet null zijn.");
        }huidigeSpeler = s;
    }
}
