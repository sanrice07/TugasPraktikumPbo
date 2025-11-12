/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3PraktikumPbo;

import java.util.Scanner;

public class Sentripetal {
    double m, v, r;
    
    Scanner input = new Scanner(System.in);
    
    double gaya(double m, double v, double r){
        return (m * v * v) / r;
    }
    
    public void ioput(){
        System.out.println("\nSentripetal");
        System.out.print("Masukkan massa: ");
        this.m = input.nextDouble();
        System.out.print("Masukkan kecepatan: ");
        this.v = input.nextDouble();
        System.out.print("Masukkan jari-jari: ");
        this.r = input.nextDouble();
        System.out.println("\nGaya Sentripetal = " + gaya(m, v, r));
    }
    
}
