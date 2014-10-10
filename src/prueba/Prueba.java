/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba;

import java.util.ArrayList;

/**
 *
 * @author BladimirA
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Alumno> als = new ArrayList<>();
        
        numeros.add(2);
        numeros.add(5);
        numeros.add(7);
               
        //Size
        System.out.println("Size: " + numeros.size());
        
        //Sacar un elemento
        //System.out.println(als.get(0).getNombre());
        
        //remover
        numeros.remove(0);
        
        //recorrer
        //for(Alumno al :als)
        //    System.out.println(al.getNombre());
        for(int p=0; p < numeros.size(); p++)
            System.out.println(numeros.get(p));
        
        
    }
    
}
