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
public class Secretaria extends Persona{
    
    protected Doctor doctor;
    
    public boolean verificarCita(){
        return doctor.getCitasPendientes().isEmpty();
    }
    
    public boolean agendaCita(){
        return false;
    }
    
    public boolean agendarCita(Cita cita){
        if(doctor.getCitasPendientes().contains(cita)) return false;
        cita.setPagada(false);
        doctor.getCitasPendientes().add(cita);
        return true;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
    
}
