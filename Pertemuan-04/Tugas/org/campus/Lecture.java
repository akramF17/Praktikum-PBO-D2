// File      : Lecture.java          13/03/2024
// Penulis   : Zikry Alfahri Akram
// Deskripsi : Class Lecture turunan dari class Person yang merupakan seorang dosen dengan nama, umur, alamat, dan NIP

package org.campus;

import org.person.Person;
import java.util.List;
import java.util.ArrayList;

public class Lecture extends Person {
    // ATRIBUT
    private String name;
    private int age;
    private String address;
    private int employeeID;
    private List<Course> coursesTaught;

    // KONSTRUKTOR
    // Membuat objek Lecture dengan inisialisasi nilai nama, umur, alamat, dan ID
    public Lecture(String name, int age, String address, int employeeID) {
        super(name, age, address);
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    // Overload
    // Membuat objek Lecture dengan inisialisasi nilai nama, umur dan alamat
    // Bila Lecture belum memiliki ID
    public Lecture(String name, int age, String address) {
        super(name, age, address);
        this.coursesTaught = new ArrayList<>();
    }

    // METHOD
    // Getter/Selektor
    // Fungsi Selektor untuk mendapatkan nilai atribut nama dosen
    public String getName(){
        return this.name;
    }

    // Fungsi Selektor untuk mendapatkan nilai atribut umur dosen
    public int getAge(){
        return this.age;
    }

    // Fungsi Selektor untuk mendapatkan nilai atribut alamat dosen
    public String getAddress(){
        return this.address;
    }

    // Fungsi Selektor untuk mendapatkan nilai atribut ID dosen
    public int getEmployeeID(){
        return this.employeeID;
    }

    // Setter/Mutator
    // Prosedur untuk mengeset nilai atribut nama dosen dengan nilai yang baru
    public void setName(String name){
        this.name = name;
    }

    // Prosedur untuk mengeset nilai atribut umur dosen dengan nilai yang baru
    public void setAge(int age){
        this.age = age;
    }

    // Prosedur untuk mengeset nilai atribut alamat dosen dengan nilai yang baru
    public void setAddress(String address){
        this.address = address;
    }

    // Prosedur untuk mengeset nilai atribut ID dosen dengan nilai yang baru
    public void setEmployeeID(int employeeID){
        this.employeeID = employeeID;
    }

    // Fungsi/Prosedur Lainnya
    // Prosedur untuk menampilkan detail dari Lecture, yaitu nama, umur, alamat, dan ID Employee
    @Override
    public void getDetails() {
        super.getDetails();
        System.out.printf("Employee ID: %d\n", this.getEmployeeID());
    }    

    // Prosedur untuk menambah sebuah course
    public void teachCourse(Course course) {
        if (!(this.coursesTaught).contains(course)){
            (this.coursesTaught).add(course);
            course.setLecture(this);
        }
    }

    // Prosedur untuk membatalkan sebuah course
    public void cancelTeachCourse(Course course){
        if ((this.coursesTaught).contains(course)){
            (this.coursesTaught).remove(course);
            course.setLecture(null);
        }
    }

    // Prosedur untuk menampilkan seluruh Course yang diampu oleh Lecture
    public void viewTaughtCourses() {
        int i;
        int size;
        size = (this.coursesTaught).size();
        if (size != 0){
            for (i = 0; i < size; i ++){
                System.out.printf("Mahasiswa %d:\n", i+1);
                ((this.coursesTaught).get(i)).getDetails();
            }
        }
    }
}
