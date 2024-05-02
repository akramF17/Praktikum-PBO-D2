/*
 * Nama File  : Senjata.java            02/05/2024
 * Pembuat    : Zikry Alfahri Akram (24060122120033)
 * Deskripsi  : Kelas yang merepresentasikan objek Senjata
 * 
 */

public class Senjata {
    // ATRIBUT
    private String bunyi;
    private boolean menusuk;
    private int peluru;

    // METHOD
    // Konstruktor
    // Konstruktor ini membuat objek Senjata
    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.menusuk = false;
        this.peluru = 0;
    }

    // Selektor dan Mutator
    // Fungsi ini mengembalikan nilai 'bunyi' dari objek Senjata
    public String getBunyi(){
        return bunyi;
    }
    // Fungsi ini mengembalikan nilai 'peluru' dari objek Senjata
    public int getPeluru(){
        return peluru;
    }
    // Fungsi ini mengembalikan nilai 'menusuk' dari objek Senjata
    public boolean isMenusuk(){
        return menusuk;
    }
    // Prosedur ini mengubah nilai 'bunyi' menjadi nilai yang baru
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    // Prosedur ini mengubah nilai 'menusuk' menjadi nilai yang baru
    public void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }
    // Prosedur ini mengubah nilai 'peluru' menjadi nilai yang baru
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
}