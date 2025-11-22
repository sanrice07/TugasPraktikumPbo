/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6PraktikumPbo;

import java.util.Scanner;

public class VarArray {
    
    Scanner input = new Scanner(System.in);
    
    public void inout(){
        int[] max = new int[2], min = new int[2];
        int ganjil = 0, genap = 0, total = 0;
        System.out.print("\nMasukan jumlah elemen: ");
        int n = input.nextInt();
        int[] angka = new int[n];
                
        for(int i = 0; i < n; i++){
            System.out.print("Masukan bilangan indeks ke-" + i + " : ");
            angka[i] = input.nextInt();
            if(i % 2 == 0){
                genap = genap + angka[i];
            }else{
                ganjil = ganjil + angka[i];
            }
        }
        max[0] = min[0] = angka[0];
        max[1] = min[1] = 0;
        for(int i = 0; i < n; i++){
            if(angka[i] > max[0]){
                max[0] = angka[i];
                max[1] = i;
            }else if(angka[i] < min [0]){
                min[0] = angka[i];
                min[1] = i;
            }
        }
        total = genap + ganjil;
        System.out.println("Nilai terbesar = " + max[0] + " pada indeks ke-" + max[1]);
        System.out.println("Nilai terkecil = " + min[0] + " pada indeks ke-" + min[1]);
        System.out.println("Jumlah nilai dalam array = " + total + " dengan rata rata = " + (float)(total/n));
        if(ganjil % 2 == 0){
            System.out.println("Jumlah value dengan indeks ganjil = " + ganjil + " bernilai genap");
        }else{
            System.out.println("Jumlah value dengan indeks ganjil = " + ganjil + " bernilai ganjil");
        }
        if(genap % 2 == 0){
            System.out.println("Jumlah value dengan indeks genap = " + genap + " bernilai genap");
        }else{
            System.out.println("Jumlah value dengan indeks genap = " + genap + " bernilai ganjil");
        }
        
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(angka[i] > angka[j]){
                    int temp = angka[i];
                    angka[i] = angka[j];
                    angka[j] = temp;
                }
            }
        }
        System.out.print("Pengurutan array: ");
        for(int i = 0; i < n; i++){
            System.out.print(+ angka[i] + " ");
        }
        
    }
}
