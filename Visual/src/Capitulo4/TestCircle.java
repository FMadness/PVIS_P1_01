/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo4;

/**
 *
 * @author josem
 */
public class TestCircle {
    public static void main(String[]args){
        Circle c1 = new Circle(2); 
        Circle c2 = new Circle(20);
        c2.setRadio(20);
        Circle c3 = new Circle(1);
        c3.setRadio(1);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
