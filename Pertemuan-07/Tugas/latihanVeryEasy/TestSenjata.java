/*
 * Nama File  : TestSenjata.java            02/05/2024
 * Pembuat    : Zikry Alfahri Akram (24060122120033)
 * Deskripsi  : Kelas main untuk Senjata
 * 
 */

public class TestSenjata {
    public static void main(String[] args) {
        // Deklarasi Objek
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");

        // Uji Coba Method Kelas Senjata
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        System.out.println("AK47 mengisi peluru");
        ak47.setPeluru(5);
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());

        System.out.println("AK47 menembak");
        ak47.menembak();
    }
}
