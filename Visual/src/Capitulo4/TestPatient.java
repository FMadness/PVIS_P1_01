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
public class TestPatient {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce id: ");
        String ide=scan.next();
        System.out.println("Indroduzca edad: ");
        Integer edd=scan.nextInt();
        System.out.println("tipo de sangre; ");
        String ts=scan.next();
        Patient pat = new Patient(ide,ts,edd);
        System.out.println(pat);
    }
}
