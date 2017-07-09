package domain.model;


import domain.model.Shapes.Vorm;

import java.util.ArrayList;

/**
 * Created by yanice on 08/06/2017.
 */
@SuppressWarnings("ALL")
public class Tekening {
    private static final int MIN_X = 0;
    private static final int MIN_Y = 0;
    private static final int MAX_X=399;
    private static final int MAX_Y=399;

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
        return "";
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
            if(!t.vormen.get(i).equals(this.vormen.get(i))){
                return false;
            }
        }
        return true;
    }
    public void verwijder(Vorm v) {
        vormen.remove(v);
    }

    public void voegToe(Vorm v) {
        vormen.add(v);
    }

    public void setNaam(String naam) {
        if(naam == null || naam.trim().isEmpty()){
            throw new DomainException("De naam van een tekening mag niet leeg of null zijn.");
        }
        this.naam = naam;
    }
}
