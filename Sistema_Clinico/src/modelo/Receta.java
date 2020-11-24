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
    
}
