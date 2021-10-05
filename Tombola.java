/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Julio Cesar
 */
public class Tombola {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Elija un numero del 0 al 8");  
        int cant = leer.nextInt();
        List<String> ejemploLista = new ArrayList<String>();
        ejemploLista.add("Laptop");
        ejemploLista.add("Ferrari");
        ejemploLista.add("Parlantes");
        ejemploLista.add("Pantalón");
        ejemploLista.add("IPhone");
         ejemploLista.add("Zapatos");
         ejemploLista.add("Lentes");
         ejemploLista.add("Un Yate");
        System.out.print("El premio es: ");
        System.out.println(ejemploLista.get(cant));
      
    }

}
