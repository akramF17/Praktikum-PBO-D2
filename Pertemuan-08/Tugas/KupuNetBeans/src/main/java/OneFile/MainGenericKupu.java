/* 
 * Nama File  : MainGenericKupu.java          Rabu, 08/05/2024
 * Pembuat    : Zikry Alfahri Akram (24060122120033)
 * Deskripsi  : Main class untuk generic kelas kupu
*/

package OneFile;

// Class Kupu : Kelas untuk merepresentasikan Kupu
class Kupu {
    // METHOD
    // Prosedur yang menampilkan gerak kupu
    public void gerak(){}
}

// Class Ulat : Kelas untuk Ulat, turunan dari kelas Kupu
class Ulat extends Kupu {
    // METHOD
    // Prosedur ini menampilkan gerakan ulat
    @Override
    public void gerak(){
        System.out.println("Ulat merayap");
    }
}

// Class Kepompong : Kelas untuk Kepompong, turunan dari kelas Kupu
class Kepompong extends Kupu {
    // METHOD
    // Prosedur ini menampilkan gerakan kepompong
    @Override
    public void gerak(){
        System.out.println("Kepompong diam");
    }
}

// Class KupuDewasa : Kelas untuk KupuDewasa, turunan dari kelas Kupu
class KupuDewasa extends Kupu {
    // METHOD
    // Prosedur ini menampilkan gerakan kupu dewasa
    @Override
    public void gerak(){
        System.out.println("Kupu terbang");
    }
}

// Class Data : Kelas konstruksi generic
//              Dalam file ini, kelas ini digunakan untuk konstruksi generic
//              kelas Kupu dan turunannya
class Data<T> {
    // ATRIBUT
    private T isi;

    // METHOD
    // Fungsi untuk mengembalikan isi dengan tipe data T
    public T getIsi(){
        return this.isi;
    }
    // Prosedur untuk mengganti isi dengan tipe data T
    public void setIsi(T x){
        this.isi = x;
    }
}

// Class Main : Kelas untuk mengimplementasikan generic kelas Kupu
class MainGenericKupu {
    public static void main(String[] args) {
        // Kamus
        Ulat K; 
        Data<Kupu> anu;

        // Algoritma
        K = new Ulat();
        anu = new Data<>();
        anu.setIsi(K);
        anu.getIsi().gerak();
        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}
