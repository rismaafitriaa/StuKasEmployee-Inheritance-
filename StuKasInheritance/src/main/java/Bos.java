
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author risma
 */
public class Bos extends Employee{
    Scanner input = new Scanner(System.in);
    
    void Boss(){
        System.out.println("== BOSS ==");
        System.out.print("Nama : ");
        System.out.println(super.Nama = "Hadi");
        System.out.print("NIP : ");
        System.out.println(super.NIP = 5678);
         System.out.print("Gaji : ");
        System.out.println(super.gaji = 9000000);
        System.out.print("Waktu Kerja (Jam) : ");
        super.waktuKerja = input.nextInt();
        System.out.print("Status (Sudah menikah = 1/Belum menikah = 0) : ");
        super.Status = input.nextInt();
    }
}

