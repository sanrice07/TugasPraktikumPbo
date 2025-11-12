/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3PraktikumPbo;

import java.io.IOException;

public class Main2 {
    public static void main(String[] args) throws IOException {
        
        ProgramHitungGaji gajibersih = new ProgramHitungGaji("5520124009", "Ikhsan Salman Alfaris", "Cibeber", "Karyawan", 2000000, 300000, 200000, 150000);
        gajibersih.output();
        
        DisAndDos  pembelanjaan = new DisAndDos ();
        pembelanjaan.input();
        pembelanjaan.output();
        
        BufferReaderAndScanner  scanvsbr = new BufferReaderAndScanner ();
        scanvsbr.output();
        
        Sentripetal sentripetal = new Sentripetal();
        sentripetal.ioput();
        
        BuahIbuSisca buah = new BuahIbuSisca();
        buah.ioput();
        
        SelisihWaktu selisihwaktu = new SelisihWaktu();
        selisihwaktu.ioput();
        
        Novel novel = new Novel();
        novel.ioput();
        
    }
}
