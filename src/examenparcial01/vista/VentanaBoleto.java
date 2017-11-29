/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.vista;

import examenparcial01.controlador.EventoBoleto;
import examenparcial01.controlador.GestionDato;
import examenparcial01.modelo.Asistente;
import examenparcial01.modelo.Boleto;
import examenparcial01.modelo.Festival;
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
    private JComboBox comboAsistente;
    private JComboBox comboFestival;
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
        super("Boleto",true,true,true,true);
        this.gestionDato = gestionDato;
        this.iniciaComponente();
        this.setLocation(130, 50);
        this.setSize(550, 400);              
    }

    public GestionDato getGestionDato() {
        return gestionDato;
    }

    public void setGestionDato(GestionDato gestionDato) {
        this.gestionDato = gestionDato;
    }

    public JComboBox getComboAsistente() {
        return comboAsistente;
    }

    public void setComboAsistente(JComboBox comboAsistente) {
        this.comboAsistente = comboAsistente;
    }

    public JComboBox getComboFestival() {
        return comboFestival;
    }

    public void setComboFestival(JComboBox comboFestival) {
        this.comboFestival = comboFestival;
    }

    public List<JLabel> getEtiList() {
        return etiList;
    }

    public void setEtiList(List<JLabel> etiList) {
        this.etiList = etiList;
    }

    public List<JTextField> getTxtList() {
        return txtList;
    }

    public void setTxtList(List<JTextField> txtList) {
        this.txtList = txtList;
    }

    public List<JButton> getBotonList() {
        return botonList;
    }

    public void setBotonList(List<JButton> botonList) {
        this.botonList = botonList;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public DefaultTableModel getModeloTabla() {
        return modeloTabla;
    }

    public void setModeloTabla(DefaultTableModel modeloTabla) {
        this.modeloTabla = modeloTabla;
    }

    public Object[] getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(Object[] encabezado) {
        this.encabezado = encabezado;
    }

    public Object[][] getDatos() {
        return datos;
    }

    public void setDatos(Object[][] datos) {
        this.datos = datos;
    }
    
    public void iniciaComponente() {
        
        this.etiList= new ArrayList<JLabel>();
        this.txtList= new ArrayList<JTextField>();
        this.botonList= new ArrayList<JButton>();
        this.comboAsistente = new JComboBox(this.cargaComboAsistente());
        this.comboFestival = new JComboBox(this.cargaComboFestival());
        JPanel panel = new JPanel(new FlowLayout());
        
        this.etiList.add(new JLabel("Asistente:"));
        this.etiList.add(new JLabel("Festival:"));
        this.etiList.add(new JLabel("Asiento:"));
        
        this.txtList.add(new JTextField(7));
        
        this.botonList.add(new JButton("Guardar"));
        
        this.encabezado = new Object[4];               
        this.encabezado[0] = "Nombre Asistente";
        this.encabezado[1] = "Cedula";
        this.encabezado[2] = "Festival;";
        this.encabezado[3] = "Asiento";
        
        this.datos = cargaDatosTabla(this.gestionDato.getBoletoList().size(),4);

        this.modeloTabla = new DefaultTableModel(this.datos, this.encabezado);        
        this.tabla = new JTable(this.modeloTabla);
        this.scroll = new JScrollPane(this.tabla);
        
        panel.add(this.etiList.get(0));
        panel.add(this.comboAsistente);
        panel.add(this.etiList.get(1));
        panel.add(this.comboFestival);
        panel.add(this.etiList.get(2));
        panel.add(this.txtList.get(0));
        
        panel.add(this.botonList.get(0));
        panel.add(this.scroll);
        
        this.botonList.get(0).addActionListener(new EventoBoleto(this));
        
        this.add(panel);
        
    }
    
    public String[] cargaComboAsistente() {       
        String[] retorno = new String[this.gestionDato.getAsistenteList().size()];
        int i=0;
        for(Asistente a: this.gestionDato.getAsistenteList()) {
            retorno[i] = a.getNombre() + " " + a.getApellido() + " - CI: " + a.getCedula();
            i++;
        }
        return retorno;
    }
    
    public String[] cargaComboFestival() {       
        String[] retorno = new String[this.gestionDato.getFestivalList().size()];
        int i=0;
        for(Festival f: this.gestionDato.getFestivalList()) {
            retorno[i] = f.getNombreFestival() + " - Dir: " + f.getDireccion();
            i++;
        }
        return retorno;
    }
    
    public Object[][] cargaDatosTabla(int m, int n) {
        Object[][] retorno = new Object[m][n];
        int i=0;
        for(Boleto b: this.gestionDato.getBoletoList()) {
            retorno[i][0] = b.getA().getNombre() + " " + b.getA().getApellido();
            retorno[i][1] = b.getA().getCedula();
            retorno[i][2] = b.getF().getNombreFestival();
            retorno[i][3] = b.getAsiento();
            i++;
        }        
        return retorno;
    }
    
}
