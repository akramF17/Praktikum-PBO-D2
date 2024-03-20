/* 
 *  File      : BangunDatar.java    20/03/2023
 *  Pembuat   : Zikry ALfahri Akram
 *  Deskripsi : Kelas abstrak, berisi abstraksi bangun datar
 * 
 */

public abstract class BangunDatar {
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}
