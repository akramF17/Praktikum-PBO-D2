/*
 *  File        : PersegiPanjang.java
 *  Deskripsi   : Representasi dari objek persegi panjang, turunan kelas poligon
 *  Pembuat     : Zikry Alfahri Akram (24060122120033)
 *  Tanggal     : Rabu, 13 Maret 2024
 */

package org.bangundatar;

import org.poligon.Poligon;

public class PersegiPanjang extends Poligon{
    // ATRIBUT
    private double panjang, lebar;

    // KONSTRUKTOR 
    // Membuat objek persegi panjang dengan panjang dan lebar serta jumlahSisi yang diturunkan dari class Poligon
    public PersegiPanjang(double panjang, double lebar, int jumlahSisi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    // METHOD
    // Fungsi ini mengembalikan nilai luas dari objek persegi panjang
    public double hitungLuas(){
        return this.panjang * this.lebar;
    }

    // Prosedur ini menampilkan jumlah sisi dari objek Persegi Panjang
    public void printInfo(){
        System.out.println("Bangun Persegi Panjang bersisi " + this.getJumlahSisi());
    }
}