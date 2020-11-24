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
class Doctor extends Persona{
    
    protected int regDoctor;
    protected String especialidad;
    
    protected AreaMedica area;
    protected Secretaria secretaria;
    protected ArrayList<Cita> citasPendientes; 
    
    public void recetar(){
    }
    
    public void agregarPlanut(){
    }
    
    public void imprimirReceta(){
    }
    
    public void registrarSecretaria(){
    }
}
