/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.controlador;



import examenparcial01.modelo.Asistente;
import examenparcial01.vista.VentanaAsistente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose
 */
public class EventoAsistente implements ActionListener {

    private VentanaAsistente ventanaAsistente;

    public EventoAsistente(VentanaAsistente VentanaAsistente) {
        this.ventanaAsistente = VentanaAsistente;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            
            String nA = this.ventanaAsistente.getTxtList().get(0).getText();
            String aA = this.ventanaAsistente.getTxtList().get(1).getText();
            int cA = Integer.parseInt(this.ventanaAsistente.getTxtList().get(2).getText());
            int eA = Integer.parseInt(this.ventanaAsistente.getTxtList().get(3).getText());

            Asistente asistente = new Asistente(nA,aA,cA,eA);

            boolean bandera = true;

            int i = 0;

            for (Asistente a : this.ventanaAsistente.getGestionDato().getAsistenteList()) {

                if (asistente.getCedula() == this.ventanaAsistente.getGestionDato().getAsistenteList().get(i).getCedula()) {

                    JOptionPane.showMessageDialog(null, "Datos ya existentes");
                    bandera = false;
                    break;

                }

                i++;

            }
            if (bandera == true) {

                this.ventanaAsistente.getGestionDato().addAsistente(asistente);

            }

        } catch (NumberFormatException a) {

            JOptionPane.showMessageDialog(null, "Llene correctamente los datos");

        } finally {
        }

        this.ventanaAsistente.getTxtList().get(0).setText("");
        this.ventanaAsistente.getTxtList().get(1).setText("");
        this.ventanaAsistente.getTxtList().get(2).setText("");
        this.ventanaAsistente.getTxtList().get(3).setText("");

        Object[][] datoAsistente = this.ventanaAsistente.cargaDatosTabla(this.ventanaAsistente.getGestionDato().getAsistenteList().size(), 4);
        this.ventanaAsistente.setDatos(datoAsistente);
        this.ventanaAsistente.getModeloTabla().setDataVector(this.ventanaAsistente.getDatos(), this.ventanaAsistente.getEncabezado());

    }

    public VentanaAsistente getVentanaAsistente() {
        return ventanaAsistente;
    }

    public void setVentanaAsistente(VentanaAsistente ventanaAsistente) {
        this.ventanaAsistente = ventanaAsistente;
    }

    

    

}
