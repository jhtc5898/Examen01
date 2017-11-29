/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.controlador;

import examenparcial01.modelo.Artista;
import examenparcial01.vista.VentanaArtista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose
 */
public class EventoArtista implements ActionListener {

    private VentanaArtista ventanaArtista;

    public EventoArtista(VentanaArtista VentanaArtista) {
        this.ventanaArtista = VentanaArtista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            
            String nB = this.ventanaArtista.getTxtList().get(0).getText();
            String nR = this.ventanaArtista.getTxtList().get(1).getText();
            String aR = this.ventanaArtista.getTxtList().get(2).getText();
            int cR = Integer.parseInt(this.ventanaArtista.getTxtList().get(3).getText());
            int eR = Integer.parseInt(this.ventanaArtista.getTxtList().get(4).getText());

            Artista artista = new Artista(nB,nR,aR,cR,eR);

            boolean bandera = true;

            int i = 0;

            for (Artista a : this.ventanaArtista.getGestionDato().getArtistaList()) {

                if (artista.getCedula() == this.ventanaArtista.getGestionDato().getArtistaList().get(i).getCedula()) {

                    JOptionPane.showMessageDialog(null, "Datos ya existentes");
                    bandera = false;
                    break;

                }

                i++;

            }
            if (bandera == true) {

                this.ventanaArtista.getGestionDato().addArtista(artista);

            }

        } catch (NumberFormatException a) {

            JOptionPane.showMessageDialog(null, "Llene correctamente los datos");

        } finally {
        }

        this.ventanaArtista.getTxtList().get(0).setText("");
        this.ventanaArtista.getTxtList().get(1).setText("");
        this.ventanaArtista.getTxtList().get(2).setText("");
        this.ventanaArtista.getTxtList().get(3).setText("");
        this.ventanaArtista.getTxtList().get(4).setText("");

        Object[][] datoArtista = this.ventanaArtista.cargaDatosTabla(this.ventanaArtista.getGestionDato().getArtistaList().size(), 5);
        this.ventanaArtista.setDatos(datoArtista);
        this.ventanaArtista.getModeloTabla().setDataVector(this.ventanaArtista.getDatos(), this.ventanaArtista.getEncabezado());

    }

    public VentanaArtista getVentanaArtista() {
        return ventanaArtista;
    }

    public void setVentanaArtista(VentanaArtista ventanaArtista) {
        this.ventanaArtista = ventanaArtista;
    }

    

}
