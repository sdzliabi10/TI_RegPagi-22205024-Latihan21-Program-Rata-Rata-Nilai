/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugaspert6;
import java.util.Scanner;

/**
 *
 * @author Administrator
 * Nama : Sofiullah Abi Sadzili
 * Nim  : 22205024
 * Prodi : Teknik Informatika
 * Deskripsi Program : Program ini menampilkan rata rata nilai yang inputannya berasal dari user
 */
public class TI_RegPagi_22205024_Latihan21_Program_Ratarata_Nilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int banyakmahasiswa;
        System.out.print("Masukkan banyaknya mahasiswa: ");
        banyakmahasiswa = scanner.nextInt();
        
        double nilairatarata = 0;
        
        for(int i = 1; i <= banyakmahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + ": ");
            double nilai = scanner.nextDouble();
            nilairatarata += nilai;
        }
        double ratarata = nilairatarata / banyakmahasiswa;
        System.out.println("Maka, Rata-Rata Nilainya Adalah "+ratarata);
        
    }
}
        
       
 
        

