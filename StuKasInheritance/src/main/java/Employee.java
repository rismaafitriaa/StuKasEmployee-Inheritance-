
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author risma
 */
public class Employee {
    int NIP, gaji, bonus, waktuKerja, Status;
    String Nama;
    int potongan = 100000;
    int bonusGaji = 10000000;
    Scanner input = new Scanner(System.in);
    
    void Employee(){
        System.out.println("== EMPLOYEE ==");
        System.out.print("Nama : ");
        System.out.println(Nama = "Sutirjah");
        System.out.print("NIP : ");
        System.out.println(NIP = 4228);
         System.out.print("Gaji : ");
        System.out.println(gaji = 3000000);
        System.out.print("Waktu Kerja (Jam) : ");
        waktuKerja = input.nextInt();
        System.out.print("Status (Sudah menikah = 1/Belum menikah = 0) : ");
        Status = input.nextInt();
    }
     
    public void potonganGaji(){
        if(waktuKerja<8){
            this.gaji = gaji-=potongan;
        }
        else{
            this.gaji=gaji;
        }
    }
    
    void bonus(){
        if(Status==1){
            System.out.print("Total Gaji Akhir : ");
            System.out.println(this.gaji+=bonusGaji);
        }
        else{
            System.out.print("Total Gaji Akhir : ");
            System.out.println(this.gaji=this.gaji);
        }
        
    }
}


