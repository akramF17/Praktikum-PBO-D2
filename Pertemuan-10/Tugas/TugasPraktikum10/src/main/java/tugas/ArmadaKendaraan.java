/*
 * Nama File   : ArmadaKendaraan.java           25/05/2024
 * Pembuat     : Zikry Alfahri Akram (24060122120033)
 * Deskripsi   : Kelas yang merepresentasikan objek ArmadaKendaraan
 *               sebagai kelas konstruksi generic untuk Kendaraan
 */

package tugas;

import java.util.*;

public class ArmadaKendaraan <T extends Vehicle> {
    // ATRIBUT
    private Collection<T> armada;

    // KONSTRUKTOR
    // Konstruktor armada dengan inisialisasi list
    public ArmadaKendaraan(){
        this.armada = new ArrayList<>();
    }

    // METHOD
    // Prosedur untuk menambah kendaraan ke dalam armada dari 
    // list suatu jenis kendaraan yang sama
    public void tambahArmada(Collection<? extends T> armadaBaru){
        armada.addAll(armadaBaru);
    }

    // Fungsi untuk mengembalikan sebuah koleksi kendaraan berupa armada
    public Collection<T> getAllArmada(){
        return armada;
    }
}
