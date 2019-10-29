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
public class sublatihan3 extends latihan3 {
    public static void testmethod3(){
        System.out.println("======================================");
        System.out.println("==>The class method in hewan..");
        System.out.println("======================================");
    }
    public void testintstancemethod(){
        System.out.println("======================================");
        System.out.println("==>The instance method in gajah...");
        System.out.println("======================================");
    }
    public static void main (String [] args){
        sublatihan3 gajah = new sublatihan3();
        latihan3 hewan = gajah;
        latihan3.testmethod3();
        hewan.testintstancemethod();
    }
}
