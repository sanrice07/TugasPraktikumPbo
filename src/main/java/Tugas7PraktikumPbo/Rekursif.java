/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7PraktikumPbo;

public class Rekursif {
        long faktorial(int n) {
         if (n == 0 || n == 1) return 1;
         return n * faktorial(n - 1);
    }
}
