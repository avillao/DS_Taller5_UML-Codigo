/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;
import javax.print.attribute.standard.DateTimeAtCreation;

/**
 *
 * @author le
 */
public class Paciente extends Persona {
    
    protected String email;
    
    protected HistoriaClinica historiaClinica;
    protected ArrayList<Receta> recetas;
    protected Cita cita;
    
    public boolean solicitarCita(Secretaria secretaria){
        cita = new Cita(new DateTimeAtCreation(new Date()),this);
        secretaria.agendarCita(cita);
        return true;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public ArrayList<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(ArrayList<Receta> recetas) {
        this.recetas = recetas;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }
    
    
}
