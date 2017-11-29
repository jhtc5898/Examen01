/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.modelo;

/**
 *
 * @author Jose
 */
public class Festival 
{
    private String nombreFestival;
    private String direccion;
    private String auspicio;

    public String getNombreFestival() {
        return nombreFestival;
    }

    public void setNombreFestival(String nombreFestival) {
        this.nombreFestival = nombreFestival;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAuspicio() {
        return auspicio;
    }

    public void setAuspicio(String auspicio) {
        this.auspicio = auspicio;
    }

    public Festival(String nombreFestival, String direccion, String auspicio) {
        this.nombreFestival = nombreFestival;
        this.direccion = direccion;
        this.auspicio = auspicio;
    }

    @Override
    public String toString() {
        return  nombreFestival  ;
    }


  
}
