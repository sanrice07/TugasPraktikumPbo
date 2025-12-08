/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas8PraktikumPbo;


public class Berpangkat {
    int angka, pangkat;

    Berpangkat(int angka, int berpangkat) {
        this.angka = angka;
        this.pangkat = berpangkat;
    }

    int hitung() {
        int hasil = 1;
        for(int i = 0; i < pangkat; i++) {
            hasil *= angka;
        }
        return hasil;
    }
}
