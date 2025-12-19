/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas9PraktikumPbo;


public class Hewan {
    String nama;
    
    void makan(String nama){
        System.out.println(nama + " sedang makan");
    }
}

class Kucing extends Hewan{
    public String display(){
        return this.nama;
    }
}
