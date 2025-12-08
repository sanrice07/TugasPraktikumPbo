/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas8PraktikumPbo;

public class NilaiRata2 {
    int[] data;

    NilaiRata2(int... nilai) {
        this.data = nilai;
    }

    RataRata hitung() {
        int total = 0;
        for(int n : data) total += n;
        return new RataRata(total / data.length);
    }
}

class RataRata {
    int nilai;

    RataRata(int nilai) {
        this.nilai = nilai;
    }

    void tampil() {
        System.out.println("Rata-rata = " + nilai);
    }
}
