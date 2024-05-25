/*
 * Nama File   : Animal.java           25/05/2024
 * Pembuat     : Zikry Alfahri Akram (24060122120033)
 * Deskripsi   : Kelas abstrak untuk merepresentasikan objek Animal
 */

package tugas;

public abstract class Animal {
    // ABSTRACT METHOD
    /* Method yang harus direalisasikan oleh kelas yang 
     * merupakan turunan dari kelas abstrak Animal.
     */
    // Prosedur untuk makan
    public abstract void eat();

    // Fungsi ini mengembalikan nama kelas hewan dari sebuah objek.
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
