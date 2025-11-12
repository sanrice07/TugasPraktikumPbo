/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5PraktikumPbo;

/**
 *
 * @author ikhsa
 */
public class Triangle {
    public void output(){
        System.out.println();
        for(int i = 0; i < 5; i++){
            for(int j = 4; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 0; k < (i*2 + 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i < 3; i++){
            for(int j = 2; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 0; k < (i*2 + 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < 2; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(" ");
            }
            for(int k = 3; k >= (i*2 + 1); k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
