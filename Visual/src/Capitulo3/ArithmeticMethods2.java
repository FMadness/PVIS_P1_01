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
public class ArithmeticMethods2 {
      public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        Operaciones operacion = new Operaciones();
        System.out.println("Dame un numero: ");
        Integer n = teclado.nextInt();
        operacion.setNum(n);
        Integer re1 = operacion.sumaUno();
        Integer re2 = operacion.sumaDos();
        Integer re3 = operacion.sumaTres();
        System.out.println("primer suma es: " + re1);
        System.out.println("segunda suma es: " + re2);
        System.out.println("tercera suma es: " + re3);
    }
}
