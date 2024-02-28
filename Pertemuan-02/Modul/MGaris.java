// File      : MGaris.java          28/02/2024
// Penulis   : Zikry Alfahri Akram
// Deskripsi : Class yang berisi Main dari Garis

public class MGaris {
    public static void main(String[] args){
        // Reference
        Garis g1; // Garis 1 untuk konstruktor no argument dan panjang garis
        Garis g2; // Garis 2 untuk konstruktor with argument dan gradien garis
        Garis g3; // Garis 3 untuk fungsi refleksi Y

        // Instansiasi Titik 1 dengan Konstruktor No Argument
        g1 = new Garis();
        g1.setTitikAwal(new Titik(1, 1));
        g1.setTitikAkhir(new Titik(4, 5));

        // Instansiasi Titik 3 dengan Konstruktor With Argument (Overload)
        g2 = new Garis(new Titik(-1, 2), new Titik(-3, 6));
        
        System.out.printf("Titik Awal Garis g1(%.2f, %.2f)\n", (g1.getTitikAwal()).getAbsis(), (g1.getTitikAwal()).getOrdinat());
        System.out.printf("Titik Akhir Garis g1(%.2f, %.2f)\n", (g1.getTitikAkhir()).getAbsis(), (g1.getTitikAkhir()).getOrdinat());
        System.out.printf("Titik Awal Garis g2(%.2f, %.2f)\n", (g2.getTitikAwal()).getAbsis(), (g2.getTitikAwal()).getOrdinat());
        System.out.printf("Titik Akhir Garis g2(%.2f, %.2f)\n", (g2.getTitikAkhir()).getAbsis(), (g2.getTitikAkhir()).getOrdinat());
        
        // Panjang garis g1
        System.out.printf("Panjang garis g1: %.2f\n", g1.getPanjang());

        // Gradien garis g2
        System.out.printf("Gradien garis g2: %.2f\n", g2.getGradien());

        // Garis g3 sebagai refleksi g1 terhadap sumbu Y
        g3 = g1.getRefleksiY();
        System.out.printf("Titik Awal Garis g3(%.2f, %.2f)\n", (g3.getTitikAwal()).getAbsis(), (g3.getTitikAwal()).getOrdinat());
        System.out.printf("Titik Akhir Garis g3(%.2f, %.2f)\n", (g3.getTitikAkhir()).getAbsis(), (g3.getTitikAkhir()).getOrdinat());

        // Boolean
        System.out.printf("Apakah garis g1 tegak lurus dengan garis G? %b\n", g1.isTegakLurus(g2));
    }
}
