// File      : MTitik.java          28/02/2024
// Penulis   : Zikry Alfahri Akram
// Deskripsi : Class yang berisi Main dari Titik

public class MTitik {
    public static void main(String[] args){
        // Reference
        Titik t1; // Titik 1 untuk konstruktor no argument
        Titik t2; // Titik 2 untuk konstruktor with argument
        Titik t3; // Titik 3 untuk untuk fungsi jarak pusat
        Titik t4; // Titik 4 untuk prosedur refleksi sumbu X
        Titik t5; // Titik 5 untuk prosedur refleksi sumbu Y
        Titik t6; // Titik 6 untuk fungsi refleksi sumbu X
        Titik t7; // Titik 7 untuk fungsi refleksi sumbu Y

        // Instansiasi Titik 1 dengan Konstruktor No Argument
        t1 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);

        // Instansiasi Titik 3 dengan Konstruktor With Argument (Overload)
        t2 = new Titik(3, 4);
        
        System.out.printf("Titik t1(%.2f, %.2f)\n", t1.getAbsis(), t1.getOrdinat());
        System.out.printf("Titik t2(%.2f, %.2f)\n", t2.getAbsis(), t2.getOrdinat());
        

        // Fungsi jarak pusat pada titik 3
        t3 = new Titik(9, 12);

        System.out.printf("Titik t3(%.2f, %.2f)\n", t3.getAbsis(), t3.getOrdinat());
        System.out.printf("Jarak titik t3 dari titik pusat: %.2f\n", t3.getJarakPusat());

        // Prosedur refleksi X pada titik 4
        t4 = new Titik(6,6);
        System.out.printf("Before: Titik t4(%.2f, %.2f)\n", t4.getAbsis(), t4.getOrdinat());

        t4.refleksiX();
        System.out.printf("After: Titik t4(%.2f, %.2f)\n", t4.getAbsis(), t4.getOrdinat());

        // Prosedur refleksi X pada titik 5
        t5 = new Titik(10,6);
        System.out.printf("Before: Titik t5(%.2f, %.2f)\n", t5.getAbsis(), t5.getOrdinat());

        t5.refleksiY();
        System.out.printf("After: Titik t5(%.2f, %.2f)\n", t5.getAbsis(), t5.getOrdinat());

        // Inisiasi titik 6 dengan refleksi titik 1 terhadap sumbu X
        t6 = t1.getRefleksiX();
        System.out.printf("Titik t1(%.2f, %.2f)\n", t1.getAbsis(), t1.getOrdinat());
        System.out.printf("Titik t6(%.2f, %.2f)\n", t6.getAbsis(), t6.getOrdinat());


        // Inisiasi titik 6 dengan refleksi titik 2 terhadap sumbu Y
        t7 = t2.getRefleksiY();
        System.out.printf("Titik t2(%.2f, %.2f)\n", t2.getAbsis(), t2.getOrdinat());
        System.out.printf("Titik t7(%.2f, %.2f)\n", t7.getAbsis(), t7.getOrdinat());

        // int counterTitik = Titik.getCounterTitik();
        // System.out.printf("Jumlah objek titik : %d\n", counterTitik);
    }
}
