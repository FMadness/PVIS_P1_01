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
public class GregorianCalendar {
    private Integer dia;
   
    public  GregorianCalendar(Integer d) {
    this.dia=31-d;
    
}
   

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

  public String toString(){
      return "faltan:" +dia+" para el siguiente mes";
  }
    
}
