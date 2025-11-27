/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7PraktikumPbo;


public class Main7 {
    public static void main(String[] args) {
       ClassObject Cs1 = new ClassObject();
       Cs1.makanan = "Susu";
       Cs1.jumlah = 12;
       Cs1.view();
       
       
       PersegiPanjang pp = new PersegiPanjang();
        pp.panjang = 5;
        pp.lebar = 3;
        System.out.println("\nKeliling Persegi Panjang = " + pp.keliling());
       
        TglLahir tl = new TglLahir();
        System.out.println("\nBulan Tanggal Lahir = " + tl.tebak(1, 14));
        System.out.println();
       
       SumpahPemuda sp = new SumpahPemuda();
        System.out.print(sp.kalimat);
        sp.lanjut1();
        System.out.print(sp.kalimat);
        sp.lanjut2();
        System.out.print(sp.kalimat);
        sp.lanjut3();
       
       Rekursif faktorial = new Rekursif();
        System.out.println("\nFaktorial dari 4 = " + faktorial.faktorial(4));
        System.out.println();
       
        ClassCivitas.Dosen d = new ClassCivitas.Dosen("Bu Siti Nazilah");
        ClassCivitas.Mahasiswa m = new ClassCivitas.Mahasiswa("Alfaris");
        ClassCivitas.Staff st = new ClassCivitas.Staff("Bu Dini");

        d.info();
        m.info();
        st.info();
       
        InputPakeThis data = new InputPakeThis(); 
        data.tampil(); 
       
    }
}
