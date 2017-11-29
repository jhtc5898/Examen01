/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.vista;

import examenparcial01.controlador.GestionDato;
import examenparcial01.modelo.Artista;
import examenparcial01.modelo.Asistente;
import examenparcial01.modelo.Boleto;
import examenparcial01.modelo.Festival;
import examenparcial01.modelo.Presentacion;
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
        //Actual
        List<Boleto> lB = new ArrayList<Boleto>();
        List<Festival> Fv = new ArrayList<Festival>();
        List<Presentacion> lP = new ArrayList<Presentacion>();
        List<Artista> lA = new ArrayList<Artista>();
        List<Asistente> lAs = new ArrayList<Asistente>();
        GestionDato gD = new GestionDato(lB,Fv,lP,lA,lAs);
        
        Ventana v = new Ventana("Examen Parcial 01", gD);
    }
    
}
