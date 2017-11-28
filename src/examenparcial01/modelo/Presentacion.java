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
public class Presentacion {
    
    private Festival festival;
    private Artista artista;
    private int numPresentaciones;

    public Presentacion(Festival festival, Artista artista, int numPresentaciones) {
        this.festival = festival;
        this.artista = artista;
        this.numPresentaciones = numPresentaciones;
    }

    public Festival getFestival() {
        return festival;
    }
    public void setFestival(Festival festival) {
        this.festival = festival;
    }
    public Artista getArtista() {
        return artista;
    }
    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    public int getNumPresentaciones() {
        return numPresentaciones;
    }
    public void setNumPresentaciones(int numPresentaciones) {
        this.numPresentaciones = numPresentaciones;
    }

    @Override
    public String toString() {
        return "Preentacion{" + "festival=" + festival + ", artista=" + artista + ", numPresentaciones=" + numPresentaciones + '}';
    }
    
}
