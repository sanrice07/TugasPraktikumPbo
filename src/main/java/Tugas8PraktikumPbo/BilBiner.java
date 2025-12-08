/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas8PraktikumPbo;


public class BilBiner {
    int angka;

    BilBiner(int angka) {
        this.angka = angka;
    }

    String konversi() {
        return Integer.toBinaryString(angka);
    }
}
