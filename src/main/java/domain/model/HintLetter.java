package domain.model;

/**
 * Created by yanice on 15/07/2017.
 */
public class HintLetter {
    private char letter;
    public HintLetter(char letter){
        this.letter = letter;
    }
    public void raad(char letter){

    }
    public boolean isGeraden(){
        return false;
    }
    public char toChar(){
        return 's';
    }
    public char getLetter(){
        return letter;
    }
}
