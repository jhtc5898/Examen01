/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.controlador;

import examenparcial01.modelo.Festival;
import examenparcial01.vista.VentanaFestival;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author johne
 */
public class EventoFestival implements ActionListener
{
    private VentanaFestival VenFest;
    

    public EventoFestival(VentanaFestival VenFest) {
        this.VenFest = VenFest;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        try{
        if (e.getSource().equals(this.VenFest.getBoton()))
	        {
                  String nombre=this.VenFest.getTxtList().get(0).getText();//Leemos los datos del TxtFielda
                  String direccion=this.VenFest.getTxtList().get(1).getText();
                  String auspicio=this.VenFest.getTxtList().get(2).getText();//Cmabion de String a INT
                  
        Festival festival = new Festival(nombre,direccion,auspicio);
        this.VenFest.getGestionDato().addFestival(festival);
        this.VenFest.getTxtList().get(0).setText("");
        this.VenFest.getTxtList().get(1).setText("");
        this.VenFest.getTxtList().get(2).setText("");  
        Object [][] datoFestival=this.VenFest.cargaDatosTabla(this.VenFest.getGestionDato().getFestivalList().size(),3);
        this.VenFest.setDatos(datoFestival);
        this.VenFest.getModeloTabla().setDataVector(this.VenFest.getDatos(), this.VenFest.getEncabezado());  
                }
        }
        catch(NumberFormatException ae)
        {
           JOptionPane.showMessageDialog(null,"Error[Ingrese datos validos]"); 
        }
    }

    

    public VentanaFestival getVenFest() {
        return VenFest;
    }

    public void setVenFest(VentanaFestival VenFest) {
        this.VenFest = VenFest;
    }

    
    
}
