/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5PraktikumPbo;

import java.util.Scanner;

public class Ganjil {
    int angka, jumlah;
    
    Scanner input = new Scanner(System.in);
    
    public void output(){
        System.out.print("\nMasukkan banyak angka : ");
        this.angka = input.nextInt();
        for(int i = 1; i < angka*2; i += 2){
            System.out.print(i + " ");
            this.jumlah += i;
        }
        System.out.println("\nTotal penjumlahan : " + jumlah);
    }
    
}
