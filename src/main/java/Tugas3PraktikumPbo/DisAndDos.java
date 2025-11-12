/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3PraktikumPbo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class DisAndDos {
    String nama;
    double total_belanja, total, bayar, kembalian;
    int diskon;
    
    DataInputStream dis = new DataInputStream(System.in);
    DataOutputStream dos = new DataOutputStream(System.out);
    
    void input() throws IOException{
        System.out.print("\nNama\t\t: ");
        nama = dis.readLine();
        System.out.print("Total Belanja\t: ");
        total_belanja = Double.parseDouble(dis.readLine());
        System.out.print("Diskon\t\t: ");
        diskon = Integer.parseInt(dis.readLine());
        total = total_belanja - total_belanja * (diskon * 0.01);
        System.out.print("Bayar\t\t: ");
        bayar = Double.parseDouble(dis.readLine());
        kembalian = bayar - total;
    }
    
    void output() throws IOException{
        dos.writeBytes("Nama\t\t: " + nama + "\n");
        dos.writeBytes("Total Belanja\t: Rp " + total_belanja + "\n");
        dos.writeBytes("Diskon\t\t: " + diskon + "%\n");
        dos.writeBytes("Total Harga\t: Rp " + total + "\n");
        dos.writeBytes("Bayar\t\t: Rp " + bayar + "\n");
        dos.writeBytes("Kembalian\t: Rp " + kembalian + "\n");


        
    }
    
}
