/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4PraktikumPbo;

import java.util.Scanner;

public class TahunKabisat {
    int tahun;
    
    Scanner input = new Scanner(System.in);
    
    public void output(){
        System.out.print("\nMasukkan tahun: ");
        this.tahun = input.nextInt();
        if(tahun % 4 == 0){
            System.out.println(tahun + " merupakan tahun kabisat");
        }else{
            System.out.println(tahun + " bukan tahun kabisat");
        }
    }
}