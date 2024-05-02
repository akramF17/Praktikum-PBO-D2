/* 
 *  File      : Manajer.java    02/05/2024
 *  Pembuat   : Zikry Alfahri Akram (24060122120033)
 *  Deskripsi : Kelas yang merepresentasikan objek Manajer,
 *              turunan dari superclass Pegawai
 * 
 */

public class Manajer extends Pegawai {
    // ATRIBUT
    private int tunjangan = 700000;

    // METHOD
    // Konstruktor untuk membuat objek Manajer
    public Manajer (String nama){
        this.setNama(nama);
    }

    // Prosedur ini menampilkan data-data manajer
    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan : " + this.tunjangan);
    }
}
