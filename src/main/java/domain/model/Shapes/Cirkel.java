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

    @Override
    public String toString() {
        return "Middelpunt: " + middelpunt.toString() + " Radius: " + radius;
    }

    @Override
    public boolean equals(Object o) {
        Cirkel c = (Cirkel) o;
        if(c == null){
            throw new NullPointerException("Dit object is niet van het type cirkel");
        }
        if(radius == c.getRadius() && c.getMiddelpunt().equals(middelpunt)){
            return true;
        }else{
            return false;
        }
    }

    public int getRadius() {
        return radius;
    }

    public Punt getMiddelpunt() {
        return middelpunt;
    }
}
