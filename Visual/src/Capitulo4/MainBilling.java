/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo4;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class MainBilling {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca el precio: ");
        Double pre= scan.nextDouble();
        System.out.println("Introduzca cantidad predida: ");
        Double cape= scan.nextDouble();
        System.out.println("Introduzca can del cupon: ");
        Double cup= scan.nextDouble();
        Billing b = new Billing (pre,cape,cup);
        Double r=b.computeBill(pre, cape, cup);
        System.out.println(r);
        
    }
    
}
