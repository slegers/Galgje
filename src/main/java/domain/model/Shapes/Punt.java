package domain.model.Shapes;;import java.awt.*;

/**
 * Created by yanice on 07/06/2017.
 */
public class Punt extends Vorm{

    private int x, y;

    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    protected void setOmhullende() {
        setOmhullende(new Omhullende(this,0,0));
    }

    @Override
    public String vorm() {
        return "Punt";
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ")";
    }

    @Override
    public boolean equals(Object o) {
        Punt p = null;
        try{
            p = (Punt) o;
        }catch (ClassCastException c){
            return false;
        }

        if (p == null) {
            return false;
        } else if (this.x == p.getX() && p.getY() == this.y) {
            return true;
        } else {
            return false;
        }
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}