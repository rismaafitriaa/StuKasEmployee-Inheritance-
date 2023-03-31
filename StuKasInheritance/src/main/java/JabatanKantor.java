/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author risma
 */
public class JabatanKantor {
    public static void main(String[] args) {
        Employee a = new Employee();
        Bos b = new Bos();
        Manager c = new Manager();
        CleaningService d = new CleaningService();
        
        System.out.println("* Jam kerja dibawah 8 jam mendapat potongan : 100000\n* Sudah menikah mendapat bonus : 10000000");
        System.out.println();
        a.Employee();
        a.potonganGaji();
        a.bonus();
        System.out.println();
        b.Boss();
        b.potonganGaji();
        b.bonus();
        System.out.println();
        c.Manager();
        c.potonganGaji();
        c.bonus();
        System.out.println();
        d.CleaningService();
        d.potonganGaji();
        d.bonus();
    }
}
