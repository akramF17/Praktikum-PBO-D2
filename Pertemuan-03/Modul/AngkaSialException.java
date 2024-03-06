/*
 * File         : AngkaSialException.java
 * Deskripsi    : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Pembuat      : Zikry Alfahri Akram (24060122120033)
 * Tanggal      : Rabu, 6 Maret 2024
 */

public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("Jangan memasukkan angka 13 karena angka sial !!!");
    }
}
