package ui.view;

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
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        for (Vorm v : tekening.getVormen()) {
            if(!v.isZichtbaar()){
            switch (v.vorm()){
                case "Cirkel":
                    Cirkel c = (Cirkel) v;
                    g2.drawOval(c.getMiddelpunt().getX(),c.getMiddelpunt().getY(),c.getRadius(),c.getRadius());
                    break;
                case "Rechthoek":
                    Rechthoek r = (Rechthoek) v;
                    g2.drawRect(r.getLinkerBovenhoek().getX(),r.getLinkerBovenhoek().getY(),r.getBreedte(),r.getHoogte());
                    break;
                case "Driehoek":
                    Driehoek d = (Driehoek) v;
                    g2.drawLine(d.getHoekPunt1().getX(),d.getHoekPunt1().getY(),d.getHoekPunt2().getX(),d.getHoekPunt2().getY());
                    g2.drawLine(d.getHoekPunt3().getX(),d.getHoekPunt3().getY(),d.getHoekPunt2().getX(),d.getHoekPunt2().getY());
                    g2.drawLine(d.getHoekPunt1().getX(),d.getHoekPunt1().getY(),d.getHoekPunt3().getX(),d.getHoekPunt3().getY());
                    break;
                case "Lijnstuk":
                    LijnStuk l = (LijnStuk) v;
                    g2.drawLine(l.getStartPunt().getX(),l.getStartPunt().getY(),l.getEindPunt().getX(),l.getEindPunt().getY());
                    break;
                case "Punt":
                    break;
                default:
                    break;
            }
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
