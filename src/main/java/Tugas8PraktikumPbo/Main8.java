/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas8PraktikumPbo;


public class Main8 {
    public static void main(String[] args) {
        Faktorial f = new Faktorial(5);
        System.out.println(f.nilai + "! = " + f.hitung(f.nilai));
        
        Berpangkat p = new Berpangkat(2, 4);
        System.out.println("\nHasil = " + p.hitung());
        
        BilBiner b = new BilBiner(10);
        System.out.println("\nBiner = " + b.konversi());
        
        System.out.println();
        
        Kasir k1 = new Kasir(5000);
        Kasir k2 = new Kasir(5000, 4);
        Kasir k3 = new Kasir(5000, 4, 10);

        k1.tampil();
        k2.tampil();
        k3.tampil();
        
        PersegiPanjang luar = new PersegiPanjang(10, 5);
        PersegiPanjang dalam = new PersegiPanjang(8, 4);

        Hitung h = new Hitung();
        System.out.println("\nLuas hitam = " + h.hitam(luar, dalam));
        
        System.out.println();
        
        NilaiRata2 n = new NilaiRata2(80,90,70,100);
        RataRata r = n.hitung();
        r.tampil();
        
        System.out.println();
        
        PbR d = new PbR();
        Proses proses = new Proses();
        proses.tampil(d);
    }
        
}
