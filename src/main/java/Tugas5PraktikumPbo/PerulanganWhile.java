/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5PraktikumPbo;


public class PerulanganWhile {
     int i;
    
    public void output(){
        this.i = 1;
        System.out.println("\nNilai awal i = " + i);
        while(i<=5){
            System.out.println("i++ ke-" + i + " = " + (i++));
        }
        System.out.println();
        i = 1;
        while(i<=5){
            System.out.println("++i ke-" + i + " = " + (++i));
        }
    }
}
