/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2PraktikumPbo;

public class pythagoras {
    double a;
    double b;
    double c;
    
    pythagoras(double a, double b){
        this.a = a;
        this.b = b;
        this.c = Math.sqrt(a*a + b*b);
    }
    
    double KelilingSegitiga(){
        return a + b + c;
    }
    
    void output(){
        System.out.println("Nilai c = " + c);
        System.out.println("Keliling Segitiga = " + KelilingSegitiga());
        
    }
}
