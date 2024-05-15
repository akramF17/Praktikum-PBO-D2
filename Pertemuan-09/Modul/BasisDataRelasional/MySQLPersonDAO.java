/*
 *  File        : MySQLPersonDAO.java            15/05/2024
 *  Nama        : Zikry Alfahri Akram (2060122120033)
 *  Deskripsi   : Implementasi PersonDAO untuk MySQL
 */

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO{
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        // Membuat koneksi, nama db, user, password menyesuaikan
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbo", "root", "");
        // Kerjakan MySQL query
        String query = "INSERT INTO person(name) VALUES ('" + name + "')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        // Tutup koneksi database
        con.close();
    }
}
