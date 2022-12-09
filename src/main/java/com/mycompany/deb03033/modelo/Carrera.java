/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deb03033.modelo;

/**
 *
 * @author Jose
 */
public class Carrera {
    

    private String nombre;
    private String rectorCarrera;
    private double costoCiclo;
    private int numeroCiclos;
    private Universidad universidad;

    public Carrera(String nombre, String rectorCarrera, double costoCiclo, int numeroCiclos, Universidad universidad) {
        this.nombre = nombre;
        this.rectorCarrera = rectorCarrera;
        this.costoCiclo = costoCiclo;
        this.numeroCiclos = numeroCiclos;
        this.universidad = universidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRectorCarrera() {
        return rectorCarrera;
    }

    public void setRectorCarrera(String rectorCarrera) {
        this.rectorCarrera = rectorCarrera;
    }

    public double getCostoCiclo() {
        return costoCiclo;
    }

    public void setCostoCiclo(double costoCiclo) {
        this.costoCiclo = costoCiclo;
    }

    public int getNumeroCiclos() {
        return numeroCiclos;
    }

    public void setNumeroCiclos(int numeroCiclos) {
        this.numeroCiclos = numeroCiclos;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    @Override
    public String toString() {
        return "Carrera{" + "nombre=" + nombre + ", rectorCarrera=" + rectorCarrera 
                + ", costoCiclo=" + costoCiclo + ", numeroCiclos=" + numeroCiclos 
                + ", universidad=" + universidad + '}';
    }

    
}
