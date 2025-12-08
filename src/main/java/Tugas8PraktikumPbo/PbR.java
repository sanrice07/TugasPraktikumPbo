/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas8PraktikumPbo;

public class PbR {
    int[] angka = {6,12,24,48,96};
}
//Past-by-Reference
class Proses {
    void tampil(PbR d) {
        for(int n : d.angka)
            System.out.print(n + " ");
    }
}