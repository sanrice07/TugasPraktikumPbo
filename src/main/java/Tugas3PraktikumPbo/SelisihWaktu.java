/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3PraktikumPbo;

import java.util.Scanner;

public class SelisihWaktu extends Waktu{
    
    Scanner input = new Scanner(System.in);
    
    Waktu waktu1 = new Waktu();
    Waktu waktu2 = new Waktu();
    
    void ioput(){
        System.out.print("\nMasukkan jam waktu pertama: ");
        waktu1.jam = input.nextInt();
        System.out.print("Masukkan menit waktu pertama: ");
        waktu1.menit = input.nextInt();
        System.out.print("Masukkan detik waktu pertama: ");
        waktu1.detik = input.nextInt();
        waktu1.total = totalWaktu(waktu1.jam, waktu1.menit, waktu1.detik);
        System.out.print("Masukkan jam waktu kedua: ");
        waktu2.jam = input.nextInt();
        System.out.print("Masukkan menit waktu kedua: ");
        waktu2.menit = input.nextInt();
        System.out.print("Masukkan detik waktu kedua: ");
        waktu2.detik = input.nextInt();
        waktu2.total = totalWaktu(waktu2.jam, waktu2.menit, waktu2.detik);
        Waktu selisih = new Waktu(Math.abs(waktu1.total - waktu2.total));
        
        System.out.println("Selisih antara Waktu pertama dan kedua: ");
        System.out.println(selisih.jam + " jam, " + selisih.menit + " menit, " + selisih.detik + " detik.");
        
    }
    
    
}
