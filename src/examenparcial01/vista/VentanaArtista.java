/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package examenparcial01.vista;



import examenparcial01.controlador.EventoArtista;
import examenparcial01.controlador.GestionDato;
import examenparcial01.modelo.Artista;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
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
public class VentanaArtista extends JInternalFrame{
    
    private GestionDato gestionDato;
    private List<JLabel> etiList;
    private List<JTextField> txtList;
    private JButton boton;
    private Object[][] datos;
    private Object[] encabezado;
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JScrollPane scroll;
    private JPanel panel;
       
    
    public VentanaArtista(GestionDato gestionDato) {
        super("Registrar Artista",true,true,true,true);
        this.gestionDato = gestionDato;
        this.iniciaComponentes();
        this.setSize(600, 500);        
        
    }
    
    public void iniciaComponentes()
    {
        
        
        this.etiList= new ArrayList<JLabel>();
        this.txtList= new ArrayList<JTextField>();
        this.etiList.add(new JLabel("Nombre de Banda:"));
        this.etiList.add(new JLabel("Nombre Representante:"));
        this.etiList.add(new JLabel("Apellido Representante:"));
        this.etiList.add(new JLabel("Cedula Representante:"));
        this.etiList.add(new JLabel("Edad Representante:"));
        this.txtList.add(new JTextField(5));
        this.txtList.add(new JTextField(5)); 
        this.txtList.add(new JTextField(5)); 
        this.txtList.add(new JTextField(5)); 
        this.txtList.add(new JTextField(5)); 
         
        JPanel panel = new JPanel(new FlowLayout());
        
        panel.add(this.etiList.get(0));
        panel.add(this.txtList.get(0));
        
        panel.add(this.etiList.get(1));
        panel.add(this.txtList.get(1));
        
        panel.add(this.etiList.get(2));
        panel.add(this.txtList.get(2));
        
        panel.add(this.etiList.get(3));
        panel.add(this.txtList.get(3));
        
        panel.add(this.etiList.get(4));
        panel.add(this.txtList.get(4));
        
        
        this.encabezado= new Object[5];               
        this.encabezado[0]="Nombre Banda";
        this.encabezado[1]="Nombre";
        this.encabezado[2]="Apellido";
        this.encabezado[3]="Cedula";
        this.encabezado[4]="Edad";
    
        
        
        this.datos=cargaDatosTabla(this.gestionDato.getArtistaList().size(),5);
        
        this.modeloTabla = new DefaultTableModel(this.datos,this.encabezado);        
        this.tabla= new JTable(this.modeloTabla);
        this.scroll = new JScrollPane(this.tabla);
        this.boton=new JButton("Guardar");
        this.boton.addActionListener(new EventoArtista(this));
        panel.add(this.boton);
        panel.add(this.scroll);
        
        
        this.add(panel);
        
        
    }
    
    public Object[][] cargaDatosTabla(int h, int w)
    {
        Object[][] retorno= new Object[h][w];
        int i=0;
        for(Artista a:this.gestionDato.getArtistaList())
        {
            retorno[i][0]=a.getNombreBanda();
            retorno[i][1]=a.getNombre();
            retorno[i][2]=a.getApellido();
            retorno[i][3]="0"+a.getCedula();
            retorno[i][4]=a.getEdad();
            
        
            i++;
        }        
        return retorno;
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

    public JButton getBoton() {
        return boton;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }

    public Object[][] getDatos() {
        return datos;
    }

    public void setDatos(Object[][] datos) {
        this.datos = datos;
    }

    public Object[] getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(Object[] encabezado) {
        this.encabezado = encabezado;
    }

    public DefaultTableModel getModeloTabla() {
        return modeloTabla;
    }

    public void setModeloTabla(DefaultTableModel modeloTabla) {
        this.modeloTabla = modeloTabla;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    @Override
    public String toString() {
        return "VentanaArtista" + "gestionDato=" + gestionDato + ", etiList=" + etiList + ", txtList=" + txtList + ", boton=" + boton + ", datos=" + datos + ", encabezado=" + encabezado + ", modeloTabla=" + modeloTabla + ", tabla=" + tabla + ", scroll=" + scroll + ", panel=" + panel + '}';
    }
    
    
}


