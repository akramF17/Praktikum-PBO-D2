/* 
 *  File      : Pegawai.java    02/05/2024
 *  Pembuat   : Zikry Alfahri Akram (24060122120033)
 *  Deskripsi : Kelas yang merepresentasikan objek Pegawai
 * 
 */

public class Pegawai {
    // ATRIBUT
    private String nama;
    private int gajiPokok = 5000000;

    // METHOD
    // Prosedur ini mengganti nama pegawai dengan nama yang baru
    public void setNama(String nama){
        this.nama = nama;
    }
    
    // Prosedur ini menampilkan data-data pegawai, yaitu nama dan gaji pokok
    public void tampilData(){
        System.out.println("Nama : " + this.nama + ", Gaji pokok : " + this.gajiPokok);
    }
}
