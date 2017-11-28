/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.controlador;

import examenparcial01.modelo.Boleto;
import examenparcial01.modelo.Festival;
import examenparcial01.modelo.Presentacion;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class GestionDato {
    
    private List<Boleto> boletoList;
    private List<Festival> festivalList;
    private List<Presentacion> presentacionList;

    public GestionDato(List<Boleto> boletoList, List<Festival> festivalList, List<Presentacion> presentacionList) {
        this.boletoList = boletoList;
        this.festivalList = festivalList;
        this.presentacionList = presentacionList;
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
    
    
    
}
