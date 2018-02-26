/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo3;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class PaintCalculator {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        double lon,an,ha;
        OpGalon gal= new OpGalon();
        System.out.println("Dame la longitud");
        lon=scan.nextDouble();
        System.out.println("Dame el ancho");
        an=scan.nextDouble();
        System.out.println("dame la altura");
        ha=scan.nextDouble();
        gal.setAn(an);
        gal.setHal(ha);
        gal.setLon(lon);
        Double area4 = gal.Operacion();
        System.out.println("El costo es"+area4);
    }
}