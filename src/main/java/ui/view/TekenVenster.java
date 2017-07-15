package ui.view;

import domain.model.Drawable;
import domain.model.Shapes.*;
import domain.model.Tekening;

import java.awt.*;

/**
 * Created by yanice on 14/07/2017.
 */
public class TekenVenster extends Canvas {
    private Tekening tekening;
    public TekenVenster(Tekening tekening){
        setTekening(tekening);
    }
    public void teken(){
        repaint();
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Vorm v : tekening.getVormen()) {
            switch (v.vorm()){
                case "Cirkel":
                    Cirkel c = (Cirkel) v;
                    g.drawOval(c.getMiddelpunt().getX(),c.getMiddelpunt().getY(),c.getRadius(),c.getRadius());
                    break;
                case "Rechthoek":
                    Rechthoek r = (Rechthoek) v;
                    g.drawRect(r.getLinkerBovenhoek().getX(),r.getLinkerBovenhoek().getY(),r.getBreedte(),r.getHoogte());
                    break;
                case "Driehoek":
                    Driehoek d = (Driehoek) v;
                    break;
                case "Lijnstuk":
                    LijnStuk l = (LijnStuk) v;
                    g.drawLine(l.getStartPunt().getX(),l.getStartPunt().getY(),l.getEindPunt().getX(),l.getEindPunt().getY());
                    break;
                case "Punt":
                    break;
                default:
                    break;
            }
        }
    }

    public void setTekening(Tekening tekening) {
        if(tekening == null){
            throw new UiException("Een tekening in tekenvenster mag niet gelijk zijn aan null.");
        }
        this.tekening = tekening;
    }
}
