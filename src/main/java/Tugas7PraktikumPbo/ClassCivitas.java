/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7PraktikumPbo;


public class ClassCivitas {
        static class Civitas {
        String nama;
        String status;

        void info() {
            System.out.println("Nama   : " + nama);
            System.out.println("Status : " + status);
            System.out.println("----------------------");
        }
    }

    static class Dosen extends Civitas {
        public Dosen(String nama) {
            this.nama = nama;
            this.status = "Dosen Fakultas Teknik";
        }
    }

    static class Mahasiswa extends Civitas {
        public Mahasiswa(String nama) {
            this.nama = nama;
            this.status = "Mahasiswa Fakultas Teknik";
        }
    }

    static class Staff extends Civitas {
        public Staff(String nama) {
            this.nama = nama;
            this.status = "Staff Fakultas Teknik";
        }
}
}
