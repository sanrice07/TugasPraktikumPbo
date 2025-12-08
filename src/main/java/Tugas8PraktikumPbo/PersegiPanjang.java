/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas8PraktikumPbo;

public class PersegiPanjang {
    int panjang, lebar;

    PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    int luas() {
        return panjang * lebar;
    }
    
}

class Hitung {
    int hitam(PersegiPanjang besar, PersegiPanjang kecil) {
        return besar.luas() - kecil.luas();
    }
}