/**
 *  Nama File  : LambdaList.java
 *  Penulis    : Zikry Alfahri Akram (24060122120033)
 *  Deskripsi  : Implementasi lambda pada List, digunakan sebagai
 *               parameter pada method.
 */

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        // Lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
