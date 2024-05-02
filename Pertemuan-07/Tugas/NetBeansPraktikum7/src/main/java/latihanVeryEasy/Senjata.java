/*
 * Nama File  : Senjata.java            02/05/2024
 * Pembuat    : Zikry Alfahri Akram (24060122120033)
 * Deskripsi  : Kelas yang merepresentasikan objek Senjata
 * 
 */

package latihanVeryEasy;

public class Senjata {
    // ATRIBUT
    private String bunyi;
    private int peluru;

    // METHOD
    // Konstruktor
    // Konstruktor ini membuat objek Senjata
    public Senjata(String bunyi){
        this.bunyi = bunyi;
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
    // Prosedur ini mengubah nilai 'bunyi' menjadi nilai yang baru
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    // Prosedur ini mengubah nilai 'peluru' menjadi nilai yang baru
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }

    // Fungsi/Prosedur Lainnya
    // Prosedur ini menembakkan 1 peluru dari senjata
    public void menembak(){
        if (this.getPeluru() > 0){
            System.out.println(this.getBunyi());
            this.setPeluru(this.peluru - 1);
            System.out.println("Sisa Peluru: " + this.getPeluru());
        } else {
            System.out.println("Peluru Habis");
        }
    }
}
