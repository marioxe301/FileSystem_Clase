/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesystem_clase;

/**
 *
 * @author Juan Zepeda
 */
public class Archivo {
    private String nombre;
    private int tamano;
    private String extension;
    
    public Archivo() {
    }
    
    public Archivo(String nombre, int tamano, String extension) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.extension = extension;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    } 
    
    
    
}
