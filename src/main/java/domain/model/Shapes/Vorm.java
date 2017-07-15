package domain.model.Shapes;

import domain.model.DomainException;
import domain.model.Drawable;

/**
 * Created by yanice on 07/06/2017.
 */
public abstract class Vorm implements Drawable {

    private Omhullende omhullende;

    public Vorm(){
    }

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

}
