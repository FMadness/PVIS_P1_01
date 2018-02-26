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
public class Interest {
        public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        Inter inte = new Inter();
        System.out.println("Introduzca el monto de dinero: ");
        Double di = teclado.nextDouble();
        inte.setD(di);
        Double monto = inte.dinero();
        System.out.println("Su dinero inertido anualmente es de: " + monto);
        
    }
}
