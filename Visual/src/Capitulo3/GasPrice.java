/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo3;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class GasPrice {
       public static void main(String[]args){
      Scanner teclado = new Scanner(System.in);
     Precio p = new Precio(); 
      System.out.println("Dame un precio: ");
      Double pr = teclado.nextDouble();
      p.setA(pr);
      Double re = p.calcularPrecio1();
      Double r2 = p.calcularPrecio2();
      System.out.println("El precio por galón es entre: " + re + " y " + r2);
      
      
    }
}
