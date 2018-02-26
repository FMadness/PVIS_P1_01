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
public class OpIns {
    private Integer edad;
    public Integer mensualidad(){
        Integer d = edad / 10;
        Integer r = (d + 15) * 20;
        return r;
    }
    public void setEdad(Integer edad){
        this.edad = edad;
    }
    public Integer getEdad(){
        return this.edad;
    }
}
