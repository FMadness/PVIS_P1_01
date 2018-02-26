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
public class Insurance {
      public static void main(String[]args){
        OpIns ed = new OpIns();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        Integer e = teclado.nextInt();
        ed.setEdad(e);
        Integer monto = ed.mensualidad();
        System.out.println("Tu dinero es: " + monto + "$");
    }
}
