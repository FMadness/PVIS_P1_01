/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo2;

/**
 *
 * @author josem
 */
public class ProjectedSales {
     public static void main(String[] args){
         final double añoprox = 0.10;
         double ventasnort=4500, ventassur=5500,resul1,resul2;
         resul1=añoprox*ventasnort;
          resul2=añoprox*ventassur;
         
         System.out.println("Ventas para division norte: "+resul1+"\nventas para divison sur:"+resul2);
         
         
        
     }
}
