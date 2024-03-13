/*
 *  File        : MPoligon.java
 *  Deskripsi   : Driver class untuk poligon dan persegi panjang
 *  Pembuat     : Zikry Alfahri Akram (24060122120033)
 *  Tanggal     : Rabu, 13 Maret 2024
 */

package org.main;

import org.bangundatar.*;

public class MPoligon{
    public static void main(String[] args){
        // Inisiasi objek class Persegi pada persegi dengan nilai panjang, lebar, dan jumlah sisi masing-masing 10, 10, dan 4
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        // Menampilkan info jumlah sisi dari objek persegi
        persegi.printInfo();
        // Menampilkan luas dari objek persegi
        System.out.println("Luas Persegi Panjang : " + persegi.hitungLuas());

        // Inisiasi objek class Segitiga pada segitiga dengan nilai sisi A, sisi B, sisi C, dan jumlah sisi masing-masing 3, 4, 5, dan 3
        Segitiga segitiga = new Segitiga(5, 5, 5, 3);
        // Menampilkan info jumlah sisi dari objek segitiga
        segitiga.printInfo();
        // Menampilkan keliling dari objek segitiga
        System.out.println("Keliling Segitiga : " + segitiga.hitungKeliling());
        // Menampilkan luas dari objek segitiga
        System.out.println("Luas Segitiga : " + segitiga.hitungLuas());
    }
}