/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.vista;

import examenparcial01.controlador.GestionDato;
import examenparcial01.modelo.Boleto;
import examenparcial01.vista.Ventana;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Boleto> lB = new ArrayList<Boleto>();
        GestionDato gD = new GestionDato(lB);
        
        
        Ventana v = new Ventana("Examen Parcial 01", gD);
    }
    
}
