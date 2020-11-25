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
public class Doctor extends Persona{
    
    protected int regDoctor;
    protected String especialidad;
    
    protected AreaMedica area;
    protected Secretaria secretaria;
    protected ArrayList<Cita> citasPendientes; 
    
    public void recetar(){
        
    }
    
    public void recetar(Paciente paciente,ArrayList<Medicamento> medicamentos, boolean nutricion){
        Receta receta = new Receta(new DateTimeAtCreation(new Date()),paciente, medicamentos);
        if(nutricion) agregarPlanut(receta);
        paciente.getRecetas().add(receta);
    }
    
    public void agregarPlanut(){
        
    }
    
    public void agregarPlanut(Receta receta){
        receta.setPlanNut(new PlanNutricional(""));
    }
    
    public void imprimirReceta(){
        
    }
    
    public void imprimirReceta(Receta receta, Paciente paciente){
        //enviarCorreo(paciente.getEmail(),receta);
        System.out.println("Fecha y hora de cita: "+receta.getFecha()+"\nAl paciente "+paciente+" se la ha recetado\n"+receta.getMedicamentos()+"\nAtt,\nDr(a)."+this.getNombre());
    }
    
    public void registrarSecretaria(){
    }

    public int getRegDoctor() {
        return regDoctor;
    }

    public void setRegDoctor(int regDoctor) {
        this.regDoctor = regDoctor;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public AreaMedica getArea() {
        return area;
    }

    public void setArea(AreaMedica area) {
        this.area = area;
    }

    public Secretaria getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(Secretaria secretaria) {
        this.secretaria = secretaria;
    }

    public ArrayList<Cita> getCitasPendientes() {
        return citasPendientes;
    }

    public void setCitasPendientes(ArrayList<Cita> citasPendientes) {
        this.citasPendientes = citasPendientes;
    }
    
    
}
