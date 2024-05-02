/* 
 *  File      : PegawaiDanGaji.java    02/05/2024
 *  Pembuat   : Zikry Alfahri Akram (24060122120033)
 *  Deskripsi : Kelas main yang merepresentasikan hubungan antara pegawai
 *              dan gaji
 * 
 */

public class PegawaiDanGaji {
    public static void main(String[] args) {
        // Deklarasi objek pegawai
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Pegawai pegawai3 = new Manajer("Argo");

        // Deklarasi objek daftar gaji
        Payroll payroll = new Payroll();

        // Menampilkan daftar gaji pergawai
        payroll.cetakGaji(pegawai1);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);
    }
}
