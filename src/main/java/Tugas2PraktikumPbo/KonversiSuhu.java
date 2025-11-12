/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2PraktikumPbo;

public class KonversiSuhu {
    double c;
    double f;
    double r;
    
    KonversiSuhu(double c, double f, double r){
        this.c = c;
        this.f = f;
        this.r = r;
    }
    
    double celciusKeFarenheith(){
        return 9 * c / 5 + 32;
    }
    
    double celciusKeReamur(){
        return 4 * c / 5;
    }
    
    double farenheitKeCelcius(){
        return 5 * (f - 32) / 9;
    }
    
    double farenheitKeReamur(){
        return 4 * (f - 32) / 9;
    }
    
    double reamurKeCelcius(){
        return 5 * r / 4;
    }
    
    double reamurKeFarenheit(){
        return 9 * r / 4 + 32;
    }
    
    void output(){
        System.out.println("\n" + c + " C = " + celciusKeFarenheith() + " F");
        System.out.println(f + " F = " + farenheitKeCelcius() + " C");
        System.out.println(c + " C = " + celciusKeReamur() + " R");
        System.out.println(r + " R = " + reamurKeCelcius() + " C");
        System.out.println(f + " F = " + farenheitKeReamur() + " R");
        System.out.println(r + " R = " + reamurKeFarenheit() + " F");
    }
}
