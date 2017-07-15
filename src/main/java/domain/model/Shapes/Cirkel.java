package domain.model.Shapes;

import java.awt.*;

/**
 * Created by yanice on 07/06/2017.
 */
public class Cirkel extends Vorm {
    private Punt middelpunt;
    private int radius;

    public Cirkel(Punt m, int radius){
        setRadius(radius);
        setMiddelPunt(m);
        setOmhullende();
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setMiddelPunt(Punt middelPunt) {
        this.middelpunt = middelPunt;
    }

    @Override
    protected void setOmhullende() {
        setOmhullende(new Omhullende(new Punt(middelpunt.getX()-radius,middelpunt.getY()-radius),2*radius,2*radius));
    }

    @Override
    public String vorm() {
        return "Cirkel";
    }

    @Override
    public String toString() {
        return "Middelpunt: " + middelpunt.toString() + " Radius: " + radius;
    }

    @Override
    public boolean equals(Object o) {
       Cirkel c = null;
        try{
             c = (Cirkel) o;
        }catch (ClassCastException e) {
            return false;
        }

        if(c == null){
           return false;
        }
        if(radius == c.getRadius() && c.getMiddelpunt().equals(middelpunt)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Omhullende getOmhullende() {
        return null;
    }

    public int getRadius() {
        return radius;
    }

    public Punt getMiddelpunt() {
        return middelpunt;
    }

    @Override
    public void teken(Graphics graphics) {

    }
}
