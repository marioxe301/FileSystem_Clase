/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesystem_clase;

import java.util.ArrayList;

/**
 *
 * @author Juan Zepeda
 */
public class Carpeta {
    private String nombre;
    private Integer tamano;
    private ArrayList<Carpeta> directorio;
    private ArrayList<Archivo> archivos;

    public Carpeta() {
        this.nombre = "";
        this.tamano = -1;
        directorio = null;
        archivos = null;
    }

    public Carpeta(String nombre, Integer tamano, ArrayList<Carpeta> directorio, ArrayList<Archivo> archivos) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.directorio = directorio;
        this.archivos = archivos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTamano(Integer tamano) {
        this.tamano = tamano;
    }

    public Integer getTamano() {
        return tamano;
    }

    public ArrayList<Carpeta> getDirectorio() {
        return directorio;
    }

    public ArrayList<Archivo> getArchivos() {
        return archivos;
    }
    
    public void addCarpeta(Carpeta nueva)
    {
        if(directorio != null)
            directorio.add(nueva);
        else
        {
            directorio = new ArrayList<Carpeta>();
            directorio.add(nueva);
        }
    }
    
    public void addArchivo(Archivo nuevo)
    {
        if(archivos != null)
            archivos.add(nuevo);
        else
        {
            archivos = new ArrayList<Archivo>();
            archivos.add(nuevo);
        }
    }
    
    public Carpeta buscar_Carpeta(String nombre)
    {
        if(nombre.equals(this.nombre))
            return this;
        
        if(this.directorio == null)
            return null;
        else
        {
            for(int i = 0; i < directorio.size(); i++)
            {
                Carpeta tmp = directorio.get(i);
                tmp = tmp.buscar_Carpeta(nombre);
                if(tmp != null)
                    return tmp;
            }
        }
        
        return null;
    }
    
     public Carpeta buscar_Carpeta_Aux(Carpeta carpeta, String nombre)
    {
        if(nombre.equals(carpeta.getNombre()))
            return carpeta;
        
        if(carpeta.getDirectorio() == null)
            return null;
        else
        {
            for(int i = 0; i < carpeta.getDirectorio().size(); i++)
            {
                Carpeta tmp = carpeta.getDirectorio().get(i);
                tmp = tmp.buscar_Carpeta_Aux(tmp, nombre);
                if(tmp != null)
                    return tmp;
            }
        }
        
        return null;
    }
    
}
