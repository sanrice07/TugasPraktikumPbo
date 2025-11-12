/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4PraktikumPbo;

import java.util.Scanner;

public class Hari {
    String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu"};
    int kode;
    
    Scanner input = new Scanner(System.in);
    
    public void output(){
        System.out.print("\nMasukkan kode hari: ");
        this.kode = input.nextInt();
        if(kode > 0 & kode < 8){
            System.out.println("Hari dengan kode " + kode + " adalah hari " + hari[kode-1]);
        }else{
            System.out.println("Tidak ada hari dengan kode " + kode);
        }
    }
}