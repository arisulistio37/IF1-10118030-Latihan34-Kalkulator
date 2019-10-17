/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118030.latihan34.kalkulator;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Ari Sulistio
 * KELAS    : IF-1
 * NIM      : 10118030
 * Deskripsi Program : program ini berisi tentang kalkulator
 */
public class IF110118030Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Kalkulator itung = new Kalkulator();
        System.out.println("===Aplikasi Kalkulator Bilangan===");
        System.out.print("Masukkan Angka Ke-1 : ");
        itung.value1 = scanner.nextDouble();
        System.out.print("Masukkan Angka Ke-2 : ");
        itung.value2 = scanner.nextDouble();
        System.out.println("");
        System.out.println("Hasil Pertambahan : "+itung.tambahBilangan());
        System.out.println("Hasil Pengurangan : "+itung.kurangBilangan());
        System.out.println("Hasil Perkalian : "+itung.kaliBilangan());
        System.out.println("Hasil Pembagian : "+itung.bagiBilangan());
        System.out.println("Hasil Sisa : "+itung.sisaBilangan());
    }
    
}
