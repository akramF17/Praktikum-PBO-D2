/*
 * Nama File   : SeaPlane.java           25/05/2024
 * Pembuat     : Zikry Alfahri Akram (24060122120033)
 * Deskripsi   : Kelas untuk merepresentasikan objek SeaPlane,
 *               turunan dari kelas abstrak Airplane
 */

package tugas;

public class SeaPlane extends Airplane {
    // ATRIBUT
    private double maxLoad;

    // METHOD
    // Konstruktor SeaPlane tanpa inisialisasi nilai atribut awal
    public SeaPlane(){}

    // Konstruktor dengan inisialisasi beban maksimum SeaPlane.
    public SeaPlane (double maxLoad){
        this.maxLoad = maxLoad;
    }

    // Fungsi ini menghitung efisiensi bahan bakar SeaPlane.
    @Override
    public double calcFuelEfficiency(){
        return 8.04672; // Nilai ditentukan sendiri
    }

    // Fungsi ini menghitung jarak perjalanan SeaPlane.
    @Override
    public double calcTripDistance(){
        return 965.606; // Nilai ditentukan sendiri
    }

    // Fungsi ini untuk mendeskripsikan objek SeaPlane.
    @Override
    public String toString(){
        return super.toString() + " dapat take-off dan mendarat di perairan laut";
    }

    // Prosedur SeaPlane untuk lepas landas.
    @Override
    public void takeOff(){
        System.out.println("Pesawat laut lepas landas");
    }

    // Prosedur SeaPlane untuk mendarat.
    @Override
    public void land(){
        System.out.println("Pesawat laut mendarat");
    }

    // Prosedur SeaPlane untuk terbang.
    @Override
    public void fly(){
        System.out.println("Pesawat laut terbang");
    }
}
