/**
 *  Nama File  : DiskonLambda.java
 *  Penulis    : Zikry Alfahri Akram (24060122120033)
 *  Deskripsi  : Ekspresi lambda dasar, digunakan untuk menghitung diskon.
 */

interface IDiskon {
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {
        // Tanpa Lambda
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga){
                return harga - (harga * 0.3);
            }
        };

        // Dengan Lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

        // Dengan Lambda dan Block Statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        // Menampilkan hasil
        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));

        /* Perbedaan implementasi diskonLebaran dan diskonBiasa
         * - diskonLebaran menggunakan ekspresi yang singkat dan langsung, biasa
         *   disebut single-line expression, dimana hanya terdapat satu pernyataan
         *   dalam tubuh lambda dan langsung menjadi nilai return dari lambda.
         *   Pernyataan 'return' dilakukan secara implisit.
         * - diskonBiasa menggunakan ekspresi yang lebih panjang, biasa disebut block
         *   of code, dimana terdapat beberapa peryataan dalam tubuh lambda sehingga
         *   pernyataan 'return' harus dilakukan secara eksplisit.
         */
    }
}