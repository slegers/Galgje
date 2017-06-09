package domain.model.Shapes;;

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
    public String toString() {
        return "(" + getX() + ", " + getY() + ")";
    }

    @Override
    public boolean equals(Object o) {
        Punt p = (Punt) o;
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