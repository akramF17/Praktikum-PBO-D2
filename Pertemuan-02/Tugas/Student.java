// File      : Student.java          28/02/2024
// Penulis   : Zikry Alfahri Akram
// Deskripsi : Class Student yang merupakan seorang mahasiswa dengan nama, umur, alamat, dan NIM


import java.util.List;
import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private String address;
    private int studentID;
    private List<Course> coursesEnrolled;

    // Konstruktor
    // Membuat objek Student dengan inisialisasi nilai nama, umur, alamat, dan ID
    public Student(String name, int age, String address, int studentID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    // Getter/Selektor
    // Fungsi Selektor untuk mendapatkan nilai atribut nama Student
    public String getName(){
        return this.name;
    }

    // Fungsi Selektor untuk mendapatkan nilai atribut umur Student
    public int getAge(){
        return this.age;
    }

    // Fungsi Selektor untuk mendapatkan nilai atribut alamat Student
    public String getAddress(){
        return this.address;
    }

    // Fungsi Selektor untuk mendapatkan nilai atribut ID Student
    public int getStudentID(){
        return this.studentID;
    }

    // Setter/Mutator
    // Prosedur untuk mengeset nilai atribut nama Student dengan nilai yang baru
    public void setName(String name){
        this.name = name;
    }

    // Prosedur untuk mengeset nilai atribut umur Student dengan nilai yang baru
    public void setAge(int age){
        this.age = age;
    }

    // Prosedur untuk mengeset nilai atribut alamat Student dengan nilai yang baru
    public void setAddress(String address){
        this.address = address;
    }

    // Prosedur untuk mengeset nilai atribut ID Student dengan nilai yang baru
    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    // Prosedur untuk menampilkan detail Student, yaitu nama, umur, alamat, dan ID Student
    public void getDetails() {
        System.out.printf("Nama       : %s\n", this.getName());
        System.out.printf("Umur       : %d\n", this.getAge());
        System.out.printf("Alamat     : %s\n", this.getAddress());
        System.out.printf("Student ID : %d\n", this.getStudentID());
    }

    // Prosedur untuk menambah sebuah course
    public void enrollInCourse(Course course) {
        if (!(this.coursesEnrolled).contains(course)){
            (this.coursesEnrolled).add(course);
            course.addStudent(this);
        }
    }

    // Prosedur untuk mengurangi sebuah course
    public void unenrolledCourse(Course course){
        if ((this.coursesEnrolled).contains(course)){
            (this.coursesEnrolled).remove(course);
            course.removeStudent(this);
        }
    }

    // Prosedur untuk menampilkan seluruh course yang diambil Student
    public void viewEnrolledCourses() {
        int i;
        int size;
        size = (this.coursesEnrolled).size();
        if (size != 0){
            for (i = 0; i < size; i ++){
                System.out.printf("Mata kuliah %d:\n", i+1);
                ((this.coursesEnrolled).get(i)).getDetails();
            }
        }
    }
}
