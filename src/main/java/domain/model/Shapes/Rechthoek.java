package domain.model.Shapes;

/**
 * Created by yanice on 07/06/2017.
 */
public class Rechthoek extends Vorm{
    private int hoogte;
    private int breedte;
    private Object linkerBovenhoek;

    public Rechthoek(Punt linkerBovenhoek, int breedte, int hoogte) {

    }



    public int getHoogte() {
        return hoogte;
    }

    public int getBreedte() {
        return breedte;
    }

    public Object getLinkerBovenhoek() {
        return linkerBovenhoek;
    }
}
