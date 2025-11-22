/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6PraktikumPbo;

public class ManyThread extends Thread {

    private String name;

    ManyThread(String name){
        this.name = name;
    }

    public void run(){
        for(int i = 1; i <= 3; i++){
            System.out.println(name + " ke-" + i);
        }
    }

    public static void jalankan(){
        for(int i = 1; i <= 3; i++){
            new ManyThread("Thread-" + i).start();
        }
    }
}