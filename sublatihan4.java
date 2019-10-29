/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pewarisan;

/**
 *
 * @author DKID
 */
public class sublatihan4 extends latihan4 {
    private int b;
    public void setb(int nilai){
        b = nilai;
        
    }
    public int getb(){
        return b;
    }
    public void sout(){
        super.out();
        System.out.println("======================");
        System.out.println("==>Nilai b :" + getb());
        System.out.println("======================");
    }
}
