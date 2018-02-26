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
public class Dollars {
    
        public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int dinero,op1,op2,op3,op4,di1,op5;
            System.out.println("Introduzca el dinero:");
            dinero=scan.nextByte();
            di1=dinero/20;
            op1=dinero%20;
            op2=op1/10;
            op3=op1%10;
            op4=op1/5;
            op5=op1%5;
            System.out.println("Son "+di1+"  de veinte, "+op2+" de 10, "+op4+" de 5, "+op1+" de 1");
        
        }
    
}
