/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo3;

/**
 *
 * @author josem
 */
public class Percentages {
    public static void main(String[]args){
        computePercent p = new computePercent();
        Double a1 = 2.0;
        Double a2 = 5.0;
        p.setA(a1);
        p.setB(a2);
        Double r = p.porcentaje();
        System.out.println("El porcentaje es: " + r + "%");
    }
}
