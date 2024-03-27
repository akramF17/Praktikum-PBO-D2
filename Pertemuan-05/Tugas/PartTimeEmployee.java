/* 
 *  File      : PartTimeEmployee.java    20/03/2023
 *  Pembuat   : Zikry Alfahri Akram (24060122120033)
 *  Deskripsi : Kelas turunan Employee yang mewakili karyawan part-time dan implementasi 
 *              metode untuk menampilkan jadwal kerja dan menghitung gaji
 * 
 */

public class PartTimeEmployee extends Employee implements WorkSchedule {
    // ATRIBUT
    private double hourlyRate;
    private int hoursWorked;
  
    // KONSTRUKTOR
    // Membuat objek PartTimeEmployee dengan atribut id, nama, tarif per jam, dan jam kerja
    public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // METHOD
    // Fungsi untuk menghitung gaji karyawan part-time
    // Fungsi ini adalah implementasi dari method abstract pada superclass Employee
    @Override
    public double calculateSalary(){
        return hourlyRate * hoursWorked;
    }

    // Fungsi untuk mengembalikan jadwal karyawan part-time
    // Fungsi ini adalah implementasi dari method pada interface WorkSchedule
    @Override
    public String displaySchedule(){
        return "Flexible hours";
    }

    // Prosedur ini digunakan untuk menampilkan detail info dari karyawan part-time
    // Prosedur ini adalah implementasi dari method abstract pada superclass Employee
    @Override
    public void printInfo(){
        System.out.println("Part-Time Employee Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Hourly Rate: Rp" + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Salary: " + this.calculateSalary());
        System.out.println("Part-Time Employee Schedule: " + this.displaySchedule());
    }
}
