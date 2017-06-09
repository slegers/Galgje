package domain.model.Shapes;

/**
 * Created by yanice on 07/06/2017.
 */
public class Cirkel extends Vorm {
    private Punt middelpunt;
    private int radius;

    public Cirkel(Punt m, int radius){
        setRadius(radius);
        setMiddelPunt(m);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setMiddelPunt(Punt middelPunt) {
        this.middelpunt = middelPunt;
    }
}
