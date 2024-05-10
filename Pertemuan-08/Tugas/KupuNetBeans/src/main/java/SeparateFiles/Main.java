/* 
 * Nama File  : Main.java          Rabu, 08/05/2024
 * Pembuat    : Zikry Alfahri Akram (24060122120033)
 * Deskripsi  : Main class untuk generic kupu
*/

package SeparateFiles;

public class Main {
    public static void main(String[] args) {
        // Kamus
        Ulat K; 
        Data<Kupu> anu;

        // Algoritma
        K = new Ulat();
        anu = new Data<>();
        anu.setIsi(K);
        anu.getIsi().gerak();
        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}
