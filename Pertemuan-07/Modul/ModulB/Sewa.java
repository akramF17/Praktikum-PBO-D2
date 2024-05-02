/* 
 *  File      : Sewa.java    02/05/2024
 *  Pembuat   : Zikry Alfahri Akram (24060122120033)
 *  Deskripsi : Kelas main yang merepresentasikan Sewa Kendaraan
 * 
 */

public class Sewa {
    public static void main(String[] args) {
        // Deklarasi objek
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();

        // Harga sewa objek
        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);
    }
}
