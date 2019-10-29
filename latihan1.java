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
public class latihan1 {
    private int a = 10;
    protected void lindungi(){
        System.out.println("==METHOD HANYA UNTUK PACARNYA==");
    }
    public void info (){
        System.out.println(">>jadi a :" + a);
        System.out.println(">>Dipanggil :" +this.getClass().getName());
        
    }
}
