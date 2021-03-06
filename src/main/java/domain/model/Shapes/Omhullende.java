package domain.model.Shapes;

import domain.model.DomainException;

/**
 * Created by yanice on 07/06/2017.
 */
public class Omhullende {
    private int hoogte;
    private int breedte;
    private Punt linkerBovenhoek;

    public Omhullende(Punt linkerBovenhoek, int breedte, int hoogte) {
        setLinkerBovenhoek(linkerBovenhoek);
        setBreedte(breedte);
        setHoogte(hoogte);
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

    public void setLinkerBovenhoek(Punt linkerBovenhoek) {
        if(linkerBovenhoek == null){
            throw new DomainException("Punt linkerbovenhoek mag niet gelijk zijn aan nul.");
        }
        this.linkerBovenhoek = linkerBovenhoek;
    }

    public void setBreedte(int breedte) {
        if(!isVallidsize(breedte)){
           throw new DomainException("De breedte/hoogte van deze omhullende is fout.");
        }
        this.breedte = breedte;
    }

    public boolean isVallidsize(int groote) {
        if(groote < 0){
            return false;
        }
        return true;
    }

    public void setHoogte(int hoogte) {
        if(!isVallidsize(hoogte)){
            throw new DomainException("De breedte/hoogte van deze omhullende is fout.");
        }
        this.hoogte = hoogte;
    }

    public int getMinX() {
        return getLinkerBovenhoek().getX();
    }

    public int getMinY() {
        return getLinkerBovenhoek().getY();
    }

    public int getMaxX() {
        return getLinkerBovenhoek().getX() + breedte;
    }

    public int getMaxY() {
        return getLinkerBovenhoek().getY() + hoogte;
    }

    @Override
    public String toString(){
        return "Omhullende: " + linkerBovenhoek.toString() + " - " + breedte + " - " + hoogte;
    }

    @Override
    public boolean equals(Object o){
        Omhullende om = null;
        try{
            om = (Omhullende) o;
        }catch (ClassCastException c){
            return false;
        }

        if(om == null){
            return false;
        }else{
            if(((Omhullende) o).getLinkerBovenhoek().equals(this.linkerBovenhoek) && this.breedte == om.getBreedte() && this.hoogte == om.getHoogte()){
                return true;
            }else{
                return false;
            }
        }
    }
}
