/**
 *  Nama File   : MysqlUtility.java                05/06/2024
 *  Penulis     : Zikry Alfahri Akram (24060122120033)
 *  Deskripsi   : Kelas ini digunakan untuk mengelola koneksi 
 *                dengan basis data yang digunakan
 */

package jdbc.utilities;

import java.sql.*;

public class MysqlUtility {
    private static Connection koneksi;
    
    public static Connection getConnection(){
        if (koneksi == null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                // Sesuaikan host, port, nama database
                String url = "jdbc:mysql://localhost:3306/jdbc_mhs";
                // Sesuaikan username dan password
                String user = "root";
                String password = "";
                koneksi = DriverManager.getConnection(url, user, password); // ("jdbc:mysql://localhost:3306/pbo", "root", "")
                if (koneksi != null){
                    System.out.println("Koneksi berhasil");
                }
            } catch (ClassNotFoundException cne){
                System.out.println("Gagal load driver : " + cne.getMessage());
            } catch (SQLException sqle){
                    System.out.println("Koneksi berhasil");
            }
        }
        return koneksi;
    }
}
