/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.print.attribute.standard.DateTimeAtCreation;

/**
 *
 * @author le
 */
public class Cita {
    
    protected DateTimeAtCreation fecha;
    protected boolean pagada;
    protected String registradoPor;
    
    protected Doctor doctor;
    protected Paciente paciente;
    
    
    
    public void realizarPago(Pago pago){
    }
}
