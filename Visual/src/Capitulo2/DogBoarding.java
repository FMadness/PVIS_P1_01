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
public class DogBoarding {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final double perro= 0.50;
        int peso ,dias;
        double op1, op2;
        System.out.println("Introduzca el peso del dog en libras");
        peso=scan.nextInt();
        System.out.println("Indroduzca numero de dias");
        dias=scan.nextInt();
        op1=peso*perro;
        op2=op1*dias;
        System.out.println("precio total :"+op2);
        
    }
    
}
