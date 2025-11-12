/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5PraktikumPbo;

import java.util.Scanner;

public class RataRata {
     int n;
    double bilangan;
    
    Scanner input = new Scanner(System.in);
    
    public void output(){
        System.out.print("\nMasukkan jumlah bilangan : ");
        this.n = input.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Masukkan bilangan ke-" + (i+1) + " : ");
            this.bilangan += input.nextDouble();
        }
        System.out.println("Total jumlah bilangan = " + bilangan);
        System.out.println("Rata-rata total bilangan = " + bilangan/n);
    }
}
