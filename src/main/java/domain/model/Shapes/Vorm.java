package domain.model.Shapes;

import domain.model.DomainException;
import domain.model.Drawable;

import java.awt.*;

/**
 * Created by yanice on 07/06/2017.
 */
public abstract class Vorm implements Drawable {
    private boolean zichtbaar = false;
    private Omhullende omhullende;
    protected abstract void setOmhullende();
    public void setOmhullende(Omhullende o){
        this.omhullende = o;
    }
    public abstract String vorm();
    @Override
    public abstract String toString();
    @Override
    public abstract boolean equals(Object o);
    public Omhullende getOmhullende(){
        return omhullende;
    }

    @Override
    public void teken(Graphics graphics) {

    }

    public boolean isZichtbaar() {
        return zichtbaar;
    }

    public void setZichtbaar(boolean zichtbaar) {
        this.zichtbaar = zichtbaar;
    }
}
