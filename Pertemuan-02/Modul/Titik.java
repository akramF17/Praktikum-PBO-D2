// File      : Titik.java          28/02/2024
// Penulis   : Zikry Alfahri Akram
// Deskripsi : Class Titik yang merupakan sebuah titik dengan absis dan ordinat

public class Titik {
    // ATRIBUT
    private double absis;
    private double ordinat;
    // Banyak Objek Titik
    // private static int counterTitik;

    // KONSTRUKTOR
    // With Argument
    // Membuat objek titik dengan inisialisasi nilai absis dan ordinat
    public Titik(double absis, double ordinat){
        // counterTitik++;
        this.absis = absis;
        this.ordinat = ordinat;
    }

    // No Argument
    // Membuat objek titik dengan inisialisasi absis 0 dan ordinat 0
    public Titik(){
        // counterTitik++;
        this(0,0);
    }

    // METHOD
    // Getter/Selektor
    // Fungsi selektor untuk mendapatkan nilai atribut absis
    public double getAbsis(){
        return this.absis;
    }

    // Fungsi selektor untuk mendapatkan nilai atribut absis
    public double getOrdinat(){
        return this.ordinat;
    }

    // Setter/Mutator
    // Prosedur untuk mengeset nilai atribut absis dengan nilai yang baru
    public void setAbsis(double absis){
        this.absis = absis;
    }

    // Prosedur untuk mengeset nilai atribut ordinat dengan nilai yang baru
    public void setOrdinat(double ordinat){
        this.ordinat = ordinat;
    }

    // Operator/Fungsi lain
    // Fungsi yang mengembalikan jumlah titik
    // static int getCounterTitik(){
    //     return counterTitik;
    // }

    // Fungsi untuk menghitung jarak titik ke titik pusat (0, 0)
    public double getJarakPusat(){
        return Math.sqrt(Math.pow(this.absis, 2) + Math.pow(this.ordinat, 2));
    }

    // Prosedur untuk melakukan pencerminan titik terhadap sumbu X
    public void refleksiX(){
        this.ordinat = -this.ordinat;
    }

    // Prosedur untuk melakukan pencerminan titik terhadap sumbu Y
    public void refleksiY(){
        this.absis = -this.absis;
    }

    // Fungsi untuk menghasilkan titik baru yang merupakan hasil pencerminan terhadap sumbu X
    public Titik getRefleksiX(){
        return new Titik(this.absis, -this.ordinat);
    }

    // Fungsi untuk menghasilkan titik baru yang merupakan hasil pencerminan terhadap sumbu Y
    public Titik getRefleksiY(){
        return new Titik(-this.absis, this.ordinat);
    }
}
