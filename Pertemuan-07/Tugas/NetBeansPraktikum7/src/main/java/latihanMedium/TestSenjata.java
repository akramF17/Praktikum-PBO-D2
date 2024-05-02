/*
 * Nama File  : TestSenjata.java            02/05/2024
 * Pembuat    : Zikry Alfahri Akram (24060122120033)
 * Deskripsi  : Kelas main untuk Senjata dan Kontrol Senjata
 * 
 */

package latihanMedium;

public class TestSenjata {
    public static void main(String[] args) {
        // Deklarasi Objek
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");
        KontrolSenjata kontrolAK47 = new KontrolSenjata(ak47);
        KontrolSenjata kontrolM16 = new KontrolSenjata(m16);

        // Uji Coba Method Kelas Kontrol Senjata
        kontrolAK47.menembak(2);
        kontrolAK47.isiPeluru(3);
        kontrolAK47.menembak(5);

        System.out.println("==============================");

        kontrolM16.menembak(1);
        kontrolM16.isiPeluru(5);
        kontrolM16.menembak(2);
    }
}
