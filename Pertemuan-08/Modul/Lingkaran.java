/* 
 * Nama File  : Lingkaran.java          Rabu, 08/05/2024
 * Pembuat    : Zikry Alfahri Akram (24060122120033)
 * Deskripsi  : Implementasi Lingkaran sebagai BangunDatar
*/

public class Lingkaran extends BangunDatar{
    // ATRIBUT
    private double jejari;

    // KONSTRUKTOR
    // Membuat objek Lingkaran dengat atribut jejari
    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    // METHOD
    // Fungsi ini menghitung keliling dari lingkaran
    // {Method ini harus direalisasikan karena class ini adalah
    //  turunan dari class BangunDatar}
    public double hitungKeliling(){
        return 2*jejari*Math.PI;
    }
}
