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
public class MetricConversion {
       public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        Conversion c = new Conversion();
        System.out.println("Dime las pulgadas: ");
        Double iu = teclado.nextDouble();
        System.out.println("Dime los galones: ");
        Double gu = teclado.nextDouble();
        c.setI(iu);
        c.setG(gu);
        Double c1 = c.conversion1();
        Double c2 = c.conversion2();
        System.out.println("La conversión es: " + c1 + " cm " + "y " + c2 + " lts");
    }
}
