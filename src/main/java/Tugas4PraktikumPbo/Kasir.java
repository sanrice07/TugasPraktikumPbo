/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4PraktikumPbo;

import java.util.Scanner;

public class Kasir {
    int total, bayar, total_harga;
    String member;
    
    Scanner input = new Scanner(System.in);
    
    int diskon(int total, String member){
        if(member.equalsIgnoreCase("ya")){
            if(total > 500000){
                return 50000;
            }else if(total > 100000){
                return 15000;
            }else{
                return 0;
            }
        }else if(total > 100000){
            return 10000;
        }else{
            return 0;
        }
    }
    
    public void output(){
        System.out.print("\nTotal Belanja: ");
        this.total = input.nextInt();
        System.out.print("Total Bayar: ");
        this.bayar = input.nextInt();
        input.nextLine();
        System.out.print("Punya Member(ya/tidak)? ");
        this.member = input.nextLine();
        total_harga = total - diskon(total, member);
        if(bayar < total_harga){
            System.out.println("Uang tidak mencukupi");
        }else{
            System.out.println("Total Harga: " + total_harga);
            System.out.println("Kembalian: " + (bayar - total_harga));
        }
    }
}