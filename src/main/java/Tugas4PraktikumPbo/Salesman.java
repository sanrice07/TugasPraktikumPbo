/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4PraktikumPbo;

import java.util.Scanner;

public class Salesman {
    int pendapatan;
    
    Scanner input = new Scanner(System.in);
    
    int gaji(int jasa, double komisi){
        return (int) (jasa + pendapatan * komisi / 100);
    }
    
    public void output(){
        System.out.print("\nMasukkan pendapatan salesman: ");
        this.pendapatan = input.nextInt();
        if(pendapatan < 2000000){
            System.out.println("Salesman magang");
        }else if(pendapatan == 2000000){
            System.out.println("Komisi Salesman: " + gaji(100000, 10));
        }else if(pendapatan > 5000000){
            System.out.println("Komisi Salesman: " + gaji(300000, 20));
        }else{
            System.out.println("Komisi Salesman: " + gaji(200000, 15));
        }
    }
    
}
