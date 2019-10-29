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
public class latihan2 {
    private String nama;
    private int usia;
    
    
    public latihan2 (String nama , int usia){
        this.nama = nama;
        this.usia = usia;
    }
    public void info(){
        System.out.println("=======================");
        System.out.println("==->Nama :" + this.nama);
        System.out.println("==->Usia :" + this.usia);
    }
}
