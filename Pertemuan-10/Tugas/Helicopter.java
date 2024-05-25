/*
 * Nama File   : Helicopter.java           25/05/2024
 * Pembuat     : Zikry Alfahri Akram (24060122120033)
 * Deskripsi   : Kelas untuk merepresentasikan objek Helicopter,
 *               turunan dari kelas abstrak Airplane
 */

public class Helicopter extends Airplane {
    // ATRIBUT
    private double maxLoad;

    // METHOD
    // Konstruktor Helicopter tanpa inisialisasi nilai atribut awal
    public Helicopter(){}

    // Konstruktor dengan inisialisasi beban maksimum Helicopter.
    public Helicopter (double maxLoad){
        this.maxLoad = maxLoad;
    }

    // Fungsi ini menghitung efisiensi bahan bakar Helicopter.
    @Override
    public double calcFuelEfficiency(){
        return 3.21869; // Nilai ditentukan sendiri
    }

    // Fungsi ini menghitung jarak perjalanan Helicopter.
    @Override
    public double calcTripDistance(){
        return 482.803; // Nilai ditentukan sendiri
    }

    // Fungsi ini untuk mendeskripsikan objek Helicopter.
    @Override
    public String toString(){
        return super.toString() + " hanya memerlukan landasan kecil";
    }

    // Prosedur Helicopter untuk lepas landas.
    @Override
    public void takeOff(){
        System.out.println("Helikopter lepas landas");
    }

    // Prosedur Helicopter untuk mendarat.
    @Override
    public void land(){
        System.out.println("Helikopter mendarat");
    }

    // Prosedur Helicopter untuk terbang.
    @Override
    public void fly(){
        System.out.println("Helikopter terbang");
    }
}
