/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deb03033.modelo;

/**
 *
 * @author Jose
 */
public class Asignatura {

    private int cuposDisponibles;
    private int numeroHoras;
    private int horasSemanales;
    private String nombre;
    private String docente;
    private double costoHoras;
    private Carrera Carrera;

    public Asignatura(String nombre, String docente, int numeroHoras, int horasSemanales, double costoHoras, int cuposDisponibles, Carrera Carrera) {
        this.nombre = nombre;
        this.docente = docente;
        this.numeroHoras = numeroHoras;
        this.horasSemanales = horasSemanales;
        this.costoHoras = costoHoras;
        this.cuposDisponibles = cuposDisponibles;
        this.Carrera = Carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public double getCostoHoras() {
        return costoHoras;
    }

    public void setCostoHoras(double costoHoras) {
        this.costoHoras = costoHoras;
    }

    public int getCuposDisponibles() {
        return cuposDisponibles;
    }

    public void setCuposDisponibles(int cuposDisponibles) {
        this.cuposDisponibles = cuposDisponibles;
    }

    public Carrera getCarrera() {
        return Carrera;
    }

    public void setCarrera(Carrera Carrera) {
        this.Carrera = Carrera;
    }

    public double costoAsignatura() {
        return this.costoHoras * this.numeroHoras;

    }

    public String periodoDuracion() {
        var mes = (this.numeroHoras / this.horasSemanales);

        return "El ciclo estudiantil dura= " + mes + " meses";

    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", docente=" + docente 
                + ", numHoras=" + numeroHoras + ", horasSemanales=" 
                + horasSemanales + ", costoHoras=" + costoHoras + ", cuposDisponibles=" 
                + cuposDisponibles + ", con un costo total de=" 
                + this.costoAsignatura() + this.periodoDuracion() + "\n, Carrera=" 
                + Carrera.toString() + '}';
    }

}
