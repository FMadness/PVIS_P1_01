/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo4;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class MainFormLetter {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el apellido: ");
        String ape = scan.next();
        System.out.println("Nombre: ");
        String nombre = scan.next();
        FormLetterWriter f= new FormLetterWriter(ape,nombre);
        System.out.println(f);
        
    }
}
