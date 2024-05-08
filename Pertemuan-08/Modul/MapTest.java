/* 
 * Nama File  : MapTest.java          Rabu, 08/05/2024
 * Pembuat    : Zikry Alfahri Akram (24060122120033)
 * Deskripsi  : Program yang menggunakan Generic untuk pasangan
 *              Kunci-Nilai
*/

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        // Kunci -> integer, nilai -> string
        Map<Integer, String> map = new HashMap<Integer, String>();

        // Menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");
        map.put(3, "tiga");

        // Mengambil elemen pertama
        System.out.println(map.get(1));

        // Menghapus elemen dengan nilai key 2
        map.remove(2);
        
        // Mengambil keseluruhan kunci sebagai objek collection Set
        Set<Integer> keys = map.keySet();

        // Bagaimana iterasi untuk mengambil keseluruhan nilai dari kunci?
        // 1. Gunakan iterasi untuk setiap kunci pada key (keySet)
        // 2. Mengambil elemen menggunakan kunci untuk setiap iterasi
        for (Integer key : keys){
            System.out.println(key + " : " + map.get(key));
        }
    }
}
