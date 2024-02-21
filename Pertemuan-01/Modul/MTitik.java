// File      : MTitik.java          21/02/2024
// Penulis   : Zikry Alfahri Akram
// Deskripsi : Class yang berisi Main dari Titik

public class MTitik {
    public static void main(String[] args){
        // Reference
        Titik t1; // Titik 1
        Titik t2; // Titik 2
        Titik t3; // Titik 3

        // Instansiasi Titik 1 dengan Konstruktor No Argument
        t1 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);

        // Instansiasi Titik 2 dengan Konstruktor No Argument
        t2 = new Titik();
        t2.setAbsis(3);
        t2.setOrdinat(4);

        int counterTitik = Titik.getCounterTitik();

        // Instansiasi Titik 3 dengan Konstruktor With Argument (Overload)
        t3 = new Titik(5,6);

        // Output
        System.out.printf("Jumlah objek titik : %d\n", counterTitik);
        System.out.printf("t1(%.2f, %.2f)\n", t1.getAbsis(), t1.getOrdinat());
        System.out.printf("t2(%.2f, %.2f)\n", t2.getAbsis(), t2.getOrdinat());
        System.out.printf("t3(%.2f, %.2f)\n", t3.getAbsis(), t3.getOrdinat());
    }
}
