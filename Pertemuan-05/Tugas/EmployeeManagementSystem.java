/* 
 *  File      : EmployeeManagementSystem.java    20/03/2023
 *  Pembuat   : Zikry Alfahri Akram (24060122120033)
 *  Deskripsi : Driver class untuk kelas abstrak Employee dan turunannya serta interface WorkSchedule
 * 
 */

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // REFERENCE & INSTANSIASI
        // Membuat objek Andi dengan tipe data Employee menggunakan konstruktor FullTimeEmployee
        Employee Andi = new FullTimeEmployee(1211, "Andi Ahmad Zulfikar", 6000000.0);
        // Membuat objek Melati dengan tipe data Employee menggunakan konstruktor PartTimeEmployee
        Employee Melati = new PartTimeEmployee(2030, "Putri Melati", 20000.0, 8);

        // DISPLAY
        // Menampilkan informasi karyawan full-time Andi
        Andi.printInfo();

        // Membuat baris baru kosong
        System.out.println();

        // Menampilkan informasi karyawan part-time Melati
        Melati.printInfo();
    }
}  