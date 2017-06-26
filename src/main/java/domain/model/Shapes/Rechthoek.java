package domain.model.Shapes;

/**
 * Created by yanice on 07/06/2017.
 */
public class Rechthoek extends Vorm{
    private int hoogte;
    private int breedte;
    private Punt linkerBovenhoek;

    public Rechthoek(Punt linkerBovenhoek, int breedte, int hoogte) {
        setLinkerBovenHoek(linkerBovenhoek);
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
        return "Rechthoek: positie: " + linkerBovenhoek.toString() + "- breedte: " + breedte +" - hoogte: " + hoogte;
    }

    @Override
    public boolean equals(Object o) {
        Rechthoek r = (Rechthoek) o;
        if(r == null){
            throw new NullPointerException("Dit object is niet van het type Rechthoek");
        }
        if(r.getBreedte() == breedte && r.getHoogte() == hoogte && r.getLinkerBovenhoek().equals(linkerBovenhoek)){
            return true;
        }else{
            return false;
        }
    }
}
