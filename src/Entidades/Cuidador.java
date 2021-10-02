/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author copad
 */
public class Cuidador extends Empleado{
    
    
    
    public Cuidador(String nombre,String direccion,int telefono, LocalDate fechaInicio){
        super(nombre,direccion,telefono,fechaInicio);
    }
    
    
}
