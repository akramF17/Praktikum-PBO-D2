/* 
 *  File      : MLingkaran.java    20/03/2023
 *  Pembuat   : Zikry ALfahri Akram
 *  Deskripsi : Implementasi cara menghitung luas lingkaran
 * 
 */

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        // Tanpa input pengguna
        Lingkaran l = new Lingkaran(10.2);
        System.out.println("Luas lingkaran dengan jejari 10.2 satuan adalah " + l.hitungLuas());

        // Dengan input pengguna
        Scanner scan = new Scanner(System.in);

        // Objek lingkaran dibuat terlebih dahulu lalu input jejarinya
        Lingkaran l2 = new Lingkaran();
        System.out.print("Masukkan jejari lingkaran : ");
        double jejari1 = scan.nextDouble();
        l2.setJejari(jejari1);
        System.out.println("Luas lingkaran dengan jejari " + jejari1 + " satuan adalah " + l2.hitungLuas());

        // Input jejari dibuat terlebih dahulu lalu objeknya
        System.out.print("Masukkan jejari lingkaran : ");
        double jejari2 = scan.nextDouble();
        Lingkaran l3 = new Lingkaran(jejari2);
        System.out.println("Luas lingkaran dengan jejari " + jejari2 + " satuan adalah " + l3.hitungLuas());

        scan.close();
    }
}
