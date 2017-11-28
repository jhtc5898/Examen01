/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.vista;

import examenparcial01.controlador.GestionDato;
import javax.swing.JFrame;

/**
 *
 * @author Estudiante
 */
public class Ventana extends JFrame
{
    private GestionDato gestionDato;
    
    
    public Ventana(String t, GestionDato gD)
    {
        super(t);
        this.gestionDato=gD;
        this.setSize(800, 600);
        this.iniciaComponentes();
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
    }
    

    private void iniciaComponentes() {

    }
}
