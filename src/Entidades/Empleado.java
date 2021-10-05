/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
import java.time.LocalDate;
import java.time.Month;
/**
 *
 * @author copad
 */
public class Empleado {
    private String nombre;
    private String direccion;
    private int telefono;
    private LocalDate fechaInicio;
    
    public Empleado(String nombre,String direccion,int telefono, LocalDate fechaInicio){
        this.nombre=nombre;
        this.direccion=direccion;
        this.telefono=telefono;
        this.fechaInicio=fechaInicio;
    }
    
}
