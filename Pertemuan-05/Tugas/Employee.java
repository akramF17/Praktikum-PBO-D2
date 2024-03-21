/* 
 *  File      : Employee.java    20/03/2023
 *  Pembuat   : Zikry Alfahri Akram (24060122120033)
 *  Deskripsi : Kelas abstrak, berisi abstraksi Employee
 * 
 */

public abstract class Employee {
    // ATRIBUT
    protected int id;
    protected String name;
  
    // KONSTRUKTOR
    // Membuat objek Employee dengan atribut id dan nama
    public Employee(int id, String name) {
      this.id = id;
      this.name = name;
    }

    // ABSTRACT METHOD
    // Setiap subclass dari Employee harus mengimplementasikan method-method ini
    // Deklarasi fungsi yang digunakan untuk menghitung gaji karyawan
    public abstract double calculateSalary();

    // TAMBAHAN
    // Deklarasi prosedur yang menampilkan detail informasi karyawan
    public abstract void printInfo();
}
  