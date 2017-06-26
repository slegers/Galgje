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
}
