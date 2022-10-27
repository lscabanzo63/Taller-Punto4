/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondeinmuebles;

/**
 *
 * @author santi
 */
public class Edificio extends Inmueble{
    private int numeroDePisos;
    private int numeroDeLocales;

    public Edificio(int numeroDePisos, int numeroDeLocales, String nombre, String ubicacion, String estado, int codigo) {
        super(nombre, ubicacion, estado, codigo);
        this.numeroDePisos = numeroDePisos;
        this.numeroDeLocales = numeroDeLocales;
    }
    

    /**
     * @return the numeroDePisos
     */
    public int getNumeroDePisos() {
        return numeroDePisos;
    }

    /**
     * @param numeroDePisos the numeroDePisos to set
     */
    public void setNumeroDePisos(int numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
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
