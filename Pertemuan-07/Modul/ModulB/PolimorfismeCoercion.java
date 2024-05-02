/* 
 *  File      : PolimorfismeCoercion.java    02/05/2024
 *  Pembuat   : Zikry Alfahri Akram (24060122120033)
 *  Deskripsi : Kelas untuk mengimplementasikan polimorfisme coercion
 * 
 */

 public class PolimorfismeCoercion {

    // Fungsi ini menghirung nilai kuadrat dari sebuah bilangan
    public static int kuadrat(int bilangan){
        return bilangan * bilangan;
    }

    public static void main(String[] args) {
        // Deklarasi Objek Integer
        Integer bilangan = 10;

        // Objek Integer 'dipaksa' untuk diubah menjadi primitif
        int hasilKuadrat = kuadrat(bilangan);

        // Menampilkan nilai bilangan dan hasil kuadratnya 
        System.out.printf("Hasil kuadrat %d adalah %d", bilangan, hasilKuadrat);
    }
 }