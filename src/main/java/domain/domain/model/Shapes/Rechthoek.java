package domain.domain.model.Shapes;

import domain.domain.model.DomainException;

/**
 * Created by yanice on 07/06/2017.
 */
public class Rechthoek extends Vorm{
    private int hoogte;
    private int breedte;
    private Punt linkerBovenhoek;
    private Omhullende omhullende;

    public Rechthoek(Punt linkerBovenhoek, int breedte, int hoogte) {
        setLinkerBovenHoek(linkerBovenhoek);
        setHoogte(hoogte);
        setBreedte(breedte);
    }



    public int getHoogte() {
        return hoogte;
    }

    public int getBreedte() {
        return breedte;
    }

    public Punt getLinkerBovenhoek() {
        return linkerBovenhoek;
    }

    public void setLinkerBovenHoek(Punt linkerBovenHoek) {
        if(linkerBovenHoek == null){
            throw new NullPointerException("Een linkerbovenhoek van een rechthoek mag niet null zijn.");
        }
        this.linkerBovenhoek = linkerBovenHoek;
    }

    @Override
    public String toString() {
        return "Rechthoek: positie: " + linkerBovenhoek.toString() + "- breedte: " + breedte +" - hoogte: " + hoogte +
                "\n" + getOmHullende().toString();
    }

    @Override
    public boolean equals(Object o) {
        Rechthoek r = (Rechthoek) o;
        if(r == null){
            return false;
        }
        if(r.getBreedte() == breedte && r.getHoogte() == hoogte && r.getLinkerBovenhoek().equals(linkerBovenhoek)){
            return true;
        }else{
            return false;
        }
    }

    public void setHoogte(int hoogte) {
        if(hoogte<= 0){
            throw new DomainException("De hoogte van een driehoek moet strict positief zijn.");
        }
        this.hoogte = hoogte;
    }

    public void setBreedte(int breedte) {
        if(breedte<= 0){
            throw new DomainException("De breedte van een driehoek moet strict positief zijn.");
        }
        this.breedte = breedte;
    }

    public Omhullende getOmHullende() {
        return omhullende;
    }
}
