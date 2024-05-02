/* 
 *  File      : Programmer.java    02/05/2024
 *  Pembuat   : Zikry Alfahri Akram (24060122120033)
 *  Deskripsi : Kelas yang merepresentasikan objek Programmer,
 *              turunan dari superclass Pegawai
 * 
 */

public class Programmer extends Pegawai {
    // ATRIBUT
    private int bonus = 450000;

    // METHOD
    // Konstruktor untuk membuat objek Programmer
    public Programmer (String nama){
        this.setNama(nama);
    }

    // Prosedur ini menampilkan data-data programmer
    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus : " + this.bonus);
    }
}
