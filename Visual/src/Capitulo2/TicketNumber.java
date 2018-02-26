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
public class TicketNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int resto;
        String boleto;
        System.out.println("Ingrese numero de ticket de 6 digitos");
        boleto=scan.nextLine();
        String cadenaNueva = boleto.substring(0, boleto.length()-1); 
        String ultimo = boleto.substring(boleto.length() - 1);
        int num = Integer.parseInt(ultimo);
        int numEntero = Integer.parseInt(cadenaNueva);
             resto= numEntero%7;
         

        System.out.println(numEntero);
boolean b;
if(num==resto){
    b=true;
    System.out.println("true");
}else if (num!=resto){
    b=false;
    System.out.println("false");
}

    } 
}
