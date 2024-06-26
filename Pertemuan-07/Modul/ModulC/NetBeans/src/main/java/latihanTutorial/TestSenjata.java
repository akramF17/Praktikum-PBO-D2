/*
 * Nama File  : TestSenjata.java            02/05/2024
 * Pembuat    : Zikry Alfahri Akram (24060122120033)
 * Deskripsi  : Kelas main untuk Senjata
 * 
 */

package latihanTutorial;

public class TestSenjata {
    public static void main(String[] args) {
        // Deklarasi Objek
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");

        // Uji Coba Method Kelas Senjata
        System.out.print("AK47 Menembak 3x: "); ak47.menembak(3);
        System.out.print("M16 Menembak 1x: "); m16.menembak(1);

        System.out.println("AK47 menusuk: " + ak47.menusuk());
        ak47.pasangBayonet();
        System.out.println("AK47 menusuk: " + ak47.menusuk());
    }
}
