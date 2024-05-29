/**
 *  Nama File  : LambdaMap.java
 *  Penulis    : Zikry Alfahri Akram (24060122120033)
 *  Deskripsi  : Implementasi lambda pada Map, digunakan sebagai
 *               parameter pada method.
 */

import java.util.HashMap;

public class LambdaMap {
     public static void main(String[] args) {
         HashMap<String, String> mahasiswaList = new HashMap<>();
         mahasiswaList.put("24060122130063", "Mail");
         mahasiswaList.put("24060122140110", "Upin");
         mahasiswaList.put("24060122120009", "Devi");
         mahasiswaList.put("24060122120015", "Susanti");
 
         // Lambda digunakan sebagai parameter
         mahasiswaList.forEach((key, value) -> System.out.println(key + "\t| " + value));
     }
 }