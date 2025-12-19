/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas9PraktikumPbo;


public class Komik extends Produk {
     int jumlahHalaman;

    public Komik(String judul, String penulis, int jumlahHalaman) {
        super(judul, penulis);
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public void getInfoProduk() {
        System.out.println("Judul: " + this.judul
                + "\nPenulis: " + this.penulis
                + "\nJumlah Halaman: " + this.jumlahHalaman);
    }
}

class Games extends Produk {
    int waktuMain;

    public Games(String judul, String penulis, int waktuMain) {
        super(judul, penulis);
        this.waktuMain = waktuMain;
    }

    @Override
    public void getInfoProduk() {
        System.out.println("Judul: " + this.judul
                + "\nPenulis: " + this.penulis
                + "\nWaktu Main: " + this.waktuMain + " jam");
    }
}
