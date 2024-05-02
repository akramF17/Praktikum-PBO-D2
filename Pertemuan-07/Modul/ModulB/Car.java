/* 
 *  File      : Car.java    02/05/2024
 *  Pembuat   : Zikry Alfahri Akram (24060122120033)
 *  Deskripsi : Kelas yang merepresentasikan objek Mobil,
 *              turunan dari kelas Vehicle
 * 
 */

public class Car extends Vehicle {
    // Prosedur ini menampilkan harga sewa mobil
    @Override
    public void calRent(int jarak, float harga){
        float fare = jarak * harga;
        fare = fare - 100.00f;
        System.out.println("Harga sewa mobil = " + fare);
    }
}
