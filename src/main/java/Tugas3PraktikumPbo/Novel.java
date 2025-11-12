/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3PraktikumPbo;

import java.util.Scanner;
public class Novel {
    int buku;
    long hari, jam, menit, detik, lembar;
    
    Scanner input = new Scanner(System.in);
    
    public void ioput(){
        System.out.print("\nJumlah Novel: ");
        this.buku = input.nextInt();
        for(int i = 0; i < buku; i++){
            System.out.print("Jumlah lembar pada novel ke-" + i+1 + " : ");
            this.lembar += input.nextInt();
        }
        this.hari = lembar / 86400;
        this.lembar -= (hari * 86400);
        this.jam = lembar / 3600;
        this.lembar -= (jam * 3600);
        this.menit = lembar / 60;
        this.lembar -= (menit * 60);
        this.detik = lembar;
        
        System.out.println("Waktu yang dibutuhkan mesin untuk menyelesaikan percetakan novel adalah");
        System.out.println(hari + " hari, " + jam + " jam, " + menit + " menit, " + detik + " detik.");
    }
    
}
