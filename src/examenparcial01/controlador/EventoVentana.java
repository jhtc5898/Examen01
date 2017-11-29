/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.controlador;

import examenparcial01.vista.Ventana;
import examenparcial01.vista.VentanaArtista;
import examenparcial01.vista.VentanaAsistente;
import examenparcial01.vista.VentanaBoleto;
import examenparcial01.vista.VentanaFestival;
import examenparcial01.vista.VentanaPresentacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author johne
 */
public class EventoVentana implements ActionListener {

    private Ventana Ventana;

    public EventoVentana(Ventana Ventana) {
        this.Ventana = Ventana;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.Ventana.getMenuItemList().get(0))) {
            
            
            VentanaAsistente vA = new VentanaAsistente(this.Ventana.getGestionDato());
            vA.setVisible(true);
            this.Ventana.getEscritorio().add(vA);
        }
        if (e.getSource().equals(this.Ventana.getMenuItemList().get(1))) {
            
            VentanaArtista vA = new VentanaArtista(this.Ventana.getGestionDato());
            vA.setVisible(true);
            this.Ventana.getEscritorio().add(vA);
            
        }
        if (e.getSource().equals(this.Ventana.getMenuItemList().get(2))) {
            System.err.println("Agregar ventana Presentacion");
            VentanaPresentacion VenPre = new VentanaPresentacion(this.Ventana.getGestionDato());
            VenPre.setVisible(true);
            this.Ventana.getEscritorio().add(VenPre);
            
        }
        if (e.getSource().equals(this.Ventana.getMenuItemList().get(3))) {
            System.err.println("Agregar ventana Festival");
            VentanaFestival VenFest = new VentanaFestival(this.Ventana.getGestionDato());
            VenFest.setVisible(true);
            this.Ventana.getEscritorio().add(VenFest);
        }
        if (e.getSource().equals(this.Ventana.getMenuItemList().get(4))) {
            VentanaBoleto vB = new VentanaBoleto(this.Ventana.getGestionDato());
            vB.setVisible(true);
            this.Ventana.getEscritorio().add(vB);
        }
    }

    public Ventana getVentana() {
        return Ventana;
    }

    public void setVentana(Ventana Ventana) {
        this.Ventana = Ventana;
    }

}
