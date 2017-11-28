/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.vista;

import examenparcial01.controlador.EventoPresentacion;
import examenparcial01.controlador.GestionDato;
import examenparcial01.modelo.Artista;
import examenparcial01.modelo.Festival;
import examenparcial01.modelo.Presentacion;
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
 * @author Daniel
 */
public class VentanaPresentacion extends JInternalFrame{
    
    private GestionDato gestionDato;
    private List<JLabel> etiList;
    private List<JTextField> txtList;
    private List<JButton> botonList;
    private JPanel panel;
    private JComboBox comboFestival;
    private JComboBox comboArtista;
    private JScrollPane scroll;
    private JTable tabla;
    private DefaultTableModel modeloTabla;
    private Object[] encabezado;
    private Object[][] datos;
    
    public VentanaPresentacion(GestionDato gestionDato) 
    {
        super("Ventana Presentacion",true,true,true,true);
        this.gestionDato = gestionDato;
        this.setSize(625, 550);
        this.setLocation(420, 120);
        this.iniciaComponente();              
    }

    public GestionDato getGestionDato() {
        return gestionDato;
    }
    public void setGestionDato(GestionDato gestionDato) {
        this.gestionDato = gestionDato;
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
    public JComboBox getComboFestival() {
        return comboFestival;
    }
    public void setComboFestival(JComboBox comboFestival) {
        this.comboFestival = comboFestival;
    }
    public JComboBox getComboArtista() {
        return comboArtista;
    }
    public void setComboArtista(JComboBox comboArtista) {
        this.comboArtista = comboArtista;
    }
    
    
    public void iniciaComponente(){
        
        this.etiList= new ArrayList<JLabel>();
        this.txtList= new ArrayList<JTextField>();
        this.botonList= new ArrayList<JButton>();
        this.comboFestival = new JComboBox(this.cargaCombo());
        this.comboArtista = new JComboBox(this.cargaCombo2());
        JPanel panel = new JPanel(new FlowLayout());
        
        this.etiList.add(new JLabel("Festival"));
        this.etiList.add(new JLabel("Artista"));
        this.etiList.add(new JLabel("# Presentaciones"));
        
        this.botonList.add(new JButton("Guardar"));
        this.botonList.add(new JButton("Limpiar"));
        
        this.encabezado = new Object[3];               
        this.encabezado[0] = "Festival";
        this.encabezado[1] = "Artista";
        this.encabezado[2] = "# Presentaciones";
        
        this.datos = cargaDatosTabla(this.gestionDato.getPresentacionList().size(),4);
        
        this.modeloTabla = new DefaultTableModel(this.datos, this.encabezado);        
        this.tabla = new JTable(this.modeloTabla);
        this.scroll = new JScrollPane(this.tabla);
        
        panel.add(this.etiList.get(0));
        panel.add(this.comboFestival);
        panel.add(this.etiList.get(1));
        panel.add(this.comboArtista);
        panel.add(this.etiList.get(2));
        panel.add(this.txtList.get(2));
        
        this.botonList.get(0).addActionListener(new EventoPresentacion(this));
        this.botonList.get(1).addActionListener(new EventoPresentacion(this));
        
        this.add(panel);
    }
    
    public String[] cargaCombo() 
    {       
        String[] retorno = new String[this.gestionDato.getFestivalList().size()];
        int i=0;
        for(Festival f: this.gestionDato.getFestivalList()) 
        {
            retorno[i] = f.getNombreFestival();
            i++;
        }
        return retorno;
    }
    
    public String[] cargaCombo2() 
    {       
        String[] retorno = new String[this.gestionDato.getArtistaList().size()];
        int i=0;
        for(Artista a: this.gestionDato.getArtistaList()) 
        {
            retorno[i] = a.getNombre() + "" +a.getApellido();
            i++;
        }
        return retorno;
    }
    public Object[][] cargaDatosTabla(int m, int n) 
    {
        Object[][] retorno = new Object[m][n];
        int i=0;
        for(Presentacion p:this.gestionDato.getPresentacionList()) 
        {
            retorno[i][0] = p.getFestival();
            retorno[i][1] = p.getArtista();
            retorno[i][2] = p.getNumPresentaciones();
            i++;
        }        
        return retorno;
    }
}
