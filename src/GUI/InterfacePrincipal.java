/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author copad
 */
import Entidades.HabitatNatural;
import Repositorios.HabitatsRepositorio;
import Entidades.*;
import java.util.Scanner;

public class InterfacePrincipal {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        InterfacePrincipal();
    }

    public static void InterfacePrincipal() {
        Scanner leer=new Scanner(System.in);
        System.out.println("Bienvenido al sistema del Parque zoologico");
        
        HabitatInterface habitats = new HabitatInterface();
        boolean correrSistema = true;
        while (correrSistema) {
            System.out.println("---->>>Pantalla principal<<<----");
            System.out.println("Presione 1 para habitats");
            System.out.println("Presione 4 para salir");
            
            int opcion=leer.nextInt();
            switch(opcion){
                case 1:
                    habitats.Inicio();
                    break;
                case 4:
                    correrSistema=false;
                    break;
                
                
            }
            
            
        }
    }

}
