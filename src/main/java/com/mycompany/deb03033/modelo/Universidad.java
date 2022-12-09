/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deb03033.modelo;

/**
 *
 * @author Jose
 */
public class Universidad {

    private String nombre;
    private String rector;
    private double costoMatricula;
    private int numeroEstudiantes;

    public Universidad(String nombre, String rector, int numeroEstudiantes, double costoMatricula) {
       
        this.numeroEstudiantes = numeroEstudiantes;
        this.costoMatricula = costoMatricula;
        this.nombre = nombre;
        this.rector = rector;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRector() {
        return rector;
    }

    public void setRector(String rector) {
        this.rector = rector;
    }

    public int getNumeroEstudiantes() {
        return numeroEstudiantes;
    }

    public void setNumeroEstudiantes(int numeroEstudiantes) {
        this.numeroEstudiantes = numeroEstudiantes;
    }

    public double getCostoMatricula() {
        return costoMatricula;
    }

    public void setCostoMatricula(double costoMatricula) {
        this.costoMatricula = costoMatricula;
    }

    @Override
    public String toString() {

        return "Universidad{" + "nombre=" + nombre + ", rector=" + rector + ", numEstudiantes="
                + numeroEstudiantes + ", costoMatricula=" + costoMatricula 
                + ", Ingresos por Matriculas=" + this.ingresoporMatriculas() + '}';
    }

        public double ingresoporMatriculas() {
        return this.costoMatricula * this.numeroEstudiantes;
    }
   

}
