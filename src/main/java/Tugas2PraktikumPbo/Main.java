/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2PraktikumPbo;

import Tugas2PraktikumPbo.segitiga;
import Tugas2PraktikumPbo.KonversiSuhu;
import Tugas2PraktikumPbo.operatorIncrement;
import Tugas2PraktikumPbo.menghitungKecepatanCahaya;

public class Main {
     public static void main(String[] args) {
        
        
        operatorIncrement operatorIncrement = new operatorIncrement(5, 5);
        operatorIncrement.output();
        
        segitiga segitiga = new segitiga(6, 8);
        segitiga.output();
        
        pythagoras pythagoras = new pythagoras(6, 8);
        pythagoras.output();
        
        mengubahString mengubahString = new mengubahString("Saya Belajar Java");
        mengubahString.output();
        
        menghitungKecepatanCahaya menghitungKecepatanCahaya = new menghitungKecepatanCahaya(384400, 152100000);
        menghitungKecepatanCahaya.output();
        
        KonversiSuhu konversisuhu = new KonversiSuhu(10, 15, 5);
        konversisuhu.output();
        
    }
}
