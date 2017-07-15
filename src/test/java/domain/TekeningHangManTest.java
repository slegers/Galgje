package domain;

import domain.model.Shapes.*;
import org.junit.Before;

public class TekeningHangManTest {
    private Vorm galgBodem;
    private Vorm galgStaaf;
    private Vorm hangbar;
    private Vorm koord;
    private Vorm hoofd;
    private Vorm oogLinks;
    private Vorm oogRechts;
    private Vorm neus;
    private Vorm mond;
    private Vorm lijf;
    private Vorm beenLinks;
    private Vorm beenRechts;
    private Vorm voetLinks;
    private Vorm voetRechts;
    private Vorm armLinks;
    private Vorm armRechts;
    private Vorm handLinks;
    private Vorm handRechts;


    @Before
    public void setUp() {
        galgStaaf = new LijnStuk(new Punt(160, 350), new Punt(160, 50));// altijd zichtbaar
        hangbar = new LijnStuk(new Punt(160, 50), new Punt(280, 50));// altijd zichtbaar
        koord = new LijnStuk(new Punt(280, 50), new Punt(280, 100));// altijd zichtbaar
        hoofd = new Cirkel(new Punt(280, 125), 25);// zichtbaar na 1 fout
        oogLinks = new Cirkel(new Punt(270, 118), 2);// zichtbaar na 2 fouten
        oogRechts = new Cirkel(new Punt(290, 118), 2);//…
        neus = new Cirkel(new Punt(280, 128), 2);
        mond = new LijnStuk(new Punt(270, 138), new Punt(290, 138));
        lijf = new LijnStuk(new Punt(280, 150), new Punt(280, 250));
        beenLinks = new LijnStuk(new Punt(280, 250), new Punt(240, 310));
        beenRechts = new LijnStuk(new Punt(280, 250), new Punt(320, 310));
        voetLinks = new Cirkel(new Punt(240, 310), 5);
        galgBodem = new Rechthoek(new Punt(10, 350), 300, 40);// altijd zichtbaar
        voetRechts = new Cirkel(new Punt(320, 310), 5);
        armLinks = new LijnStuk(new Punt(280, 200), new Punt(230, 170));
        armRechts = new LijnStuk(new Punt(280, 200), new Punt(330, 170));
        handLinks = new Cirkel(new Punt(230, 170), 5);
        handRechts = new Cirkel(new Punt(330, 170), 5);
    }



}
