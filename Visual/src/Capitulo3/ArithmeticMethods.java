package Capitulo3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author josem
 */
public class ArithmeticMethods {
    public static void main(String[]args){
        Operaciones operacion = new Operaciones();
        Integer n = 15;
        operacion.setNum(n);
        Integer re1 = operacion.sumaUno();
        Integer re2 = operacion.sumaDos();
        Integer re3 = operacion.sumaTres();
        System.out.println("La primer suma es: " + re1);
        System.out.println("La segunda suma es: " + re2);
        System.out.println("La tercera suma es: " + re3);
    }   
}
