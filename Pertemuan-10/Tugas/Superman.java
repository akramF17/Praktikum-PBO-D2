/*
 * Nama File   : Superman.java           25/05/2024
 * Pembuat     : Zikry Alfahri Akram (24060122120033)
 * Deskripsi   : Kelas untuk merepresentasikan objek Superman,
 *               turunan dari kelas abstrak Kryptonian
 */

public class Superman extends Kryptonian {
    // ATRIBUT
    private String name;

    // METHOD
    // Konstruktor Superman tanpa inisialisasi nilai atribut awal
    public Superman(){}

    // Konstruktor superman dengan inisialisasi nama superman.
    public Superman (String name){
        this.name = name;
    }

    // Prosedur superman untuk lepas landas.
    @Override
    public void takeOff(){
        System.out.println(this.name + " lepas landas");
    }

    // Prosedur superman untuk mendarat.
    @Override
    public void land(){
        System.out.println(this.name + " mendarat.");
    }

    // Prosedur superman untuk terbang.
    @Override
    public void fly(){
        System.out.println(this.name + " terbang.");
    }

    // Prosedur superman untuk melompati gedung.
    public void leapBuilding(){
        System.out.println(this.name + " melompati sebuah gedung.");
    }

    // Prosedur superman untuk menghentikan peluru.
    public void stopBullet(){
        System.out.println(this.name + " menghentikan peluru.");
    }

    // Prosedur superman untuk makan.
    @Override
    public void eat(){
        System.out.println(this.name + " sedang makan pancong.");
    }
}
