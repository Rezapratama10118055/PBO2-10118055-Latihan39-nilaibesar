/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118055.latihan39.nilaiterbesarterkecil;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PBO210118055Latihan39NilaiTerbesarterkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
      
       nilaiMhs maha = new nilaiMhs();
        System.out.println("====== Program Nilai Terbesar Dan Terkecil Mahasiswa =====");
        Scanner petugas = new Scanner(System.in);
        String nama = petugas.nextLine();
        System.out.print("Masukan Nama Petugas : ");
        
        
        System.out.print("Masukan Banyaknya Nilai Mahasiswa \t: ");
        Scanner banyak = new Scanner(System.in);
        maha.setbanyak(banyak.nextInt());
        maha.InputNilai();
     
       
        System.out.println("======= Hasil Nilai Mahasiswa =======");
        maha.getNilai();
      
        System.out.println("Nilai Terbesar adalah "+maha.terbesar());
        System.out.println("Nilai Terkecil adalah "+maha.terkecil());
 
        System.out.println("petugas="+petugas);
        
        
    }
    
}
