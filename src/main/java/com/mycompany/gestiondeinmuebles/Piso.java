/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondeinmuebles;

/**
 *
 * @author santi
 */
public class Piso extends Inmueble {
    private int numeroDeLocales;

    public Piso(int numeroDeLocales, String nombre, String ubicacion, String estado, int codigo) {
        super(nombre, ubicacion, estado, codigo);
        this.numeroDeLocales = numeroDeLocales;
    }
    
    /**
     * @return the numeroDeLocales
     */
    public int getNumeroDeLocales() {
        return numeroDeLocales;
    }

    /**
     * @param numeroDeLocales the numeroDeLocales to set
     */
    public void setNumeroDeLocales(int numeroDeLocales) {
        this.numeroDeLocales = numeroDeLocales;
    }
    
}
