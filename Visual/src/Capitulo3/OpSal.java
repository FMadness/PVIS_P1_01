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
public class OpSal {
     private Double h;
    private Double p;
    
    private Double he;
    public Double pago(){
        Double r = h * p;
        return r;
    }
    public Double pago2(){
        Double r2 = (150 * p) / 100;
        Double pf = r2 * he;
        return pf;
    }
    public void setH(Double h){
        this.h = h;
    }
    public Double getH(){
        return this.h;
    }
    public void setP(Double p){
        this.p = p;
    }
    public Double getP(){
        return this.p;
    }
    public void setHe(Double he){
        this.he = he;
    }
    public Double getHe(){
        return this.he;
    }
}
