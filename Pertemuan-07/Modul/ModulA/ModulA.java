public class ModulA{
    public static void main(String[] args) {
        // Nomor 1
        int output1 = 'a';
        System.out.println(output1);
        // Output : 97
        // Berhasil dieksekusi
        // Contoh coercion karena karakter 'a' akan diubah menjadi nilai ASCII-nya
        // (97) lalu disimpan sebagai tipe data integer

        // Nomor 2
        // double x = 15.5;
        // int output2 = x;
        // System.out.println(output2);
        // Output : ERROR
        // Gagal dieksekusi
        // Contoh casting dimana nilai x ingin diubah tipe data dari double ke int.
        // Tetapi, error karena ketika x diubah menjadi integer maka dia akan kehilangan 
        // presisi (angka di belakang koma).
        // Untuk mengatasi hal ini, konversi tipe data x harus dilakukan secara eksplisit.
        // Contoh: int output1 = (int) x
        // Nilai x akan dibulatkan ke bawah apapun nilainya

        // Nomor 3
        int y = 25;
        double output3 = y;
        System.out.println(output3);
        // Output : 25.0
        // Berhasil dieksekusi
        // Contoh coercion dimana nilai y diubah menjadi double tanpa kehilangan prseisi, 
        // karena sedari awal nilai integer tidak mempunyai presisi (angka di belakang koma).

        // Nomor 4
        int z = 78;
        char output4 = (char) z;
        System.out.println(output4);
        // Output : N
        // Berhasil dieksekusi
        // Contoh casting dimana nilai z = 78 akan diubah menjadi karakter yang sesuai dengan
        // kode ASCII 78 yaitu karakter 'N'

        // Nomor 5
        char a = 'a';
        double output5 = a;
        System.out.println(output5);
        // Output : 97.0
        // Berhasil dieksekusi
        // Contoh coercion dimana nilai a = 'a' diubah menjadi nilai ASCII-nya
        // (97) lalu disimpan sebagai tipe data double (sama seperti nomor 3).
    }
}