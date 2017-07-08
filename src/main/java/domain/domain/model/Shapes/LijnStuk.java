package domain.domain.model.Shapes;

import domain.domain.model.DomainException;

/**
 * Created by yanice on 07/06/2017.
 */
public class LijnStuk extends Vorm {

    private Punt startPunt,eindPunt;

    public LijnStuk(Punt p1, Punt p2){
        setPunten(p1,p2);
    }

    private void setPunten(Punt p1, Punt p2) {
        if(p1.equals(p2)){
            throw new DomainException("De twee punten in een lijnstuk mogen niet gelijk zijn aan elkaar.");
        }else if(p1 == null || p2 == null){
            throw new NullPointerException("Het start en/of eindpunt van een lijnstuk mogen niet gelijk zijn aan null");
        }
        setStartPunt(p1);
        setEindPunt(p2);
    }

    public Punt getStartPunt() {
        return startPunt;
    }

    public Punt getEindPunt() {
        return eindPunt;
    }

    private void setStartPunt(Punt startPunt) {
        if(startPunt == null){
            throw new NullPointerException("Startpunt van een Lijnstuk kan niet null zijn.");
        }
        this.startPunt = startPunt;
    }

    private void setEindPunt(Punt eindPunt) {
        if(startPunt == null){
            throw new NullPointerException("Eindpunt van een Lijnstuk kan niet null zijn.");
        }
        this.eindPunt = eindPunt;
    }

    @Override
    public String toString(){
        return "Lijn: startpunt: " + startPunt.toString() + "- eindpunt: " + eindPunt.toString();
    }

    @Override
    public boolean equals(Object o) {
        LijnStuk l = (LijnStuk) o;
        if(l == null){
            return false;
        }
        if(l.getEindPunt().equals(eindPunt) && l.getStartPunt().equals(startPunt)){
            return true;
        }else{
            return false;
        }
    }
}
