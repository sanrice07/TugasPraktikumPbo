/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas9PraktikumPbo;


public class Macam2Hewan {
    protected String kategori;

    public void display() {
        System.out.println(kategori);
    }
}

class HewanDuaKaki extends Macam2Hewan {
    public HewanDuaKaki() {
        kategori = "hewan berkaki dua: kangguru, ayam, bebek, dll";
    }
}

class HewanEmpatKaki extends Macam2Hewan {
    public HewanEmpatKaki() {
        kategori = "hewan berkaki empat: kucing, anjing, kuda, dll";
    }
}

class HewanEnamKaki extends Macam2Hewan {
    public HewanEnamKaki() {
        kategori = "hewan berkaki enam: capung, nyamuk, kupu-kupu, dll";
    }
}

class HewanDelapanKaki extends Macam2Hewan {
    public HewanDelapanKaki() {
        kategori = "hewan berkaki delapan: kepiting, belalang, laba-laba, dll";
    }
}
