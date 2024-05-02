/*
 * Nama File  : Senjata.java            02/05/2024
 * Pembuat    : Zikry Alfahri Akram (24060122120033)
 * Deskripsi  : Kelas yang merepresentasikan objek Senjata
 * 
 */

package latihanTutorial;

public class Senjata {
    // ATRIBUT
    private String bunyi;
    private boolean menusuk;

    // METHOD
    // Konstruktor
    // Konstruktor ini membuat objek Senjata
    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.menusuk = false;
    }

    // Selektor dan Mutator
    // Fungsi ini mengembalikan nilai 'bunyi' dari objek Senjata
    private String getBunyi(){
        return bunyi;
    }
    // Prosedur ini mengubah nilai 'bunyi' menjadi nilai yang baru
    private void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    // Fungsi ini mengembalikan nilai 'menusuk' dari objek Senjata
    private boolean isMenusuk(){
        return menusuk;
    }
    // Prosedur ini mengubah nilai 'menusuk' menjadi nilai yang baru
    private void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }

    // Fungsi/Prosedur Lainnya
    // Prosedur ini menampilkan bunyi tembakan dari senjata
    public void menembak(int jumlah){
        for (int i = 0; i < jumlah; i++){
            System.out.print(this.getBunyi() + " ");
        }
        System.out.println("");
    }
    // Prosedur ini menampilkan pesan 'Bayonet Terpasang' dengan 
    //    mengatur nilai 'menusuk' adalah True
    public void pasangBayonet(){
        setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
    // Fungsi ini menampilkan pesan apakah senjata berhasil 
    //    menusuk atau tidak
    public String menusuk(){
        if (this.isMenusuk()){
            return "Jleb!";
        } else {
            return "Gagal, belum pasang bayonet";
        }
    }
}
