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
public class Precio {
       private Double a;
    public Double calcularPrecio1(){
        Double r1 = (3.5 * a) / 100;
        return r1;
    }
    public Double calcularPrecio2(){
        Double r2 = (4.0 * a) / 100;
        return r2;
    }
    public void setA(Double a){
        this.a = a;
    }
    public Double getA(){
        return this.a;
    }
}
