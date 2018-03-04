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
public class Circle {
    private Integer radio;
    private Integer diametro;
    private Double area;
     public Circle(Integer r){
       
         this.radio=r;
     }
  
       public Double Circle(){
           return area=Math.pow(Math.PI*radio ,2);
       }
    public Integer getRadio() {
        return radio;
    }

    public void setRadio(Integer radio) {
        this.radio = radio;
       
    }

    public Integer getDiametro() {
        return diametro;
    }

    public void setDiametro(Integer diametro) {
        this.diametro = diametro;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
    public String toString(){
        return"area:"+area+"diametro: "+diametro;
    }
}
