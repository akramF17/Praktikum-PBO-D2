/* 
 * Nama File  : ArrayListTest.java          Rabu, 08/05/2024
 * Pembuat    : Zikry Alfahri Akram (24060122120033)
 * Deskripsi  : Program penggunaan objek ArrayLIst sebagai
 *              Collection class
*/

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // Inisialisasi ArrayList yang hanya dapat berisi objek String
        ArrayList<String> strings = new ArrayList<String>();

        // Menambah elemen
        strings.add("Praktikum"); 
        // strings = ["Praktikum"]
        strings.add("Collection"); 
        // strings = ["Praktikum", "Collection"]
        strings.add("dan Generics");
        // strings = ["Praktikum", "Collection", "dan Generics"]

        // Menghapus elemen
        strings.remove("Praktikum");
        // strings = ["Collection", "dan Generics"]

        // Iterasi pada keseluruhan ArrayList
        for (String s : strings){
            System.out.print(s + " "); // Output : Collection dan Generics
        }
    }
}