// File      : Titik.java          21/02/2024
// Penulis   : Zikry Alfahri Akram
// Deskripsi : Class Titik yang merupakan sebuah titik dengan absis dan ordinat

public class Titik {
    // ATRIBUT
    double absis;
    double ordinat;
    // Banyak Objek Titik
    static int counterTitik;

    // METHOD
    // Konstruktor
    // No Argument
    Titik(){
        counterTitik++;
        absis = 0;
        ordinat = 0;
    }

    // With Argument
    Titik(double absis, double ordinat){
        counterTitik++;
        this.absis = absis;
        this.ordinat = ordinat;
    }

    // Setter/Mutator
    // Prosedur untuk mengatur nilai absis
    void setAbsis(double a){
        absis = a;
    }

    // Prosedur untuk mengatur nilai ordinat
    void setOrdinat(double o){
        ordinat = o;
    }

    // Getter/Selektor
    // Fungsi yang mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    // Fungsi yang mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    // Fungsi lain
    // Fungsi yang mengembalikan jumlah titik
    static int getCounterTitik(){
        return counterTitik;
    }
}
