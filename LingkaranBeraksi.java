/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lingkaran;

/**
 *
 * @author GF
 */
public class LingkaranBeraksi {
    public static void main(String[] args) {
        double r = 11.78;

        // Membuat objek Lingkaran
        Lingkaran lingkaran = new Lingkaran();

        // Menghitung luas lingkaran
        double luas = lingkaran.hitungLuas(r);

        // Menampilkan hasil dalam berbagai format
        System.out.println("Luas sebagai bilangan pecahan: " + luas);
        System.out.println("Luas setelah dibulatkan (casting): " + (int) luas); // Type-casting
        System.out.println("Luas setelah pembulatan (rounding): " + Math.round(luas)); // Rounding
    }
    
}
