/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pewarisan;
import java.util.Scanner;

/**
 *
 * @author DKID
 */
public class praktikum1 {
        private String gurupro;
        private String gurukjd;
        private String gurusimdig;
        private String gurusiskom;
        private String guruddg;
        Scanner keroco = new Scanner(System.in);
    public String getgurupro(){
        System.out.print("=>>Nama guru produktif :");
        String gp = keroco.nextLine();
        gurupro = gp;
        if ("pak arifin muhammada".equals(gp)){
            System.out.println("");
        }
        else{
            System.out.println("=>>MON MAAP NAMA ORANG GABISA DIUBAH UBAH HARUS BENAR<<=");
            System.out.println("==>Nama guru yang benar yaitu Pak arifin muhammada");
        }
        return gp;
    }
    public String getgurukjd(){
        System.out.print("=>>Nama guru komputer jaringan dasar :");
        String kj = keroco.nextLine();
        gurukjd = kj;
         if ("bu aulia masadah ".equals(kj)){
            System.out.println("");
        }
        else{
            System.out.println("=>>MON MAAP NAMA ORANG GABISA DIUBAH UBAH HARUS BENAR<<=");
            System.out.println("==>Nama guru yang benar yaitu bu aulia masadah");
        }
        return kj;
        
    }
    public String getgurusiskom(){
        System.out.print("=>>Nama guru sistem komunikasi :");
        String sk = keroco.nextLine();
        gurusiskom = sk;
         if ("pak bagus arifin".equals(sk)){
            System.out.println("");
        }
        else{
            System.out.println("=>>MON MAAP NAMA ORANG GABISA DIUBAH UBAH HARUS BENAR<<=");
            System.out.println("==>Nama guru yang benar yaitu Pak bagus arifin");
        }
        return sk;
    }
    public String getgurusimdig(){
        System.out.print("=>>Nama guru sistem digital :");
        String dg = keroco.nextLine();
        gurusimdig = dg;
         if ("pak chusni agus".equals(dg)){
            System.out.println("");
        }
        else{
            System.out.println("=>>MON MAAP NAMA ORANG GABISA DIUBAH UBAH HARUS BENAR<<=");
            System.out.println("==>Nama guru yang benar yaitu Pak chusni agus");
        }
        return dg;
    }
    public String getguruddg(){
        System.out.print("=>>Nama guru dasar desain grafis :");
        String d = keroco.nextLine();
        guruddg = d;
         if ("pak firmansyah ayatullah".equals(d)){
            System.out.println("");
        }
        else{
            System.out.println("=>>MON MAAP NAMA ORANG GABISA DIUBAH UBAH HARUS BENAR<<=");
            System.out.println("==>Nama guru yang benar yaitu Pak firmansyah ayatullah");
        }
        return d;
    }
    public void output(){
        System.out.println("<========================================>");
        System.out.println("<===-NAMA NAMA GURU BESERTA JADWALNYA-===>");
        System.out.println("<========================================>");
        System.out.println("==>Guru produktif RPL :" + getgurupro());
        System.out.println("==>Guru komputer jaringan dasar :" +getgurukjd());
        System.out.println("==>Guru simulasi digital :" + getgurusimdig());
        System.out.println("==>Guru sistem komunikasi :" + getgurusiskom());
        System.out.println("==>Guru Dasar Desain Grafis :" + getguruddg());
        System.out.println("<========================================>");
    }
}
