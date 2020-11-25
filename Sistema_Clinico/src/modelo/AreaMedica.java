/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author le
 */
public class AreaMedica {
    
    protected String especialidad;
    protected float costo;
    
    protected ArrayList<Doctor> doctores;

    public AreaMedica(String especialidad, float costo, ArrayList<Doctor> doctores) {
        this.especialidad = especialidad;
        this.costo = costo;
        this.doctores = doctores;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public ArrayList<Doctor> getDoctores() {
        return doctores;
    }

    public void setDoctores(ArrayList<Doctor> doctores) {
        this.doctores = doctores;
    }
    
    
}
