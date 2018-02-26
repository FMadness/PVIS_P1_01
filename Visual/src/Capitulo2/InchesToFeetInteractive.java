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
public class InchesToFeetInteractive {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final int pulpie=12;
        int pulg;
        int res,res2;
            System.out.println("Introduzca pulgadas");
            pulg=scan.nextInt();
            res=pulg/12;
            res2=pulg%12;
            System.out.println(+res+" pies   "+res2+" pulgadas");
        
        }
    
    
}
