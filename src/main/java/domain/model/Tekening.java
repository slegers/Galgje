package domain.model;

import domain.model.Shapes.Vorm;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by yanice on 08/06/2017.
 */
@SuppressWarnings("ALL")
public class Tekening implements Drawable {
    private static final int MIN_X = 0;
    private static final int MIN_Y = 0;
    private static final int MAX_X=500;
    private static final int MAX_Y=500;

    private String naam;
    private ArrayList<Vorm> vormen = new ArrayList();

    public Tekening(String naam) {
        setNaam(naam);
    }

    public String getNaam() {
        return naam;
    }

    public int getAantalVormen() {
        return vormen.size();
    }

    public boolean bevat(Vorm vorm) {
        for(Vorm v : vormen){
            try{
                if(vorm.equals(v)){
                    return true;
                }
            }catch (ClassCastException c){

            }
        }
        return false;
    }
    @Override
    public String toString(){
        String t =  "domain.model.Tekening met de naam " + this.naam + " bestaat uit " +vormen.size() + " vormen.\n";
        for(Vorm v : vormen){
            t += v.vorm() + " " + v.toString() + "\n";
        }
        return t;
    }
    @Override
    public boolean equals(Object o){
        Tekening t = (Tekening) o;
        if(t == null || !naam.equals(t.getNaam())){
            return false;
        }
        if(t.getAantalVormen() != this.getAantalVormen()){
            return false;
        }
        for(int i = 0; i < getAantalVormen();i++){
            if(!t.getVormen().get(i).equals(this.getVormen().get(i))){
                return false;
            }
        }
        return true;
    }
    public void verwijder(Vorm v) {
        vormen.remove(v);
    }

    public void voegToe(Vorm v) {
        if(canHaveAsVorm(v)){
            vormen.add(v);
        }else{
            throw new DomainException("Deze vorm past niet in de tekening");
        }

    }

    private boolean canHaveAsVorm(Vorm v) {
        if(v.getOmhullende().getMinY() < MIN_Y || v.getOmhullende().getMinX()< MIN_X || v.getOmhullende().getMaxX() > MAX_X || v.getOmhullende().getMaxX() > MAX_Y){
            return false;
        }
        return true;
    }

    public void setNaam(String naam) {
        if(naam == null || naam.trim().isEmpty()){
            throw new DomainException("De naam van een tekening mag niet leeg of null zijn.");
        }
        this.naam = naam;
    }

    public ArrayList<Vorm> getVormen() {
        return vormen;
    }

    @Override
    public void teken(Graphics graphics) {
        for(Vorm v : vormen){
            v.teken(graphics);
        }
    }

    public int getAantalOnzichtbaar() {
        return 0;
    }
}
