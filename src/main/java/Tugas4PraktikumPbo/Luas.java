/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4PraktikumPbo;

import java.util.Scanner;

public class Luas {
    int pilihan, sisi;
    double alas, tinggi, r, sisi_atas, sisi_bawah, d1, d2;
    
    Scanner input = new Scanner(System.in);
    
    int persegi(int sisi){
        return sisi * sisi;
    }
    
    double segitiga(double alas, double tinggi){
        return alas * tinggi / 2;
    }
    
    double lingkaran(double r){
        return 3.14 * r * r;
    }
    
    double trapesium(double sisi_atas, double sisi_bawah, double tinggi){
        return (sisi_atas + sisi_bawah) * tinggi / 2;
    }
    
    double layang(double d1, double d2){
        return d1 * d2 / 2;
    }
    
    public void output(){
        System.out.print("\nPerhitungan Luas Bangun Datar\n" + 
                "1. Luas Persegi\n" + 
                "2. Luas Segitiga\n" +
                "3. Luas Lingkaran\n" +
                "4. Luas Trapesium\n" +
                "5. Luas Layang-layang\n" +
                "Pilih bangun datar untuk dihitung luas: ");
        pilihan = input.nextInt();
        switch(pilihan){
            case 1:{
                System.out.println("Menghitung luas persegi");
                System.out.print("Masukkan sisi persegi: ");
                this.sisi = input.nextInt();
                System.out.println("Luas Persegi adalah " + persegi(sisi));
                break;
            }
            case 2:{
                System.out.println("Menghitung luas segitiga");
                System.out.print("Masukkan alas segitiga: ");
                this.alas = input.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                this.tinggi = input.nextDouble();
                System.out.println("Luas Segitiga adalah " + segitiga(alas, tinggi));
                break;
            }
            case 3:{
                System.out.println("Menghitung luas lingkaran");
                System.out.print("Masukkan jari-jari lingkaran: ");
                this.r = input.nextDouble();
                System.out.println("Luas Lingkaran adalah " + lingkaran(r));
                break;
            }
            case 4:{
                System.out.println("Menghitung luas trapesium");
                System.out.print("Masukkan sisi atas trapesium: ");
                this.sisi_atas = input.nextDouble();
                System.out.print("Masukkan sisi bawah trapesium: ");
                this.sisi_bawah = input.nextDouble();
                System.out.print("Masukkan tinggi trapesium: ");
                this.tinggi = input.nextDouble();
                System.out.println("Luas Trapesium adalah " + trapesium(sisi_atas, sisi_bawah, tinggi));
                break;
            }
            case 5:{
                System.out.println("Menghitung Luas Layang-layang");
                System.out.print("Masukkan diagonal 1: ");
                this.d1 = input.nextDouble();
                System.out.print("Masukkan diagonal 2: ");
                this.d2 = input.nextDouble();
                System.out.println("Luas Layang-layang adalah " + layang(d1, d2));
                break;
            }
            default:{
                System.out.println("Tidak ada dalam daftar");
                break;
            }
        }
        
    }
    
}
