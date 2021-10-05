/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;

import java.util.ArrayList;
import Entidades.HabitatNatural;
import java.util.LinkedList;

/**
 *
 * @author copad
 */
public class HabitatsRepositorio {
    private LinkedList<HabitatNatural> habitats=new LinkedList();
    
    public HabitatsRepositorio(){
        HabitatNatural habitat1 = new HabitatNatural("Pradera", "templado", "hierba y matorrales", "Norte America");
        habitats.add(habitat1);
    }

    public void addHabitat(HabitatNatural habitat){
        habitats.add(habitat);
    }
    public void removeHabitat(int index){
        habitats.remove(index);
    }
    public HabitatNatural buscarHabitat(String nombre){
        for(HabitatNatural habitat:habitats){
            if(habitat.getNombre().equals(nombre)){
                return habitat;
            }
            
        }
        return null;
    }
    public void imprimirHabitat(int index){
        System.out.println(habitats.get(index).toString()); 
    }
    public void editHavitat(HabitatNatural habitat, int index){
        try {
            habitats.set(index, habitat);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
    public void print(){
        for (int i = 0; i < habitats.size(); i++) {
            HabitatNatural h=(HabitatNatural)habitats.get(i);
            System.out.println("ID "+i+" "+h.toString());
        }
    }
}
