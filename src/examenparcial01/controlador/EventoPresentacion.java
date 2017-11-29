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
import javax.swing.JDialog;
import javax.swing.JLabel;

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
        
        try {
            
            if(e.getSource().equals(this.ventanaPresentacion.getBotonList().get(0))) {
                
                int nFes = this.ventanaPresentacion.getComboFestival().getSelectedIndex();
                this.festival = this.ventanaPresentacion.getGestionDato().getFestivalList().get(nFes);
                int nArt = this.ventanaPresentacion.getComboArtista().getSelectedIndex();
                this.artista = this.ventanaPresentacion.getGestionDato().getArtistaList().get(nArt);
                int numPresentaciones = Integer.parseInt(this.ventanaPresentacion.getTxtList().get(0).getText());
        
                Presentacion p = new Presentacion(this.festival,this.artista,numPresentaciones);
                
                int i = 0;            
                boolean ban = true;
                for(Presentacion pr: this.ventanaPresentacion.getGestionDato().getPresentacionList()) {
                    
                    if (pr.getFestival().getNombreFestival() == p.getFestival().getNombreFestival() && pr.getArtista().equals(artista) == true) {
                    ban = false;
                    JDialog d = new JDialog();
                    d.setTitle("Error");
                    d.getContentPane().add(new JLabel("Dato ya ingresado"));
                    d.setSize(120, 100);
                    d.setLocation(830, 450);
                    d.setVisible(true);
                    break;
                    }
                    i++;
                }
                if(ban == true) {
                    this.ventanaPresentacion.getGestionDato().addPresentacion(p);
                }
                
                Object[][] datoPresentacion = this.ventanaPresentacion.cargaDatosTabla(this.ventanaPresentacion.getGestionDato().getPresentacionList().size(), 3);
                this.ventanaPresentacion.setDatos(datoPresentacion);
                this.ventanaPresentacion.getModeloTabla().setDataVector(this.ventanaPresentacion.getDatos(), this.ventanaPresentacion.getEncabezado());
            }
                 
        }catch(NumberFormatException ae) {
            JDialog d = new JDialog();
            d.setTitle("Error");
            d.getContentPane().add(new JLabel("Llene los casilleros correctamente"));
            d.setSize(220, 100);
            d.setLocation(550, 450);
            d.setVisible(true);
            } 
                
    }
    
}
 