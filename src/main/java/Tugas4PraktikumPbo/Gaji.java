/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4PraktikumPbo;

import java.util.Scanner;

public class Gaji {
    int gaji_bersih, gaji_pokok, golongan, anak, tunjangan;
    String nik, nama, status;
    
    Scanner input = new Scanner(System.in);
    
    int gaji_bersih(int gaji_pokok, int tunjangan){
        return gaji_pokok + tunjangan;
    }
    
    int tunjangan(int gaji_pokok, int anak){
        if(anak == 0){
            return (int) (gaji_pokok * 0.1);
        }else{
            return (int) (gaji_pokok * 0.1 + gaji_pokok * 0.05 * anak);
        }
    }
    
    public void input(){
        System.out.print("\nMasukan NIK: ");
        this.nik = input.nextLine();
        System.out.print("Masukan Nama: ");
        this.nama = input.nextLine();
        System.out.print("Golongan\n" + 
                "1. Menikah\n" + 
                "2. Belum Menikah\n" + 
                "3. Cerai\n" + 
                "4. Menikah dan punya anak\n" + 
                "Masukkan kode golongan: ");
        this.golongan = input.nextInt();
        if(golongan == 4){
            System.out.print("Masukkan jumlah anak: ");
            this.anak = input.nextInt();
        }else{
            this.anak = 0;
        }
        output();
    }
    
    public void output(){
        switch(golongan){
            case 1:{
                this.status = "Menikah";
                this.gaji_pokok = 1200000;
                this.tunjangan = tunjangan(gaji_pokok, anak);
                this.gaji_bersih = gaji_bersih(gaji_pokok, tunjangan);
                break;
            }
            case 2:{
                this.status = "Belum Menikah";
                this.gaji_pokok = 1500000;
                this.tunjangan = 0;
                this.gaji_bersih = gaji_bersih(gaji_pokok, tunjangan);
                break;
            }
            case 3:{
                this.status = "Cerai";
                this.gaji_pokok = 1750000;
                this.tunjangan = 0;
                this.gaji_bersih = gaji_bersih(gaji_pokok, tunjangan);
                break;
            }
            case 4:{
                this.status = "Menikah dan punya " + anak + " anak";
                this.gaji_pokok = 2000000;
                this.tunjangan = tunjangan(gaji_pokok, anak);
                this.gaji_bersih = gaji_bersih(gaji_pokok, tunjangan);
                break;
            }
        }
        if(gaji_pokok != 0){
            System.out.println("Gaji bersih yang didapat dengan status " + status + " adalah " + gaji_bersih);
        }else{
            System.out.println("Kode golongan tidak terdaftar!");
        }
    }
    
    
}
