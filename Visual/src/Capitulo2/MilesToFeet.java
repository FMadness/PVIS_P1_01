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
public class MilesToFeet {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final int miapie = 5280;
        double distancia, dis=8.5;
        System.out.println("La distacioa a la casa de tu tio es:");
        distancia = dis*miapie;
        System.out.println(+dis+"  millas"+distancia+"  pies");
        
        
    }
}
