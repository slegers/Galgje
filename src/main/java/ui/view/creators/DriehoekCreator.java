package ui.view.creators;

import domain.model.DomainException;
import domain.model.Shapes.Driehoek;
import domain.model.Shapes.Punt;
import ui.controller.Controller;

import javax.swing.*;

/**
 * Created by yanice on 09/07/2017.
 */
public class DriehoekCreator {
    Punt p1,p2,p3;
    Driehoek d;
   public Driehoek createDrieHoek(){
       PuntCreator pc = new PuntCreator();
       p1 = pc.create();
       p2 = pc.create();
       p3 = pc.create();

       try{
           d = new Driehoek(p1,p2,p3);
           return d;
       }catch (DomainException e){
           JOptionPane.showMessageDialog(null,e.getMessage());
           return createDrieHoek();
       }
   }

    public void show() {
       d.toString();
    }
}
