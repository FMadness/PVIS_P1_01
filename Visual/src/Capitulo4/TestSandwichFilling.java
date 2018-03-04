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
public class TestSandwichFilling {
    public static void main(String[]args){
        SandwichFilling sf1= new SandwichFilling ("atun",330);
        SandwichFilling sf2= new SandwichFilling ("jamon",240);
        SandwichFilling sf3= new SandwichFilling ("queso",230);
        display(sf1);
        display(sf2);
        display(sf3);
    }

    private static void display(SandwichFilling s) {
        System.out.println("el sandwich "+s.getFilling()+" tiene"+s.getCalorias()+"calorias");
    }
}
