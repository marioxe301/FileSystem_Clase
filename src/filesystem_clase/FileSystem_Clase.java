/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesystem_clase;

import java.util.Scanner;

/**
 *
 * @author Juan Zepeda
 */
public class FileSystem_Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        Carpeta raiz = new Carpeta("/", 10, null, null);
        
        //Crear carpetas
        raiz.addCarpeta(new Carpeta("hola", 10, null, null));        
        raiz.addCarpeta(new Carpeta("mundo", 10, null, null));
        
        //Crear carpeta dentro de carpeta
        Carpeta tmp = raiz.buscar_Carpeta("mundo");
        if(tmp != null)
            tmp.addCarpeta(new Carpeta("mundo 2.0", 10, null, null));
        
        
        tmp = raiz.buscar_Carpeta_Aux(raiz, "mundo 2.0");
        if(tmp != null)
            tmp.addCarpeta(new Carpeta("mundo 3.0", 10, null, null));
        
        
        raiz.addCarpeta(new Carpeta("clase", 10, null, null));
    }
    
}
