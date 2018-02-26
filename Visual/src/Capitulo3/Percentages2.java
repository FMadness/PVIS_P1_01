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
public class Percentages2 {
     public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        computePercent p = new computePercent();
        System.out.println("Dime un numero: ");
        Double a1 = teclado.nextDouble();
        System.out.println("Otro: ");
        Double a2 = teclado.nextDouble();
        p.setA(a1);
        p.setB(a2);
        Double r = p.porcentaje();
        System.out.println("El porcentaje es: " + r + "%");
    }
}
