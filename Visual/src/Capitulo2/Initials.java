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
public class Initials {
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String n,a,m;
        System.out.println("Apellido paterno");
        a=scan.nextLine();
         System.out.println("Dame tu materno ");
         m=scan.nextLine();
         System.out.println("Apellido nombre");
         n=scan.nextLine();
         System.out.println("Tus iniciales son:");
         System.out.println(n.charAt(0)+"."+a.charAt(0)+"." +m.charAt(0)+".");
        
         
     }
}
