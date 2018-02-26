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
public class FahrenheitToCelsius {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double c,f,conv;
        System.out.println("Ingrese los grados fahrnheit");
        f=scan.nextDouble();
        conv=(f-32)*5/9;
        System.out.println(+f+"grados fahrenheit equivalen a "+conv+"grados celcius");
        
    }
    
}
