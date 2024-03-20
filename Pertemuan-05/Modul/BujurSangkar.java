/* 
 *  File      : BujurSangkar.java    20/03/2023
 *  Pembuat   : Zikry ALfahri Akram
 *  Deskripsi : Kelas yang membuat implementasi metode abstrak pada bangun datar
 * 
 */

public class BujurSangkar extends BangunDatar {
    public double hitungLuas(double sisi){
        luas = sisi*sisi;
        return luas;
    }
    /*
     *  Fungsi diatas adalah hasil implementasi metode abstrak pada kelas abstak 
     *  BangunDatar
     *  Apabila method diatas tidak ada, maka akan terjadi error karena kelas 
     *  BujurSangkar tidak override method abstrak hitungLuas(double) pada kelas
     *  BangunDatar
     */
}
