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
public class subpraktikum1 extends praktikum1 {
            private String gurutercantik;
            private String guruterseru;
            private String gurufavorit;
    public void setgurucantik(String cans){
        gurutercantik = cans;    
    }
    public void setguruseru(String sers){
        guruterseru = sers;
    }
    public void setgurufavorit(String fav){
        gurufavorit = fav;
    }
   public String getgurutercantik(){
        return gurutercantik;
    }
   public String getguruterseru(){
       return  guruterseru;
   }
   public String getgurufavorit(){
       return gurufavorit;
   }
    public void sout(){
        super.output();
        System.out.println("==============================");
        System.out.println("===->NOMINASI PENGHARGAAN<-===");
        System.out.println("------------------------------");
        System.out.println("==>Guru tercantik :" + getgurutercantik());
        System.out.println("==>Guru terseru :" + getguruterseru());
        System.out.println("==>Guru favorit :" + getgurufavorit());
        System.out.println("===============================");
        System.out.println("-------------------------------");
    }
}
