/* 
 * Nama File  : BangunDatarGeneric.java          Rabu, 08/05/2024
 * Pembuat    : Zikry Alfahri Akram (24060122120033)
 * Deskripsi  : Kelas konstruksi generic untuk BangunDatar
*/

public class BangunDatarGeneric <T extends BangunDatar> {
    // ATRIBUT
    private T bangunDatar;

    // Method
    // Getter: Fungsi untuk mengembalikan objek T
    public T get(){
        return bangunDatar;
    }
    // Setter: Prosedur untuk mengatur tipe bangunDatar dengan
    //         tipe bangun datar T yang baru
    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }
    // Fungsi ini mengembalikan keliling dari objek dengan tipe data T
    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }

    /* Cobalah! 
       Gantilah ‘T’ (dan segala T) pada BangunDatarGeneric.java diganti 
       dengan karakter yang lain seperti, T1,T2,T1234. 
       Simpulkan apa yang anda lakukan ! */

    /* Apabila setiap T diganti menjadi T1, T2, atau lain sebagainya 
       maka itu disebut parameterisasi generik dimana pengguna mengganti 
       tipe parameter generik menjadi sesuatu yang lain tetapi masih 
       dalam tipe BangunDatar.*/ 
    /* Catatan: Apabila T diganti maka semua parameter T juga harus 
                diganti. Jika tidak, maka akan terjadi error */
}
