/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4PraktikumPbo;

import java.util.Scanner;

public class GanjilGenap {
    int angka;
    
    Scanner input = new Scanner(System.in);
    
    String validasi(int angka){
        if (angka % 2 == 0){
            return "Genap";
        }else{
            return "Ganjil";
        }
    }
    
    public void output(){
        System.out.println("Menentukan bilangan ganjil/genap");
        System.out.print("Masukkan angka: ");
        this.angka = input.nextInt();
        System.out.println("Angka " + angka + " merupakan bilangan " + validasi(angka));
    }
    
}