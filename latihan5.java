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
public class latihan5 {
    public int cadance , gear ,speed;
    public latihan5(int startcadence , int startgear , int startspeed){
        gear = startgear;
        speed = startspeed;
        cadance = startcadence;
    }
    public void setcadance(int newvalue){
      cadance = newvalue;  
    }
    public void setgear(int newvalue){
        gear = newvalue;
    }
    public void rem(int decrement){
       speed = decrement; 
    }
    public void gas(int increment){
        speed = increment;
    }
}
