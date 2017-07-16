package domain.model.Tekenings;

import domain.model.Shapes.*;
import domain.model.Tekening;

/**
 * Created by yanice on 16/07/2017.
 */
public class TekeningHangMan extends Tekening {
    Vorm galgBodem = new Rechthoek(new Punt(10, 350), 300, 40);// altijd zichtbaar
    Vorm galgStaaf = new LijnStuk(new Punt(160, 350), new Punt(160, 50));// altijd zichtbaar
    Vorm hangbar = new LijnStuk(new Punt(160, 50), new Punt(280, 50));// altijd zichtbaar
    Vorm koord = new LijnStuk(new Punt(280, 50), new Punt(280, 100));// altijd zichtbaar
    Vorm hoofd = new Cirkel(new Punt(255, 100), 50);// zichtbaar na 1 fout
    Vorm oogLinks = new Cirkel(new Punt(270, 118), 2);// zichtbaar na 2 fouten
    Vorm oogRechts = new Cirkel(new Punt(290, 118), 2);//...
    Vorm neus = new Cirkel(new Punt(280, 128), 2);
    Vorm mond = new LijnStuk(new Punt(270, 138), new Punt(290, 138));
    Vorm lijf = new LijnStuk(new Punt(280, 150), new Punt(280, 250));
    Vorm beenLinks = new LijnStuk(new Punt(280, 250), new Punt(240, 310));
    Vorm beenRechts = new LijnStuk(new Punt(280, 250), new Punt(320, 310));
    Vorm voetLinks = new Cirkel(new Punt(240, 310), 10);
    Vorm voetRechts = new Cirkel(new Punt(320, 310), 10);
    Vorm armLinks = new LijnStuk(new Punt(280, 200), new Punt(230, 170));
    Vorm armRechts = new LijnStuk(new Punt(280, 200), new Punt(330, 170));
    Vorm handLinks = new Cirkel(new Punt(230, 170), 10);
    Vorm handRechts = new Cirkel(new Punt(330, 170), 10);

    public TekeningHangMan(String naam) {
        super(naam);
        voegToe(galgBodem);
        voegToe(galgStaaf);
        voegToe(hangbar);
        voegToe(koord);
        voegToe(hoofd);
        voegToe(oogLinks);
        voegToe(oogRechts);
        voegToe(neus);
        voegToe(mond);
        voegToe(lijf);
        voegToe(beenLinks);
        voegToe(beenRechts);
        voegToe(voetLinks);
        voegToe(voetRechts);
        voegToe(armLinks);
        voegToe(armRechts);
        voegToe(handLinks);
        voegToe(handRechts);
    }
}
