/*
 * Nama File   : IFlyer.java           25/05/2024
 * Pembuat     : Zikry Alfahri Akram (24060122120033)
 * Deskripsi   : Interface untuk objek yang bisa terbang
 */

package tugas;

public interface IFlyer {
    // ABSTRACT METHOD
    /* Method yang harus direalisasikan oleh kelas yang 
     * mengimplementasikan interface IFlyer.
     */
    // Prosedur untuk lepas landas.
    public abstract void takeOff();
    
    // Prosedur untuk mendarat.
    public abstract void land();

    // Prosedur untuk terbang.
    public abstract void fly();
}