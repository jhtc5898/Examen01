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
public class Boleto {
    
    private Asistente a;
    private Festival f;
    private String asiento;

    public Boleto(Asistente a, Festival f, String asiento) {
        this.a = a;
        this.f = f;
        this.asiento = asiento;
    }

    public Asistente getA() {
        return a;
    }

    public void setA(Asistente a) {
        this.a = a;
    }

    public Festival getF() {
        return f;
    }

    public void setF(Festival f) {
        this.f = f;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    @Override
    public String toString() {
        return "Boleto{" + "a=" + a + ", f=" + f + ", asiento=" + asiento + '}';
    } 
    
}
