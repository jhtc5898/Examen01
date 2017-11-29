/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.controlador;

import examenparcial01.modelo.Artista;
import examenparcial01.modelo.Asistente;
import examenparcial01.modelo.Boleto;
import examenparcial01.modelo.Festival;
import examenparcial01.modelo.Presentacion;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class GestionDato {
    
    private List<Boleto> boletoList;
    private List<Festival> festivalList;
    private List<Presentacion> presentacionList;
    private List<Artista> artistaList;
    private List<Asistente> asistenteList;

    public GestionDato(List<Boleto> boletoList, List<Festival> festivalList, List<Presentacion> presentacionList, List<Artista> artistaList, List<Asistente> asistenteList) {
        this.boletoList = boletoList;
        this.festivalList = festivalList;
        this.presentacionList = presentacionList;
        this.artistaList = artistaList;
        this.asistenteList = asistenteList;
    }

    public boolean addAsistente(Asistente as)
    {
        return this.asistenteList.add(as);
    } 
    
    public boolean addArtista(Artista a)
    {
        return this.artistaList.add(a);
    }
    
    public boolean addFestival(Festival p)
    {
        return this.festivalList.add(p);
    }

    public List<Boleto> getBoletoList() {
        return boletoList;
    }

    public void setBoletoList(List<Boleto> boletoList) {
        this.boletoList = boletoList;
    }
    
    public boolean addBoleto(Boleto boleto) {
        return this.boletoList.add(boleto);
    }

    public List<Festival> getFestivalList() {
        return festivalList;
    }

    public void setFestivalList(List<Festival> festivalList) {
        this.festivalList = festivalList;
    }

    public List<Presentacion> getPresentacionList() {
        return presentacionList;
    }

    public void setPresentacionList(List<Presentacion> presentacionList) {
        this.presentacionList = presentacionList;
    }
    
    public boolean addPresentacion(Presentacion presentacion) {
        return this.presentacionList.add(presentacion);
    }

    public List<Artista> getArtistaList() {
        return artistaList;
    }

    public void setArtistaList(List<Artista> artistaList) {
        this.artistaList = artistaList;
    }

    public List<Asistente> getAsistenteList() {
        return asistenteList;
    }

    public void setAsistenteList(List<Asistente> asistenteList) {
        this.asistenteList = asistenteList;
    }
    
    
    
}
