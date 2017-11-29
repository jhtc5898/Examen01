/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.modelo;

/**
 *
 * @author Daniel
 */
public class Artista extends Persona {
    
    private String nombreBanda;

    public Artista(String nombreBanda, String nombre, String apellido, int cedula, int edad) {
        super(nombre, apellido, cedula, edad);
        this.nombreBanda = nombreBanda;
    }

    public String getNombreBanda() {
        return nombreBanda;
    }

    public void setNombreBanda(String nombreBanda) {
        this.nombreBanda = nombreBanda;
    }
    
}
