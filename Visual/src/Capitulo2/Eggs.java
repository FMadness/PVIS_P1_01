/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo2;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Eggs {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
          final double docena=3.25;
        final double huevo=0.45;
        int cantidad;
        double op1,op2,op3,op4,op5;
        System.out.println("Introduzca el numero de huevos");
         cantidad = scan.nextInt();
          op1=cantidad/12;
          op2=cantidad%12;
         op3 = op1*docena;
         op4=op2*huevo;
         op5=op3+op4;
         System.out.println("ordenaste "+cantidad+" Huevos  Eso son "+op1+" docenas a $"+docena+" cada docena  "+op2+" huevos sueltos a $"+huevo+" cada uno");
          System.out.println("Tu toal a pagar es: $"+op5);
        
    }
    
}
