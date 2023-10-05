/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Rain
 */
public class Televisores extends Dispositivos implements Mantenimiento {

    /**
     * @return the tecnologia
     */
    public String getTecnologia() {
        return tecnologia;
    }

    /**
     * @param tecnologia the tecnologia to set
     */
    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    /**
     * @return the tamaño
     */
    public Double getTamaño() {
        return tamaño;
    }

    /**
     * @param tamaño the tamaño to set
     */
    public void setTamaño(Double tamaño) {
        this.tamaño = tamaño;
    }

    private String tecnologia;
    private Double tamaño;

    @Override
    public double mantenimientoPreventivo() {
         double mantenimientop = 65000;
                 
        return mantenimientop;
    }

    @Override
    public double mantenimientoCorrectivo() {
        double costoFijo = 30000;
        
        double manodeObra = costoFijo+ (tamaño*10000)*0.15;
                return manodeObra;
    }

    

}
