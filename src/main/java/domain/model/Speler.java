package domain.model;

import java.util.Objects;

/**
 * Created by yanice on 07/06/2017.
 */
public class Speler {
    private String naam;
    private int score;
    public Speler(String naam){
        setNaam(naam);
    }

    public String getNaam() {
        return naam;
    }
    
    @Override
    public boolean equals(Object o){
        Speler s = (Speler) o;
        if(s == null){
            throw new RuntimeException("the object may not be null.");
        }else if(s.getNaam().equals(this.naam) && s.getScore() == this.score){
            return true;
        }
        return false;
    }

    public int getScore() {
        return score;
    }

    public void addToScore(int score) {
        if(this.score + score < 0){
            throw new DomainException("The score of the user can't be under zero.");
        }else{
            this.score +=score;
        }
    }

    public void setNaam(String naam) {
        if(canHaveAsName(naam)){
            this.naam = naam;
        }else{
            throw new DomainException("A name shouldn't be null or empty.");
        }
    }

    private boolean canHaveAsName(String naam) {
        if(naam == null ||naam.trim().equals("")){
            return false;
        }else {
            return true;
        }
    }
}
