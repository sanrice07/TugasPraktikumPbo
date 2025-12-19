/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas9PraktikumPbo;

public class Main9 {
    public static void main(String[] args) {
        new HewanDuaKaki().display();
        new HewanEnamKaki().display();
        new HewanEmpatKaki().display();
        new HewanDelapanKaki().display();
        
        System.out.println();
        
        HitungSegitiga s = new HitungSegitiga(4, 5);
        System.out.println("Luas: " + s.luas());
        
        VolumeKubus kbs = new VolumeKubus();
        kbs.setSisi(5);
        System.out.println("\nLuas Kubus: " + kbs.getLuas());
        
        System.out.println();
        
        Kucing h = new Kucing();
        h.nama = "Kucing";
        h.makan(h.display());
        
        System.out.println();
        
        Produk k = new Komik("One Piece", "Oda", 21540);
        Produk g = new Games("Resident Evil 4 Remastered", "Leon", 240);

        k.getInfoProduk();
        g.getInfoProduk();
    }
}
