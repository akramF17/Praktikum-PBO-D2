/* 
 *  File      : Vehicle.java    02/05/2024
 *  Pembuat   : Zikry Alfahri Akram (24060122120033)
 *  Deskripsi : Kelas parent yang merepresentasikan objek Kendaraan
 * 
 */

public class Vehicle {
    // Prosedur ini menghitung harga sewa kendaraan
    public void calRent(int distance, float price){
        float fare = distance * price;
        System.out.println("Vehicle price = " + fare);
    }
}
