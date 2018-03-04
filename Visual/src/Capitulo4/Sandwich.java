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
public class Sandwich {
    private Bread bread;
    private SandwichFilling  filling;
    
    public Sandwich(String b, Integer bc, String fill, Integer fcal){
        this.bread= new Bread(b,bc);
        this.filling=new SandwichFilling (fill,fcal);
    }

    public Bread getBread() {
        return bread;
    }

    public void setBread(Bread bread) {
        this.bread = bread;
    }

    public SandwichFilling getFilling() {
        return filling;
    }

    public void setFilling(SandwichFilling filling) {
        this.filling = filling;
    }
    
}
