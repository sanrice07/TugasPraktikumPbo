/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas9PraktikumPbo;


public class Produk {
     protected String judul, penulis;

    public Produk(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public void getInfoProduk() {
        System.out.println("Judul: " + judul
                + "\nPenulis: " + penulis);
    }
}
