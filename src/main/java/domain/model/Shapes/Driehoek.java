package domain.model.Shapes;

/**
 * Created by yanice on 07/06/2017.
 */
public class Driehoek extends Vorm{
    private Punt hoekPunt1, hoekPunt2, hoekPunt3;

    public Driehoek(Punt p1, Punt p2, Punt p3){
        setPunten(p1,p2,p3);
    }

    private void setPunten(Punt p1, Punt p2, Punt p3) {

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
    public String toString() {
        return "Driehoek:  hoekpunt1: " + hoekPunt1.toString() +" - hoekpunt2: " + hoekPunt2.toString() + "- hoekpunt3: " + hoekPunt3.toString();
    }

    @Override
    public boolean equals(Object o) {
        Driehoek d = (Driehoek) o;
        if(d == null){
            return false;
        }
        if(hoekPunt3.equals(d.hoekPunt3) && d.hoekPunt2.equals(hoekPunt2) && d.hoekPunt1.equals(hoekPunt3)){
            return true;
        }else{
            return false;
        }
    }
}
