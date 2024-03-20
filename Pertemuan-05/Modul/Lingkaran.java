/* 
 *  File      : Lingkaran.java    20/03/2023
 *  Pembuat   : Zikry ALfahri Akram
 *  Deskripsi : Kelas implementasi IArea berupa cara menghitung luas lingkaran
 * 
 */

// Mengambil konstanta yang ada di kelas java.lang.Math
import static java.lang.Math.PI;

class Lingkaran implements IArea {
    private double jejari;

    // Tambahan: Konstruktor tanpa signature
    public Lingkaran(){
    }
    
    public Lingkaran(double r){
        jejari = r;
    }

    // Tambahan: Setter untuk mengatur jejari
    public void setJejari(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI*jejari*jejari;
    }
}
