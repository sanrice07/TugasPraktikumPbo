/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6PraktikumPbo;

import java.util.Scanner;

public class NilaiMhs {
    
    Scanner input = new Scanner(System.in);
    
    public void inout(){
        System.out.print("\n\nJumlah Mahasiswa: ");
        int n = input.nextInt();
        String[][] daftar = new String[n][4];
        for(int i = 0; i < n; i++){
            daftar[i][0] = String.valueOf(i+1);
            input.nextLine();
            System.out.print("Masukkan nama: ");
            daftar[i][1] = input.nextLine();
            System.out.print("Masukkan nilai: ");
            int nilai = input.nextInt();
            daftar[i][2] = String.valueOf(nilai);
            if(nilai > 50){
                daftar[i][3] = "Lulus";
            }else{
                daftar[i][3] = "Tidak Lulus";
            }
        }
        System.out.println("Daftar Nilai Mahasiswa");
        System.out.println("No\tNama\t\tNilai\tStatus");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 4; j++){
                if(j==1){
                    if(daftar[i][j].length() <= 8){
                        System.out.print(daftar[i][j] + "\t\t");
                    }else{
                        System.out.print(daftar[i][j] + "\t");
                    }
                }else{
                    System.out.print(daftar[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}
