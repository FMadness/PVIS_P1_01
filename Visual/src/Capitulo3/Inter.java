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
public class Inter {
    private Double d;
   public Double dinero(){
       Double b = (d * 5) / 100;
       Double c = d + b;
       return c;
   }
    public void setD(Double d){
        this.d = d;
    }
    public Double getD(){
        return this.d;
    }
}
