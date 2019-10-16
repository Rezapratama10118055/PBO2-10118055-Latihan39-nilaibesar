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
public class nilaiMhs {
    private int [] nilai;
    public int banyak,i,j;

    public int getbanyak() {
        return banyak;
    }

    public void setbanyak(int banyak) {
        this.banyak = banyak;
    }
    
    public void InputNilai(){
         j = getbanyak();
        nilai= new int[j];
        for ( i = 0; i < j; i++) {
            System.out.print("Nilai Mahasiswa Ke-"+(i+1)+" :");
            Scanner nilai1= new Scanner(System.in);
            nilai[i]=nilai1.nextInt();
        }
    }
    
    public  int terbesar() {
        int terbesar = nilai[0];
        for ( i = 1; i < nilai.length; i++) {
            if (nilai[i] > terbesar) {
                terbesar = nilai[i];
            }
        }
        return terbesar;
    }
    public int terkecil() {
        int terkecil = nilai[0];
        for ( i = 1; i < nilai.length; i++) {
            if (nilai[i] < terkecil) {
                terkecil = nilai[i];
            }
        }
        return terkecil;
    }
    public void getNilai(){
        for (i = 0; i < getbanyak(); i++) 
            System.out.println("Nilai Mahasiswa Ke-"+(i+1)+" :" +nilai[i]);
    }
    
}

