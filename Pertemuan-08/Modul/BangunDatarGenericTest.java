/* 
 * Nama File  : BangunDatarGenericTest.java          Rabu, 08/05/2024
 * Pembuat    : Zikry Alfahri Akram (24060122120033)
 * Deskripsi  : Main class untuk generic bangun datar
*/

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        // Inisialisasi objek bangun datar
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);

        // Output
        System.out.println("Keliling lingkaran : " + bdg.hitungKeliling());
        System.out.println("Tipe generic : " + bdg.get().getClass().getName());
    }
}
