package domain.model.Woord;

import domain.model.DomainException;

/**
 * Created by yanice on 15/07/2017.
 */
public class HintWoord {
    private String woord;
    private HintLetter[] array;
    public HintWoord(String woord){
        setWoord(woord);
        setHintLetters();
    }

    private void setHintLetters() {
        array = new HintLetter[woord.length()];
        for(int i = 0; i < woord.length(); i++){
            array[i] = new HintLetter(woord.charAt(i));
        }
    }

    public void setWoord(String woord) {
        if(woord == null || woord.trim().isEmpty()){
            throw new DomainException("Een woord dat geraden moet worden kan niet gelijk zijn aan null.");
        }
        this.woord = woord;
    }
    public boolean isGeraden(){
        for (int i = 0;i<woord.length();i++){
            if(!array[i].isGeraden()){
                return false;
            }
        }
        return true;
    }
    @Override
    public String toString(){
        String s = "";
        for(int i = 0; i < woord.length(); i++){
            s+= array[i].toChar() +" ";
        }
        return s.substring(0,s.length()-1);
    }
    public String getWoord(){
        return woord;
    }

    public boolean raad(char a) {
        boolean match = false;
        for(int i = 0; i < woord.length(); i++){
            if(array[i].raad(a)){
                match = true;
            }
        }
        return match;
    }
}
