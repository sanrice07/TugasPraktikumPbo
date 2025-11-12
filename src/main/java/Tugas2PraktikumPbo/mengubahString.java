/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2PraktikumPbo;

public class mengubahString {
    String a;
    String b;
    
    mengubahString(String a){
        this.a = a;
        this.b = a;
    }
    
    String LowerCase(){
        return a.toLowerCase();
    }
    
    String UpperCase(){
        return b.toUpperCase();
    }
    
    void output(){
        System.out.println("\n" + a + " -> " + LowerCase());
        System.out.println(b + " -> " + UpperCase());
    }
}
