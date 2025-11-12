/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4PraktikumPbo;

public class Main4 {
    public static void main(String[] args){
        
        GanjilGenap ganjilgenap = new GanjilGenap();
        ganjilgenap.output();
        
        Hari hari = new Hari();
        hari.output();
        
        Gaji gaji = new Gaji();
        gaji.input();
        
        TahunKabisat tahun = new TahunKabisat();
        tahun.output();

        Salesman salesman = new Salesman();
        salesman.output();

        Kasir kasir = new Kasir();
        kasir.output();

        Luas luas = new Luas();
        luas.output();
        
    }
}
