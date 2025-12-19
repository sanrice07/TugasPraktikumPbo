/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas9PraktikumPbo;


public class LuasSegitiga {
    protected double alas, tinggi;
    
    LuasSegitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
}

class HitungSegitiga extends LuasSegitiga{
    public HitungSegitiga(double alas, double tinggi) {
        super(alas, tinggi);
    }
    public double luas(){
        return 0.5 * alas * tinggi;
    }
}
