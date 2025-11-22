/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6PraktikumPbo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NilaiRata2 {
    
    Scanner input = new Scanner(System.in);
    
    public void inout(){

        System.out.print("\nMasukkan jumlah bilangan: ");
        int n = input.nextInt();

        int[] data = new int[n];
        int total = 0;

        System.out.println("Masukkan bilangan :");

        for (int i = 0; i < n; i++) {
            try {
                System.out.print("Bilangan ke-" + (i+1) + ": ");
                data[i] = input.nextInt();
                total += data[i];
            } 
            catch (InputMismatchException e) {
                System.out.println("Error: input bukan bilangan!");
                input.nextLine();
                i--; 
            }
        }

        double rata = (double) total / n;
        System.out.println("\nRata-rata = " + rata);
    }
}