/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7PraktikumPbo;

import java.util.Scanner;

public class InputPakeThis {
     String nama, npm, kelas;
    public InputPakeThis() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama  : ");
        this.nama = input.nextLine();

        System.out.print("Masukkan NPM   : ");
        this.npm = input.nextLine();

        System.out.print("Masukkan Kelas : ");
        this.kelas = input.nextLine();
    }

    public void tampil() {
        System.out.println("\nData Mahasiswa");
        System.out.println("Nama  : " + this.nama);
        System.out.println("NPM   : " + this.npm);
        System.out.println("Kelas : " + this.kelas);
    }
}
