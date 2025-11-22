/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6PraktikumPbo;

/**
 *
 * @author ikhsa
 */
public class IThread extends Thread {
     private boolean bombing = true;

    public void stopBombing() {
        bombing = false;
    }

    @Override
    public void run() {
        try {
            while(bombing){
                System.out.println("Pemain meledakkan negara");
                Thread.sleep(100);
            }
        }
        catch (InterruptedException e){}
        
    }
}