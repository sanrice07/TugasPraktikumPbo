/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3PraktikumPbo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BuahIbuSisca {
    int mangga, jambu, tetangga, beriPerTetangga, busuk, total_buah;
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public void ioput() throws IOException{
        System.out.println("\nNo. 5");
        System.out.print("Beli mangga: ");
        this.mangga = Integer.parseInt(br.readLine());
        System.out.print("Total tetangga yang diberi buah jambu: ");
        this.tetangga = Integer.parseInt(br.readLine());
        System.out.print("Total jambu yang diberikan pada setiap tetangga: ");
        this.beriPerTetangga = Integer.parseInt(br.readLine());
        this.jambu = tetangga * beriPerTetangga;
        System.out.print("Buah mangga yang busuk: ");
        this.busuk = Integer.parseInt(br.readLine());
        mangga -= busuk;
        System.out.println("Total Buah yang dibeli: " + (mangga+jambu));
    }
}
