/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas8PraktikumPbo;


public class Faktorial {
    long nilai;

    Faktorial(int nilai) {
        this.nilai = nilai;
    }

    long hitung(long n) {
        if(n == 0 || n == 1){
            return 1;
        }
        return n * hitung(n-1);
    }
}