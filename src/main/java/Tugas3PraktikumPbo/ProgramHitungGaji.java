/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3PraktikumPbo;


public class ProgramHitungGaji {
    double p1, p2, p3, p4, total_gaji, pajak_penghasilan, gaji_bersih;
    String nik, nama, alamat, jabatan;
    
    ProgramHitungGaji(String nik, String nama, String alamat, String jabatan, double p1, double p2, double p3, double p4){
        this.nik = nik;
        this.nama = nama;
        this.alamat = alamat;
        this.jabatan = jabatan;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.total_gaji = p1 + p2 + p3 + p4;
        this.pajak_penghasilan = 0.1 * (p1 + p2 + p4);
        this.gaji_bersih = this.total_gaji - this.pajak_penghasilan;
    }
    
    void output(){
        System.out.println("Nomor Induk Karyawan\t: " + nik
                + "\nNama Karyawan\t\t: " + nama
                + "\nAlamat\t\t\t: " + alamat
                + "\nJabatan\t\t\t: " + jabatan 
                + "\nGaji Pokok\t\t: " + p1
                + "\nTunjangan Jabatan\t: " + p2
                + "\nTunjangan Istri\t\t: " + p3
                + "\nTunjangann Anak\t\t: " + p4
                + "\nTotal Gaji\t\t: " + total_gaji
                + "\nPajak Penghasilan\t: " + pajak_penghasilan
                + "\nGaji Bersih\t\t: " + gaji_bersih);
    }
    
}
