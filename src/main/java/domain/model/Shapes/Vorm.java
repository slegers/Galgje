package domain.model.Shapes;

/**
 * Created by yanice on 07/06/2017.
 */
public abstract class Vorm {

    private Omhullende omhullende;

    public Vorm(){
    }

    public abstract String vorm();
    @Override
    public abstract String toString();
    @Override
    public abstract boolean equals(Object o);
}
