/*
 *  File        : Segitiga.java
 *  Deskripsi   : Representasi dari objek segitiga, turunan kelas poligon
 *  Pembuat     : Zikry Alfahri Akram (24060122120033)
 *  Tanggal     : Rabu, 13 Maret 2024
 */

package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
    // ATRIBUT
    private double sisiA, sisiB, sisiC;

    // KONSTRUKTOR
    // Membuat objek persegi panjang dengan sisi A, sisi B, dan sisi C serta jumlahSisi yang diturunkan dari class Poligon
    public Segitiga(double sisiA, double sisiB, double sisiC, int jumlahSisi){
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
        this.jumlahSisi = jumlahSisi;
    }

    // METHOD
    // Fungsi ini mengembalikan nilai keliling dari objek Segitiga
    public double hitungKeliling(){
        return this.sisiA + this.sisiB + this.sisiC;
    }
    
    // Fungsi ini mengembalikan nilai luas dari objek Segitiga
    public double hitungLuas(){
        return Math.sqrt(this.hitungKeliling()/2 * (this.hitungKeliling()/2 - this.sisiA) * (this.hitungKeliling()/2 - this.sisiB) * (this.hitungKeliling()/2 - this.sisiC));
    }

    // Prosedur ini menampilkan jumlah sisi dari objek Segitiga
    public void printInfo(){
        System.out.println("Bangun Segitiga bersisi " + this.getJumlahSisi());
    }
}
