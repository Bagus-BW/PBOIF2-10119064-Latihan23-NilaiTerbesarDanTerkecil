/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;
/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini berisi untuk mencari nilai terbesar
 * dan nilai terkecil
 */
public class PBOIF210119064Latihan23NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static int nilaiTerbesar(int banyakMhs, int nilai[]){
        int max = nilai[0];
        for (int i = 0; i < banyakMhs; i++) {
            if(nilai[i] > max){
                max = nilai[i];
            }
        }
        return max;
    }
    
    public static int nilaiTerkecil(int banyakMhs, int nilai[]){
        int min = nilai[0];
        for (int i = 0; i < banyakMhs; i++) {
            if(nilai[i] < min){
                min = nilai[i];
            }
        }
        return min;
    }
    
    public static void tampilData(int banyakMhs, int nilai[], String petugas){
        System.out.println("");
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        for (int i = 0; i < banyakMhs; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + (i+1) + " = " + nilai[i]);
        }
        
        System.out.println("");
        System.out.println("Nilai Terbesar adalah " + nilaiTerbesar(banyakMhs, nilai));
        System.out.println("Nilai Terkecil adalah " + nilaiTerkecil(banyakMhs, nilai));
        
        System.out.println("");
        System.out.println("Petugas : " + petugas);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String petugas;
        int banyakMhs, 
            nilai[] = new int[100];
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        petugas = keyboard.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        banyakMhs = keyboard.nextInt();
        for (int i = 0; i < banyakMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-"+ (i+1) + " = ");
            nilai[i] = keyboard.nextInt();
        }
        
        tampilData(banyakMhs, nilai, petugas);
    }
    
}
