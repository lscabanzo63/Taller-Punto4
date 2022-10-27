/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondeinmuebles;

/**
 *
 * @author santi
 */
public abstract class Inmueble {
    private String nombre; 
    private String ubicacion; 
    private String estado;
    private int codigo;

    public Inmueble(String nombre, String ubicacion, String estado, int codigo) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.estado = estado;
        this.codigo = codigo;
    }
    

 
    
    

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the ubicacio
     */
    public String getUbicacio() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacio to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

 
}
