/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.vista;

import examenparcial01.controlador.EventoVentana;
import examenparcial01.controlador.GestionDato;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Estudiante
 */
public class Ventana extends JFrame
{
    private GestionDato gestionDato;
    private JDesktopPane escritorio;
    private JMenuBar barraMenu;
    private java.util.List<JMenu> menuList;
    private ArrayList<JMenuItem> menuItemList;
    private GestionDato Gd;
    
    public Ventana(String t, GestionDato gD)
    {
        super(t);
        this.gestionDato=gD;
        this.setSize(800, 600);
        this.iniciaComponentes();
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
    }
    private void iniciaComponentes() 
    {
       this.escritorio= new JDesktopPane();
        this.barraMenu= new JMenuBar();
        this.menuList=new ArrayList<JMenu>();// llamado al array
        this.menuList.add(new JMenu("Participante"));// ingreso de datos en el array
        this.menuList.add(new JMenu("Actividad"));// ingreso de datos en el array
        this.menuList.add(new JMenu("Imprimir"));// ingreso de datos en el array


        this.menuItemList= new ArrayList<JMenuItem>();
        this.menuItemList.add(new JMenuItem("Agregar Asistente"));
        this.menuItemList.add(new JMenuItem("Agregar Artista"));
        this.menuItemList.add(new JMenuItem("Agregar Presentacion"));
        this.menuItemList.add(new JMenuItem("Agregar Festival"));
        this.menuItemList.add(new JMenuItem("Boleto"));

        
        this.setContentPane(this.escritorio);
        this.setJMenuBar(barraMenu);
        
        this.barraMenu.add(this.menuList.get(0));
        this.menuList.get(0).add(this.menuItemList.get(0));
        this.menuList.get(0).add(this.menuItemList.get(1));
        
        this.barraMenu.add(this.menuList.get(1));
        this.menuList.get(1).add(this.menuItemList.get(2));
        this.menuList.get(1).add(this.menuItemList.get(3));
        
        this.barraMenu.add(this.menuList.get(2));
        this.menuList.get(2).add(this.menuItemList.get(4));
        
        this.menuItemList.get(0).addActionListener(new EventoVentana(this));
        this.menuItemList.get(1).addActionListener(new EventoVentana(this));
        this.menuItemList.get(2).addActionListener(new EventoVentana(this));
        this.menuItemList.get(3).addActionListener(new EventoVentana(this));
        this.menuItemList.get(4).addActionListener(new EventoVentana(this));

    }

    public GestionDato getGestionDato() {
        return gestionDato;
    }

    public void setGestionDato(GestionDato gestionDato) {
        this.gestionDato = gestionDato;
    }

    public JDesktopPane getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(JDesktopPane escritorio) {
        this.escritorio = escritorio;
    }

    public JMenuBar getBarraMenu() {
        return barraMenu;
    }

    public void setBarraMenu(JMenuBar barraMenu) {
        this.barraMenu = barraMenu;
    }

    public List<JMenu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<JMenu> menuList) {
        this.menuList = menuList;
    }

    public ArrayList<JMenuItem> getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(ArrayList<JMenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    public GestionDato getGd() {
        return Gd;
    }

    public void setGd(GestionDato Gd) {
        this.Gd = Gd;
    }
    
}
