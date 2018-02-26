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
public class OpGalon {
    private  double a;
    private  double l;
    private  double h;
    
    public Double Operacion(){
        Double area1 =(h*a)*2;
         Double area2 = (h * l) * 2;
        Double area3 = area1 + area2;
        Double area4 = (area3 / 350) * 32;
        return area4;
    }
    public void setAn(Double a){
        this.a = a;
    }
    public Double getAn(){
        return this.a;
    }
     
    public void setLon(Double l){
        this.l = l;
    }
    public Double getLon(){
        return this.l;
        
    }
     public void setHal(Double h){
        this.h = h;
    }
    public Double getHal(){
        return this.h;
        
    }
    
}
