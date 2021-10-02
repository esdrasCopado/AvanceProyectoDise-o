/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author copad
 */
public class HabitatNatural {
    
    private String nombre,clima,tipoVegetacion,continente;
    
    public HabitatNatural(String nombre,String clima,String tipoVegetacion,String continente){
        this.nombre=nombre;
        this.clima=clima;
        this.tipoVegetacion=tipoVegetacion;
        this.continente=continente;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getTipoVegetacion() {
        return tipoVegetacion;
    }

    public void setTipoVegetacion(String tipoVegetacion) {
        this.tipoVegetacion = tipoVegetacion;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    @Override
    public String toString() {
        return "HabitatNatural: " + "nombre= " + nombre + ", clima= " + clima + ", tipoVegetacion= " + tipoVegetacion + ", continente= " + continente ;
    }
    
}
