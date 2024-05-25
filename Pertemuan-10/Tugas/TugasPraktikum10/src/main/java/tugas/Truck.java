/*
 * Nama File   : Truck.java           25/05/2024
 * Pembuat     : Zikry Alfahri Akram (24060122120033)
 * Deskripsi   : Kelas untuk merepresentasikan objek Truk,
 *               turunan dari kelas abstrak Vehicle
 */

package tugas;

public class Truck extends Vehicle {
    // ATRIBUT
    private double maxLoad;

    // METHOD
    // Konstruktor Truck tanpa inisialisasi nilai atribut awal
    public Truck(){}

    // Konstruktor dengan inisialisasi beban maksimum truk.
    public Truck (double maxLoad){
        this.maxLoad = maxLoad;
    }

    // Fungsi ini menghitung efisiensi bahan bakar truk.
    @Override
    public double calcFuelEfficiency(){
        return 12.8748; // Nilai ditentukan sendiri
    }

    // Fungsi ini menghitung jarak perjalanan truk.
    @Override
    public double calcTripDistance(){
        return 643.738; // Nilai ditentukan sendiri
    }

    // Fungsi ini untuk mendeskripsikan objek Truk.
    @Override
    public String toString(){
        return super.toString() + " adalah angkutan darat yang sangat handal";
    }
}
