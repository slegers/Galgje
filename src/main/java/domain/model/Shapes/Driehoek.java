package domain.model.Shapes;

import domain.model.DomainException;

/**
 * Created by yanice on 07/06/2017.
 */
public class Driehoek extends Vorm{
    private Punt hoekPunt1, hoekPunt2, hoekPunt3;

    public Driehoek(Punt p1, Punt p2, Punt p3){
        setPunten(p1,p2,p3);
        setOmhullende();
    }

    private void setPunten(Punt p1, Punt p2, Punt p3) {
        if(canHaveAsPunten(p1,p2,p3)){
            hoekPunt1 = p1;
            hoekPunt2 = p2;
            hoekPunt3 = p3;
        }
    }

    public boolean canHaveAsPunten(Punt p1, Punt p2, Punt p3) {
        if(p1 == null || p2 == null || p3 == null){
            throw new DomainException("Een hoekpunt mag niet gelijk zijn aan null van een driehoek.");
        }
        if((p2.getX()-p1.getX())*(p3.getY()-p1.getY()) == (p3.getX()-p1.getX())*(p2.getY()-p1.getY())){
            return false;
        }else{
            return true;
        }
    }

    public Punt getHoekPunt1() {
        return hoekPunt1;
    }
    public Punt getHoekPunt2() {
        return hoekPunt2;
    }
    public Punt getHoekPunt3() {
        return hoekPunt3;
    }

    @Override
    protected void setOmhullende() {

    }

    @Override
    public String vorm() {
        return "Driehoek";
    }

    @Override
    public String toString() {
        return "Driehoek:  hoekpunt1: " + hoekPunt1.toString() +" - hoekpunt2: " + hoekPunt2.toString() + "- hoekpunt3: " + hoekPunt3.toString();
    }

    @Override
    public boolean equals(Object o) {
        Driehoek d = null;
        try{
            d = (Driehoek) o;
        }catch (ClassCastException c){
            return false;
        }
        if(d == null){
            return false;
        }
        if(hoekPunt3.equals(d.hoekPunt3) && hoekPunt2.equals(d.hoekPunt2) && hoekPunt1.equals(d.hoekPunt1)){
            return true;
        }else{
            return false;
        }
    }
}
