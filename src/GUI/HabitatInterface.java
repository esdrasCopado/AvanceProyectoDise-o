/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Entidades.HabitatNatural;
import Repositorios.HabitatsRepositorio;
import java.time.DayOfWeek;
import java.util.Scanner;

/**
 *
 * @author copad
 */
public class HabitatInterface {

    HabitatsRepositorio h = new HabitatsRepositorio();
    public static HabitatInterface manejoHabitats=null;
    Scanner leer=new Scanner(System.in);

    public HabitatInterface() {
        
        HabitatNatural habitat1 = new HabitatNatural("Pradera", "templado", "hierba y matorrales", "Norte America");
        HabitatNatural habitat2 = new HabitatNatural("Bosque", "templado", "Arboles y matorrales", "Europa");
        HabitatNatural habitat3 = new HabitatNatural("Desierto", "arido", "cactus nopales", "America");

        h.addHabitat(habitat1);
        h.addHabitat(habitat2);
        h.addHabitat(habitat3);
        
    }
    public void Inicio(){
        System.out.println("-------Bienvenido al sistema de Habitats del Zologico----------");
        while (true) {
            
            System.out.println("Escoja una opción de lo que desea hacer:   ");
            System.out.println("presione 1 para agregar un habitat");
            System.out.println("presione 2 para buscar un habitat");
            System.out.println("presione 3 para imprimir un habitat");
            System.out.println("presione 4 para ir ala pantalla principal");
            int i = leer.nextInt();
            if (i == 1) {
                agregarNuevoHabitat();
            }
            if (i == 2) {
                buscarHabitats();
            }
            if (i == 3) {
                imprimir();
            }
            if (i == 4) {
                break;
            }
        }
    }
    
    public void imprimir(){
        System.out.println("-----------Habitats Registrados--------");
        h.print();
        editar();
    }
    public void editar() {
        int id=-1;
        System.out.println("Quiere editar S/N");
        String opcion = leer.next();
        opcion = opcion.toUpperCase();
        if (opcion.equals("S")) {
            System.out.println("Ingrese el ID del Habitat");
            id = leer.nextInt();
            h.imprimirHabitat(id);
        }else{
            return;
        }
        opcion=null;
        System.out.println("¿Es correcto? S/N");
        opcion=leer.next();
        opcion=opcion.toUpperCase();
        if(opcion.equals("S")){
            editarObjeto(id);
        }else{
            imprimir();
        }
            
    }
    public void editarObjeto(int id){
        String nombre;String clima;String tipoVegetacion;String continente;
        System.out.println("-----------Llene lo Siguiente para Eitarlo--------");
        System.out.println("ingrese el nombre del habitat");
        nombre=leer.nextLine();
        System.out.println("ingrese el clima del nuevo habitat");
        clima=leer.nextLine();
        System.out.println("ingrese el tipo de vegetacion del nuevo habitat");
        tipoVegetacion=leer.nextLine();
        System.out.println("ingrese el continente del nuevo habitat");
        continente=leer.nextLine();
        
        HabitatNatural habitatEdit=new HabitatNatural(nombre, clima, tipoVegetacion, continente);
        h.editHavitat(habitatEdit,id);
    }
    public void agregarNuevoHabitat(){
        String nombre;String clima;String tipoVegetacion;String continente;
        System.out.println("-------------Agregar Nuevo Habitat----------");
        System.out.println("ingrese el nombre del habitat");
        nombre=leer.nextLine();
        System.out.println("ingrese el clima del nuevo habitat");
        clima=leer.nextLine();
        System.out.println("ingrese el tipo de vegetacion del nuevo habitat");
        tipoVegetacion=leer.nextLine();
        System.out.println("ingrese el continente del nuevo habitat");
        continente=leer.nextLine();
        
        HabitatNatural habitatNuevo=new HabitatNatural(nombre, clima, tipoVegetacion, continente);
        h.addHabitat(habitatNuevo);
    }
    public void buscarHabitats(){
        System.out.println("-------------Buscar Habitats------------");
        System.out.println("ingrese el nombre del habitat: ");
        String nombre=leer.next();
        System.out.println(h.buscarHabitat(nombre));
        
    }
    public void midificarHabitat(int index){
        
    }
    public void pantallaPrincipal(){
        InterfacePrincipal.InterfacePrincipal();
    }
     
}
