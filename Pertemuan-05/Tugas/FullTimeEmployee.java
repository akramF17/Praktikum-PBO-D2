/* 
 *  File      : FullTimeEmployee.java    20/03/2023
 *  Pembuat   : Zikry Alfahri Akram (24060122120033)
 *  Deskripsi : Kelas turunan Employee yang mewakili karyawan full-time dan implementasi 
 *              metode untuk menampilkan jadwal kerja dan menghitung gaji
 * 
 */

public class FullTimeEmployee extends Employee implements WorkSchedule {
    // ATRIBUT
    private double monthlySalary;
  
    // KONSTRUKTOR
    // Membuat objek FullTimeEmployee dengan atribut id, nama, dan gaji bulanan
    public FullTimeEmployee(int id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    // METHOD
    // Fungsi untuk menghitung gaji karyawan full-time
    // Fungsi ini adalah implementasi dari method abstract pada superclass Employee
    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
    
    // Fungsi untuk mengembalikan jadwal karyawan full-time
    // Fungsi ini adalah implementasi dari method pada interface WorkSchedule
    @Override
    public String displaySchedule(){
        return "Monday to Friday, 9:00 AM - 5:00 PM";
    }
    
    // Prosedur ini digunakan untuk menampilkan detail info dari karyawan full-time
    // Prosedur ini adalah implementasi dari method abstract pada superclass Employee
    @Override
    public void printInfo(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Monthly Salary: Rp" + this.calculateSalary());
        System.out.println("Salary: " + this.calculateSalary());
        System.out.println("Full-Time Employee Schedule: " + this.displaySchedule());
    }
}
