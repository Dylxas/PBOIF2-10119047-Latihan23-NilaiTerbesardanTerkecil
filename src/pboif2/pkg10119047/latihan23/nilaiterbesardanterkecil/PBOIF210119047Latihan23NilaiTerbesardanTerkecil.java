/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan23.nilaiterbesardanterkecil;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara @hnggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI MENCARI NILAI TERBESAR DAN TERKECIL
 */
public class PBOIF210119047Latihan23NilaiTerbesardanTerkecil {
    
    //nilai terbesar
    public static int nilaiTerbesar(int banyakMhs, int nilai[]){
        int max = nilai[0];
        for (int i = 0; i < banyakMhs; i++){
            if (nilai[i] > max){
              max = nilai[i];  
            }          
        }
        return max;
    }
    
    //nilai terkecil
    public static int nilaiTerkecil(int banyakMhs, int nilai[]){
        int min = nilai[0];
        for (int i = 0; i < banyakMhs; i++){
            if (nilai[i] < min){
              min = nilai[i];  
            }          
        }
        return min;
    }
    
    //tampil data
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
    
    /**
     * @param args the command line arguments
     */
    
    //utama
    public static void main(String[] args) {
        // TODO code application logic here
        String petugas;
        int banyakMhs;
        int nilai[] = new int[100];
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("=====Program Nilai Terbesar dan Terkecil Mahasiswa=====");
        
        System.out.print("Masukkan Nama Petugas : ");
        petugas = input.next();
        
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        banyakMhs= input.nextInt();
        
        for(int i=0; i < banyakMhs; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i+1) + " = ");
            nilai[i] = input.nextInt();
        }
        
        tampilData(banyakMhs,nilai,petugas);
    }
    
}
