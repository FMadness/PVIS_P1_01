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
public class Operaciones {
        private Integer num;
    
    public Integer sumaUno(){
        Integer r = num + 10;
        return r;
    }
    public Integer sumaDos(){
        Integer r2 = num + 100;
        return r2;
    }
    public Integer sumaTres(){
        Integer r3 = num + 1000;
        return r3;
    }
    public void setNum(Integer num){
        this.num = num;
    }
    public Integer getNum(){
        return this.num;
    }
}
