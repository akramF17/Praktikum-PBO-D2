// File      : Course.java          13/03/2024
// Penulis   : Zikry Alfahri Akram
// Deskripsi : Class Course yang merupakan sebuah mata kuliah dengan nama, kode, dan dosen pengampu

package org.campus;

import java.util.List;
import java.util.ArrayList;

public class Course {
    // ATRIBUT
    private String courseCode;
    private String courseName;
    private Lecture lecture;
    private List<Student> studentsEnrolled;

    // KONSTRUKTOR
    // Membuat objek Course dengan inisialisasi nilai kode, nama, dan dosen pengampu Course
    public Course(String courseCode, String courseName, Lecture lecture) {
        this.courseCode = courseCode;
        this. courseName = courseName;
        this.lecture = lecture;
        this.studentsEnrolled = new ArrayList<>();
    }

    // Overload
    // Membuat objek Course dengan inisialisasi nilai kode dan nama Course
    // Bila dosen pengampu mata kuliah masih belum ditentukan
    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this. courseName = courseName;
        this.studentsEnrolled = new ArrayList<>();
    }

    // METHOD
    // Getter/Selektor
    // Fungsi Selektor untuk mendapatkan nilai atribut kode Course
    public String getCourseCode(){
        return this.courseCode;
    }

    // Fungsi Selektor untuk mendapatkan nilai atribut nama Course
    public String getCourseName(){
        return this.courseName;
    }

    // Fungsi Selektor untuk mendapatkan nilai atribut dosen pengampu (nama)
    public String getLecture(){
        return (this.lecture).getName();
    }

    // Setter/Mutator
    // Prosedur untuk mengeset nilai atribut kode Course dengan nilai yang baru
    public void setCourseCode(String courseCode){
        this.courseCode = courseCode;
    }

    // Prosedur untuk mengeset nilai atribut nama Course dengan nilai yang baru
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    // Prosedur untuk mengeset nilai atribut dosen pengampu dengan nilai yang baru
    public void setLecture(Lecture lecture){
        if (this.lecture != lecture){
            (this.lecture).cancelTeachCourse(this);
            this.lecture = lecture;
        }
    }

    // Fungsi/Prosedur Lainnya
    // Prosedur untuk menambah seorang Student
    public void addStudent(Student student) {
        if (!(this.studentsEnrolled).contains(student)){
            (this.studentsEnrolled).add(student);
            student.enrollInCourse(this);   
        }
    }

    // Prosedur untuk menghapus seorang Student
    public void removeStudent(Student student) {
        if ((this.studentsEnrolled).contains(student)) {
            (this.studentsEnrolled).remove(student);
        }
    }

    // Prosedur untuk menampilkan seluruh Student yang mengambil Course
    public void viewEnrolledStudents() {
        int i;
        int size;
        size = (this.studentsEnrolled).size();
        if (size != 0){
            for (i = 0; i < size; i ++){
                System.out.printf("Mahasiswa %d:\n", i+1);
                ((this.studentsEnrolled).get(i)).getDetails();
            }
        }
    }

    // Prosedur untuk menampilkan detail dari Course, yaitum kode Course, nama Course, dan Lecture (Dosen Pengampu)
    public void getDetails() {
        System.out.printf("Kode Mata Kuliah    : %s\n", this.getCourseCode());
        System.out.printf("Nama Mata Kuliah    : %s\n", this.getCourseName());
        System.out.printf("Nama Dosen Pengampu : %s\n", this.getLecture());
    }
}
