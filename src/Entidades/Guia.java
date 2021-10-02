/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author copad
 */
public class Guia extends Empleado{
    
    private ArrayList animalesExperto;
    private ArrayList animalesNoEsperto;
    
    public Guia(String nombre,String direccion,int telefono, LocalDate fechaInicio,ArrayList animaleExperto,ArrayList animalesNoExperto){
        super(nombre,direccion,telefono,fechaInicio);
        this.animalesExperto=animaleExperto;
        this.animalesNoEsperto=animalesNoExperto;
    }
    
    public void animalExperto(ArrayList animalesExperto){
        
        animalesExperto.add(animalesExperto);
       
    }
    public void animalesNoExperto(ArrayList animalesNoExperto){
        animalesNoExperto.add(animalesNoExperto);
    }
    public void imprimirLista(){
        System.out.println("animales en que el cuidador es experto");
        for (int i = 0; i < animalesExperto.size(); i++) {
            System.out.println(animalesExperto.get(i));
        }
        System.out.println("animales en que el cuidador no es experto");
        for (int i = 0; i < animalesNoEsperto.size(); i++) {
            System.out.println(animalesNoEsperto.get(i));
        }
    }
}
