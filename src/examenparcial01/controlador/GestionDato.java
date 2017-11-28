/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.controlador;

import examenparcial01.modelo.Boleto;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class GestionDato {
    
    private List<Boleto> boletoList;

    public GestionDato(List<Boleto> boletoList) {
        this.boletoList = boletoList;
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
    
}
