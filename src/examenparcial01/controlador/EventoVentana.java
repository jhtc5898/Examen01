/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.controlador;

import examenparcial01.vista.Ventana;
import examenparcial01.vista.VentanaFestival;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author johne
 */
public class EventoVentana implements ActionListener
{
    private Ventana Ventana;

    public EventoVentana(Ventana Ventana) {
        this.Ventana = Ventana;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource().equals(this.Ventana.getMenuItemList().get(0))) 
         {
             System.err.println("Agregar ventana Asistente");
         }
         if (e.getSource().equals(this.Ventana.getMenuItemList().get(1))) 
         {
             System.err.println("Agregar ventana Artista");
         }
           if (e.getSource().equals(this.Ventana.getMenuItemList().get(2))) 
         {
             System.err.println("Agregar ventana Presentacion");
         }
           if (e.getSource().equals(this.Ventana.getMenuItemList().get(3))) 
         {
             System.err.println("Agregar ventana Festival");
              VentanaFestival VenFest = new VentanaFestival(this.Ventana.getGestionDato());
             VenFest.setVisible(true);
             this.Ventana.getEscritorio().add(VenFest);
         }
             if (e.getSource().equals(this.Ventana.getMenuItemList().get(4))) 
         {
             System.err.println("Agregar ventana Boleto");
         }
    }

    public Ventana getVentana() {
        return Ventana;
    }

    public void setVentana(Ventana Ventana) {
        this.Ventana = Ventana;
    }
    
    
}
