/*
 * Nama File   : RiverBarge.java           25/05/2024
 * Pembuat     : Zikry Alfahri Akram (24060122120033)
 * Deskripsi   : Kelas untuk merepresentasikan objek RiverBarge,
 *               turunan dari kelas abstrak Vehicle
 */

package tugas;

public class RiverBarge extends Vehicle {
    // ATRIBUT
    private double maxLoad;

    // METHOD
    // Konstruktor RiverBarge tanpa inisialisasi nilai atribut awal
    public RiverBarge(){}

    // Konstruktor dengan inisialisasi beban maksimum kapal tongkang sungai.
    public RiverBarge (double maxLoad){
        this.maxLoad = maxLoad;
    }

    // Fungsi ini menghitung efisiensi bahan bakar kapal tongkang sungai.
    @Override
    public double calcFuelEfficiency(){
        return 4.82803; // Nilai ditentukan sendiri
    }

    // Fungsi ini menghitung jarak perjalanan kapal tongkang sungai.
    @Override
    public double calcTripDistance(){
        return 321.869; // Nilai ditentukan sendiri
    }

    // Fungsi ini untuk mendeskripsikan objek Kapal tongkang sungai.
    @Override
    public String toString(){
        return super.toString() + " kendaraan air untuk transportasi material berat di perairan dangkal";
    }
}
