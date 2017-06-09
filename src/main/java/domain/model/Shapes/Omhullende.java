package domain.model.Shapes;

/**
 * Created by yanice on 07/06/2017.
 */
public class Omhullende {
    private int hoogte;
    private int breedte;
    private Punt linkerBovenhoek;

    public Omhullende(Punt linkerBovenhoek, int breedte, int hoogte) {

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
}
