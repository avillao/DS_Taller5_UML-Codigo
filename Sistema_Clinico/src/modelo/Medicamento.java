/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author le
 */
public class Medicamento {
    
    protected String medicina;
    protected String dosis;
    protected String observaciones;
    protected int cantidadTotal;
    protected String unidad;

    public Medicamento(String medicina, String dosis, String observaciones, int cantidadTotal, String unidad) {
        this.medicina = medicina;
        this.dosis = dosis;
        this.observaciones = observaciones;
        this.cantidadTotal = cantidadTotal;
        this.unidad = unidad;
    }
    
    public String getMedicina() {
        return medicina;
    }

    public void setMedicina(String medicina) {
        this.medicina = medicina;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(int cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    
    
    
}
