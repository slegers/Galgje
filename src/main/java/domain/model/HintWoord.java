package domain.model;

import com.sun.java.browser.plugin2.DOM;

/**
 * Created by yanice on 15/07/2017.
 */
public class HintWoord {
    private String woord;
    public HintWoord(String woord){
        setWoord(woord);
    }

    public void setWoord(String woord) {
        if(woord == null){
            throw new DomainException("Een woord dat geraden moet worden kan niet gelijk zijn aan null.");
        }
        this.woord = woord;
    }
    public boolean isGeraden(){
        return false;
    }
    @Override
    public String toString(){
        return "_____";
    }
    public String getWoord(){
        return woord;
    }

}
