/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.controlador;

import examenparcial01.modelo.Artista;
import examenparcial01.modelo.Festival;
import examenparcial01.modelo.Presentacion;
import examenparcial01.vista.VentanaPresentacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Daniel
 */
public class EventoPresentacion implements ActionListener {
    private VentanaPresentacion ventanaPresentacion;
    private Festival festival;
    private Artista artista;

    public EventoPresentacion(VentanaPresentacion ventanaPresentacion) {
        this.ventanaPresentacion = ventanaPresentacion;
    }

    public VentanaPresentacion getVentanaPresentacion() {
        return ventanaPresentacion;
    }
    public void setVentanaPresentacion(VentanaPresentacion ventanaPresentacion) {
        this.ventanaPresentacion = ventanaPresentacion;
    }
    public Festival getFestival() {
        return festival;
    }
    public void setFestival(Festival festival) {
        this.festival = festival;
    }
    public Artista getArtista() {
        return artista;
    }
    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        int nFes = this.ventanaPresentacion.getComboFestival().getSelectedIndex();
        this.festival = this.ventanaPresentacion.getGestionDato().getFestivalList().get(nFes);
        int nArt = this.ventanaPresentacion.getComboArtista().getSelectedIndex();
        this.artista = this.ventanaPresentacion.getGestionDato().getArtistaList().get(nFes);
        int numPresentaciones = Integer.parseInt(this.ventanaPresentacion.getTxtList().get(0).getText());
        
        Presentacion p = new Presentacion(this.festival,this.artista,numPresentaciones);
        
        this.ventanaPresentacion.getGestionDato().addPresentacion(p);
        
        Object[][] datoPresentacion = this.ventanaPresentacion.cargaDatosTabla(this.ventanaPresentacion.getGestionDato().getPresentacionList().size(), 3);
        this.ventanaPresentacion.setDatos(datoPresentacion);
        this.ventanaPresentacion.getModeloTabla().setDataVector(this.ventanaPresentacion.getDatos(), this.ventanaPresentacion.getEncabezado());
    }
    
    
}
