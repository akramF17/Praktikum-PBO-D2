/* 
 *  File      : WorkSchedule.java    20/03/2023
 *  Pembuat   : Zikry Alfahri Akram (24060122120033)
 *  Deskripsi : Interface yang mendefinisikan kontrak bahwa setiap kelas
 *              yang membuat implementasi dari interface ini harus memiliki
 *              cara untuk menampilkan jadwal
 * 
 */

public interface WorkSchedule {
    // INTERFACE METHOD
     /* Deklarasi fungsi yang digunakan untuk menampilkan jadwal karyawan
      * Class yang mengimplementasikan interface ini harus juga 
      * mengimplementasikan method ini
      */
    public String displaySchedule();
}  