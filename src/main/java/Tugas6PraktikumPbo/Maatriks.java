/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6PraktikumPbo;

import java.util.Scanner;

public class Maatriks {
    Scanner input = new Scanner(System.in);
    public void inout(){
        System.out.println("\nPenjumlahan matriks");
        System.out.print("Masukan jumlah baris: ");
        int baris = input.nextInt();
        System.out.print("Masukan jumlah kolom: ");
        int kolom = input.nextInt();
        int matriks1[][] = new int[baris][kolom];
        int matriks2[][] = new int[baris][kolom];
        System.out.println("Masukan nilai matriks pertama:");
        for(int i = 0; i < baris; i++){
            for(int j = 0; j < kolom; j++){
                System.out.print("Masukan nilai baris ke-" + (i+1) + " kolom ke-" + (j+1) + " : ");
                matriks1[i][j] = input.nextInt();
            }
        }
        System.out.println("Masukan nilai matriks kedua:");
        for(int i = 0; i < baris; i++){
            for(int j = 0; j < kolom; j++){
                System.out.print("Masukan nilai baris ke-" + (i+1) + " kolom ke-" + (j+1) + " : ");
                matriks2[i][j] = input.nextInt();
            }
        }
        System.out.println("Hasil penjumlahan kedua matriks : ");
        for(int i = 0; i < baris; i++){
            for(int j = 0; j < kolom; j++){
                System.out.print((matriks1[i][j] + matriks2[i][j]) + "\t");
            }
            System.out.println();
        }
    }
}
