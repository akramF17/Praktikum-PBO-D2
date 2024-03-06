/*
 * File         : ExceptionOnArray.java
 * Deskripsi    : Program penggunaan eksepsi menggunakan library java
 * Pembuat      : Zikry Alfahri Akram (24060122120033)
 * Tanggal      : Rabu, 6 Maret 2024
 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        // Instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }
        catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }
        finally{
            System.out.println("Clean up code...");
        }
    }
}
