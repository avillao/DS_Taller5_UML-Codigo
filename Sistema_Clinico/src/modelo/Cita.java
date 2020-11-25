/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Objects;
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

    public Cita(DateTimeAtCreation fecha, Paciente paciente) {
        this.fecha = fecha;
        this.paciente = paciente;
    }
    
    public void realizarPago(Pago pago){
        float valor = doctor.getArea().getCosto();
        pagada = pago.realizarPago(valor);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Cita other = (Cita) obj;
        return Objects.equals(this.fecha, other.fecha);
    }

    public DateTimeAtCreation getFecha() {
        return fecha;
    }

    public void setFecha(DateTimeAtCreation fecha) {
        this.fecha = fecha;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public String getRegistradoPor() {
        return registradoPor;
    }

    public void setRegistradoPor(String registradoPor) {
        this.registradoPor = registradoPor;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    
}
