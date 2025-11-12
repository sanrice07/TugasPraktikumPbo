/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3PraktikumPbo;

public class Waktu{
    int jam, menit, detik, total;
    
    Waktu(){
        this.jam = 0;
        this.menit = 0;
        this.detik = 0;
        this.total = 0;
    }
    
    Waktu(int total){
        this.total = total;
        this.jam = (total / 60) / 60;
        total -= (jam * 60 * 60);
        this.menit = total / 60;
        total -= (menit * 60);
        this.detik = total;
    }
    
    int totalWaktu(int jam, int menit, int detik){
        return (jam * 60 * 60) + (menit * 60) + detik;
    }
    
}
