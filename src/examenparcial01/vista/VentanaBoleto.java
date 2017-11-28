/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.vista;

import examenparcial01.controlador.GestionDato;
import javax.swing.JInternalFrame;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose
 */
public class VentanaBoleto extends JInternalFrame {
    
    private GestionDato gestionDato;
    private JComboBox comboAspirante;
    private JComboBox comboCarrera;
    private List<JLabel> etiList;
    private List<JTextField> txtList;
    private List<JButton> botonList;
    private JPanel panel;
    private JScrollPane scroll;
    private JTable tabla;
    private DefaultTableModel modeloTabla;
    private Object[] encabezado;
    private Object[][] datos;
    
    public VentanaBoleto(GestionDato gestionDato) {
        super("Inscripcion",true,true,true,true);
        this.gestionDato = gestionDato;
        this.iniciaComponente();
        this.setLocation(170, 50);
        this.setSize(625, 550);              
    }
    
}
