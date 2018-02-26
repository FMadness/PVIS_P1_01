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
public class ProjectedSalesInteractive {
      public static void main(String[] args){
          Scanner scan= new Scanner(System.in);
         final double añoprox = 0.10;
         double ventasnort, ventassur,resul1,resul2;
          System.out.println("Ingrese division norte:");
          ventasnort=scan.nextDouble();
         resul1=añoprox*ventasnort;
          System.out.println("Ingrese division sur:");
          ventassur=scan.nextDouble();
          resul2=añoprox*ventassur;
         
         System.out.println("Ventas para division norte: "+resul1+"\nventas para divison sur:"+resul2);
      }
    
}
