/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import javax.print.attribute.standard.DateTimeAtCreation;

/**
 *
 * @author le
 */
class Receta {
    
    protected DateTimeAtCreation fecha;
    
    protected PlanNutricional planNut;
    protected Paciente paciente;
    protected ArrayList<Medicamento> medicamentos;
    protected Doctor doctor;

    public Receta(DateTimeAtCreation fecha, Paciente paciente, ArrayList<Medicamento> medicamentos) {
        this.fecha = fecha;
        this.paciente = paciente;
        this.medicamentos = medicamentos;
    }

    public DateTimeAtCreation getFecha() {
        return fecha;
    }

    public void setFecha(DateTimeAtCreation fecha) {
        this.fecha = fecha;
    }

    public PlanNutricional getPlanNut() {
        return planNut;
    }

    public void setPlanNut(PlanNutricional planNut) {
        this.planNut = planNut;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Receta{" + "fecha=" + fecha + ", planNut=" + planNut + ", medicamentos=" + medicamentos + ", doctor=" + doctor + '}';
    }
    
    
}
