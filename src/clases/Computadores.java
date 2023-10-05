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
public class Computadores extends Dispositivos implements Mantenimiento {

    /**
     * @return the ram
     */
    public int getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    public void setRam(int ram) {
        this.ram = ram;
    }

    /**
     * @return the disco
     */
    public String getDisco() {
        return disco;
    }

    /**
     * @param disco the disco to set
     */
    public void setDisco(String disco) {
        this.disco = disco;
    }

    /**
     * @return the procesador
     */
    public String getProcesador() {
        return procesador;
    }

    /**
     * @param procesador the procesador to set
     */
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    private int ram;
    private String disco;
    private String procesador;

    @Override
    public double mantenimientoPreventivo() {
        double mantenimientop = 70000;
                 
        return mantenimientop;
    }

    @Override
    public double mantenimientoCorrectivo() {
        double costoFijo = 30000;
        
        double manodeObra = costoFijo+(ram*10000)*0.15;
                return manodeObra;
    }
}
