/*
 * Nama File  : KontrolSenjata.java            02/05/2024
 * Pembuat    : Zikry Alfahri Akram (24060122120033)
 * Deskripsi  : Kelas yang merepresentasikan Kontrol Senjata
 * 
 */

package latihanMedium;

public class KontrolSenjata {
    // ATRIBUT
    private Senjata senjata;

    // METHOD
    // Konstruktor ini membuat objek KontrolSenjata
    public KontrolSenjata (Senjata s){
        this.senjata = s;
    }
    // Fungsi ini akan mengembalikan true apabila senjata mempunyai peluru
    public boolean isAdaPeluru(){
        if (senjata.getPeluru() > 0){
            return true;
        } else {
            return false;
        }
    }
    // Prosedur ini menambahkan jumlah isi peluru
    public void isiPeluru(int peluru){
        if (peluru > 0) {
            senjata.setPeluru(senjata.getPeluru() + peluru);
            System.out.println("Peluru berhasil ditambah: " + peluru);   
        }
    }
    // Prosedur ini menampilkan sejumlah bunyi tembakan dari senjata
    public void menembak(int jumlah){
        System.out.println("Siap menembak " + jumlah + " kali");
        if (isAdaPeluru()){
            for (int i = jumlah; i > 0; i--){
                if (isAdaPeluru()){
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru() - 1);
                } else {
                    System.out.println("Gagal Tembak, Peluru Habis");
                }
            }
            System.out.println("Peluru sisa: " + senjata.getPeluru());
        } else {
            System.out.println("Peluru Habis");
        }
    }
    // Prosedur ini menampilkan pesan 'Bayonet Terpasang' dengan 
    //    mengatur nilai 'menusuk' adalah True
    public void pasangBayonet(){
        senjata.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
    // Fungsi ini menampilkan pesan apakah senjata berhasil 
    //    menusuk atau tidak
    public String menusuk(){
        if (senjata.isMenusuk()){
            return "Jleb!";
        } else {
            return "Gagal, belum pasang bayonet";
        }
    }
}
