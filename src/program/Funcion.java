/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package program;

import java.util.ArrayList;

/**
 * 
 * @author David Massana
 */
public class Funcion {
    private int funcion;
    private String dia;
    private boolean disponibilidad;
    private ArrayList<Funcion> reservas;
    
    public Funcion(){
    }
    
    public Funcion(int funcion){
        this.funcion = funcion;
    }

    public int getFuncion() {
        return funcion;
    }

    public void setFuncion(int funcion) {
        this.funcion = funcion;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public ArrayList<Funcion> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Funcion> reservas) {
        this.reservas = reservas;
    }
    
    
    
}
