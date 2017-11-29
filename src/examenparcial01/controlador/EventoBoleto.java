/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.controlador;

import examenparcial01.modelo.Asistente;
import examenparcial01.modelo.Boleto;
import examenparcial01.modelo.Festival;
import examenparcial01.vista.VentanaBoleto;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.UIManager;

/**
 *
 * @author pedro
 */
public class EventoBoleto implements ActionListener {

    private VentanaBoleto ventanaBoleto;
    private Asistente asistente;
    private Festival festival;

    public EventoBoleto(VentanaBoleto ventanaBoleto) {
        this.ventanaBoleto = ventanaBoleto;
    }

    public VentanaBoleto getVentanaBoleto() {
        return ventanaBoleto;
    }

    public void setVentanaBoleto(VentanaBoleto ventanaBoleto) {
        this.ventanaBoleto = ventanaBoleto;
    }

    public Asistente getAsistente() {
        return asistente;
    }

    public void setAsistente(Asistente asistente) {
        this.asistente = asistente;
    }

    public Festival getFestival() {
        return festival;
    }

    public void setFestival(Festival festival) {
        this.festival = festival;
    } 
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        try {
            
            if(ae.getSource().equals(this.ventanaBoleto.getBotonList().get(0))) {
            
            int numAs = this.ventanaBoleto.getComboAsistente().getSelectedIndex();
            this.asistente = this.ventanaBoleto.getGestionDato().getAsistenteList().get(numAs);
            
            int numF = this.ventanaBoleto.getComboFestival().getSelectedIndex();
            this.festival = this.ventanaBoleto.getGestionDato().getFestivalList().get(numF);
            
            String asiento = this.ventanaBoleto.getTxtList().get(0).getText();
            
            Boleto b = new Boleto(this.asistente, this.festival, asiento);
            
            //Control Dato Repetido:
            
            int i = 0;            
            boolean ban = true;
            for(Boleto bo: this.ventanaBoleto.getGestionDato().getBoletoList()) {
                if (bo.getA().getCedula() == b.getA().getCedula() && bo.getAsiento().equals(asiento) == true) {
                    ban = false;
                    JDialog d = new JDialog();
                    d.setTitle("Error");
                    d.getContentPane().add(new JLabel("    Este Registro de Boleto ya ha sido ingresado."));
                    d.setSize(320, 100);
                    d.setLocation(830, 400);
                    d.setVisible(true);
                    break;
                }
                i++;
            }
            if(ban == true) {
                this.ventanaBoleto.getGestionDato().addBoleto(b);
            }
            
            Object[][] datoBoleto = this.ventanaBoleto.cargaDatosTabla(this.ventanaBoleto.getGestionDato().getBoletoList().size(), 4);
            this.ventanaBoleto.setDatos(datoBoleto);
            this.ventanaBoleto.getModeloTabla().setDataVector(this.ventanaBoleto.getDatos(), this.ventanaBoleto.getEncabezado());
                       
            } 
            
        } catch(NumberFormatException e) {
            JDialog d = new JDialog();
            d.setTitle("Error");
            d.getContentPane().add(new JLabel("   Los casilleros NO se han llenado correctamente."));
            d.setSize(320, 100);
            d.setLocation(830, 400);
            d.setBackground(Color.RED);
            d.setVisible(true);
        } catch(ArrayIndexOutOfBoundsException e2) {
            JDialog d = new JDialog();            
            d.setTitle("Error");
            d.getContentPane().add(new JLabel("  NO se han encontrado Asisitentes o Festivales."));
            d.setSize(320, 100);
            d.setLocation(830, 400);
            d.setBackground(Color.RED);
            d.setVisible(true);
        }
        
    }
    
}
