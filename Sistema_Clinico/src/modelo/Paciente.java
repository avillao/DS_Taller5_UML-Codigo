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
public class Paciente extends Persona {
    
    protected String email;
    
    protected HistoriaClinica historiaClinica;
    protected ArrayList<Receta> recetas;
    protected Cita cita;
    
    public boolean solicitarCita(){
        return false;
    }
    
}
