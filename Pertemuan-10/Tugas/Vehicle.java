/*
 * Nama File   : Vehicle.java           25/05/2024
 * Pembuat     : Zikry Alfahri Akram (24060122120033)
 * Deskripsi   : Kelas abstrak yang merepresentasikan objek Vehicle
 */

 public abstract class Vehicle {
    // METHOD
    // Fungsi ini menghitung efisiensi bahan bakar kendaraan.
    public double calcFuelEfficiency(){
        return 14.3; // Nilai ditentukan sendiri
    }
    // public abstract double calcFuelEfficiency();

    // Fungsi ini menghitung jarak tempuh kendaraan.
    public double calcTripDistance(){
        return 30.0; // Nilai ditentukan sendiri
    }
    // public abstract double calcTripDistance();

    // Fungsi ini mengembalikan nama kelas kendaraan dari sebuah objek.
    public String toString() {
        return this.getClass().getSimpleName();
    }
}