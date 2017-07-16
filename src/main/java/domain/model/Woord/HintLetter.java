package domain.model.Woord;

/**
 * Created by yanice on 15/07/2017.
 */
public class HintLetter {
    private char letter;
    private boolean isGeraden = false;
    public HintLetter(char letter){
        this.letter = letter;
    }
    public boolean raad(char letter){
        if(Character.toLowerCase(letter) == Character.toLowerCase(this.letter) && !isGeraden) {
            isGeraden = true;
            return isGeraden;
        }
        return false;
    }
    public boolean isGeraden(){
        return isGeraden;
    }

    public char toChar(){
        return isGeraden() ? letter : '_';

    }

    public char getLetter(){
        return letter;
    }
}
