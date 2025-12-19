/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas9PraktikumPbo;


public class VolumeKubus {
    private int sisi;
    
    public void setSisi(int sisi){
        if(sisi <= 0){
            System.out.println("Sisi harus lebih dari 0");
        }else{
            this.sisi = sisi;
        }
    }
    
    public int getSisi(){
        return sisi;
    }
    
    private int luas(){
        return sisi * sisi * sisi;
    }
    
    public int getLuas(){
        return luas();
    }
}
