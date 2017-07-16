package domain.db;

import domain.model.Woord.WoordenLijst;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by yanice on 16/07/2017.
 */
public class WoordenLezer {

    public WoordenLijst createWoordenLijst() {
        WoordenLijst l = new WoordenLijst();
        try {
            Scanner input = new Scanner(new File("./src/main/resources/woorden.txt"));
            while (input.hasNextLine()) {
               l.voegToe(input.nextLine());
            }
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return l;
    }
}
