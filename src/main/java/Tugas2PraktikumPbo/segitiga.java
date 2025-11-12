/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2PraktikumPbo;

public class segitiga {
    double a;
    double b;
    
    segitiga(double a, double b){
        this.a = a;
        this.b = b;
    }
    
    double LuasSegitiga(){
        return a*b / 2;
    }
    
    
    void output(){
        System.out.println("\nLuas Segitiga = " + LuasSegitiga());
    }
}
