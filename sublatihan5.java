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
public class sublatihan5 extends latihan5 {
    public int seatheight;
        public sublatihan5(int startheight , int startgear ,int startcadance ,int startspeed){
            super (startcadance ,startspeed,startgear);
            seatheight = startheight;
            

}
public void setheight (int newvalue){
    seatheight = newvalue;
}
public static void main(String [] keroco){
    System.out.println("=========================");
    System.out.println("==>Mulai di GASSKEUN....");
    System.out.println("=========================");
    sublatihan5 p = new sublatihan5(0,0,0,0);
    System.out.println("=================================");
    System.out.println("==>Gear :" + p.gear);
    System.out.println("==>Speed :" + p.speed);
    p.setgear (5);
    p.gas (10);
    System.out.println("======================");
    System.out.println("==>Gear :" + p.gear);
    System.out.println("==>Speed :" + p.speed);
    System.out.println("=======================");
    p.gas(20);
    System.out.println("======================");
    System.out.println("==>Gear :" + p.gear);
    System.out.println("==>Speed :" + p.speed);
    System.out.println("=======================");
    
}
    
}

