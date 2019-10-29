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
public class latihan4 {
    private int a;
    public void seta(int nilai){
        a = nilai;
    }
    public int geta(){
        return a;
    }
    public void out(){
        System.out.println("======================");
        System.out.println("==>Nilai a :" + geta());
        System.out.println("======================");
    }
    
}
