/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2PraktikumPbo;

public class menghitungKecepatanCahaya {
     double jarakBulan;
    double jarakMatahari;
    double c;
    
    menghitungKecepatanCahaya(double jarakBulan, double jarakMatahari){
        this.jarakBulan = jarakBulan;
        this.jarakMatahari = jarakMatahari;
        this.c = 300000;
    }
    
    double jarakKeBulan(){
        return jarakBulan/c;
    }
    
    double jarakKeMatahari(){
        return jarakMatahari/c;
    }
    
    void output(){
        System.out.println("\nWaktu dari Bumi ke Bulan = " + jarakKeBulan() + " detik");
        System.out.println("Waktu dari Bumi ke Matahari = " + jarakKeMatahari() + " detik");
    }
}
