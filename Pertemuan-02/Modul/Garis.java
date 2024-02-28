// File      : Garis.java          28/02/2024
// Penulis   : Zikry Alfahri Akram
// Deskripsi : Class Garis yang merupakan sebuah garis dengan titik awal dan titik akhir

public class Garis {
    // ATRIBUT
    private Titik titikAwal;
    private Titik titikAkhir;

    // KONSTRUKTOR
    // Membuat objek titik dengan inisialisasi nilai titik awal dan titik akhir
    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    // Membuat objek titik dengan inisialisasi titik awal (0, 0) dan titik akhir (1, 1)
    public Garis(){
        this(new Titik(0, 0), new Titik(1, 1));
    }

    // METHOD
    // Getter/Selektor
    // Fungsi selektor untuk mendapatkan nilai atribut titik awal
    public Titik getTitikAwal(){
        return this.titikAwal;
    }

    // Fungsi selektor untuk mendapatkan nilai atribut titik akhir
    public Titik getTitikAkhir(){
        return this.titikAkhir;
    }

    // Setter/Mutator
    // Prosedur untuk mengeset nilai atribut titik awal dengan nilai yang baru
    public void setTitikAwal(Titik titikAwal){
        this.titikAwal = titikAwal;
    }

    // Prosedur untuk mengeset nilai atribut titik akhir dengan nilai yang baru
    public void setTitikAkhir(Titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }

    // Operator/Fungsi Lain
    // Fungsi untuk menghitung panjang garis
    public double getPanjang(){
        return Math.sqrt(Math.pow(titikAwal.getAbsis() - titikAkhir.getAbsis(), 2) + Math.pow(titikAwal.getOrdinat() - titikAkhir.getOrdinat(), 2));
    }

    // Fungsi untuk menghitung gradien garis
    public double getGradien(){
        return (titikAwal.getOrdinat() - titikAkhir.getOrdinat())/(titikAwal.getAbsis() - titikAkhir.getAbsis());
    }

    // Fungsi untuk menghasilkan garis baru yang merupakan hasil pencerminan dengan sumbu Y
    public Garis getRefleksiY(){
        return new Garis((this.titikAwal).getRefleksiY(), (this.titikAkhir).getRefleksiY());
    }

    // Fungsi untuk mengecek apakah garis tegak lurus dengan garis G
    public boolean isTegakLurus(Garis G){
        if (this.getGradien() * G.getGradien() == -1) {
            return true;
        }
        else {
            return false;
        }
    }    
}
