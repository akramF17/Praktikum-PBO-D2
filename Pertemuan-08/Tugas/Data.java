/* 
 * Nama File  : Data.java          Rabu, 08/05/2024
 * Pembuat    : Zikry Alfahri Akram (24060122120033)
 * Deskripsi  : Kelas konstruksi generic
*/

public class Data<T> {
    // ATRIBUT
    private T isi;

    // METHOD
    // Fungsi untuk mengembalikan isi dengan tipe data T
    public T getIsi(){
        return this.isi;
    }
    // Prosedur untuk mengganti isi dengan tipe data T
    public void setIsi(T x){
        this.isi = x;
    }
}
