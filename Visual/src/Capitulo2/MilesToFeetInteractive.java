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
public class MilesToFeetInteractive {
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final int miapie = 5280;
        double distancia, dis;
        System.out.println("Cual es la distacioa de la casa de tu tio");
        dis = scan.nextDouble();
        distancia = dis*miapie;
        System.out.println(+dis+"  millas"+distancia+"  pies");
        
     }
}
