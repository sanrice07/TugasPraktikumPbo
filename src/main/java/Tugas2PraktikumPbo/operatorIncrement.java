/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2PraktikumPbo;

public class operatorIncrement {
    int a;
    int b;
    
    operatorIncrement(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    void output(){
        System.out.print("Nilai a = " + a);
        System.out.println("\t\t\t\tNilai b = " + b);
        System.out.print("Nilai a++ = " + a++);
        System.out.println("\t\t\t\tNilai ++b = " + ++b);
        System.out.print("Nilai a setelah post-increment = " + a);
        System.out.println("\tNilai b setelah pre-increment = " + b);
    }
}
