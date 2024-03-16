// File      : Main.java          13/03/2024
// Penulis   : Zikry Alfahri Akram
// Deskripsi : Class yang berisi Main dari class folder campus

package org.main;

import org.campus.*;

public class Main {
    public static void main(String[] args) {
      Student siti = new Student("Siti", 18, "Tembalang", 222001);
      Student sri = new Student("Sri", 18, "Banyumanik", 223020);
      Student ahmad = new Student("Ahmad", 19, "Sumurboto", 224100);
      Student endang = new Student("Endang", 19, "Pedalangan", 212018);

      Lecture adit = new Lecture("Adit", 36, "Tembalang", 176014);
      Lecture budi = new Lecture("Budi", 40, "Banyumanik");
      Lecture maya = new Lecture("Maya", 38, "Ngesrep", 177034);

      Course paik6102 = new Course("PAIK6102", "Basics Of Programming", adit);
      Course paik6203 = new Course("PAIK6202", "Organisasi dan Arsitektur Komputer", budi);
      Course paik6304 = new Course("PAIK6302", "Metode Numerik", maya);
      Course paik6401 = new Course("PAIK6402", "Pemrograman Berorientasi Objek");
      
      // Student
      // Fungsi Getter/Selektor
      // Fungsi getName
      System.out.printf("Nama saya adalah %s\n", ahmad.getName());
      // Fungsi getAge
      System.out.printf("Umur teman saya %s adalah %d\n", siti.getName(), siti.getAge());
      // Fungsi getAddress
      System.out.printf("%s tinggal di %s\n", endang.getName(), endang.getAddress());
      // Fungsi getStudentID
      System.out.printf("NIM %d adalah milik %s\n", sri.getStudentID(), sri.getName());
      System.out.println();

      // Prosedur Setter dan getDetails
      System.out.printf("Sebelum:\n");
      endang.getDetails();
      endang.setName("Endang Kusmawati");
      endang.setAge(20);
      endang.setAddress("Banyumanik");
      endang.setStudentID(212019);
      System.out.println();
      System.out.printf("Sesudah:\n");
      endang.getDetails();
      System.out.println();

      // Prosedur Lainnya
      // Prosedur enrolleInCourse dan viewEnrolledCourse
      siti.enrollInCourse(paik6102);
      sri.enrollInCourse(paik6102);
      ahmad.enrollInCourse(paik6102);
      endang.enrollInCourse(paik6102);
      siti.enrollInCourse(paik6203);
      sri.enrollInCourse(paik6203);
      ahmad.enrollInCourse(paik6203);
      endang.enrollInCourse(paik6203);
      ahmad.enrollInCourse(paik6304);
      endang.enrollInCourse(paik6304);
      ahmad.enrollInCourse(paik6401);
      endang.enrollInCourse(paik6401);

      System.out.println();
      System.out.printf("Mata kuliah yang diikuti %s:\n", siti.getName());
      siti.viewEnrolledCourses();
      System.out.println();
      System.out.printf("Mata kuliah yang diikuti %s:\n", sri.getName());
      sri.viewEnrolledCourses();
      System.out.println();
      System.out.printf("Mata kuliah yang diikuti %s:\n", ahmad.getName());
      ahmad.viewEnrolledCourses();
      System.out.println();
      System.out.printf("Mata kuliah yang diikuti %s:\n", endang.getName());
      endang.viewEnrolledCourses();

      // Prosedur unenrolledCourse dan viewEnrolledCourse
      ahmad.unenrolledCourse(paik6401);
      System.out.println();
      System.out.printf("Mata kuliah yang diikuti %s sekarang:\n", ahmad.getName());
      ahmad.viewEnrolledCourses();
      System.out.println();
      

      // Lecture
      // Fungsi Getter

      // Fungsi getName
      System.out.printf("Nama saya adalah %s\n", adit.getName());
      // Fungsi getAge
      System.out.printf("Umur teman saya %s adalah %d\n", maya.getName(), maya.getAge());
      // Fungsi getAddress
      System.out.printf("%s tinggal di %s\n", budi.getName(), budi.getAddress());
      // Fungsi getStudentID
      System.out.printf("NIP %d adalah milik %s\n", maya.getEmployeeID(), maya.getName());
      System.out.println();

      // Prosedur Setter
      System.out.printf("Sebelum:\n");
      budi.getDetails();
      budi.setName("Budi Cahyono");
      budi.setAge(41);
      budi.setAddress("Padangsari");
      budi.setEmployeeID(177025);
      System.out.println();
      System.out.printf("Sesudah:\n");
      budi.getDetails();
      System.out.println();

      // Prosedur Lainnya
      // Prosedur teachCourse dan viewTaughtCourse
      adit.teachCourse(paik6102);
      adit.teachCourse(paik6203);
      budi.teachCourse(paik6304);
      maya.teachCourse(paik6401);

      System.out.println();
      System.out.printf("Mata kuliah yang diajar %s:\n", adit.getName());
      adit.viewTaughtCourses();
      System.out.println();
      System.out.printf("Mata kuliah yang diajar %s:\n", budi.getName());
      budi.viewTaughtCourses();
      System.out.println();
      System.out.printf("Mata kuliah yang diajar %s:\n", maya.getName());
      maya.viewTaughtCourses();

      // Prosedur unenrolledCourse dan viewEnrolledCourse
      adit.cancelTeachCourse(paik6203);
      System.out.println();
      System.out.printf("Mata kuliah yang diajar %s sekarang:\n", adit.getName());
      adit.viewTaughtCourses();
      System.out.println();

      // Course
      // Fungsi Getter
      // Fungsi getCourseName
      System.out.printf("Nama mata kuliah ini adalah %s\n", paik6102.getCourseName());
      // Fungsi getCourseCode
      System.out.printf("Kode mata kuliah %s adalah %s\n", paik6203.getCourseName(), paik6203.getCourseCode());
      // Fungsi getLecture
      System.out.printf("Mata kuliah %s diajar oleh %s\n", paik6304.getCourseName(), paik6304.getLecture());
      System.out.println();

      // Prosedur Setter dan Prosedur getDetails
      System.out.printf("Sebelum:\n");
      paik6102.getDetails();
      paik6102.setCourseName("Dasar Pemrograman");
      paik6102.setCourseCode("AIK6102");
      paik6102.setLecture(budi);
      System.out.printf("Sesudah:\n");
      paik6102.getDetails();

      // Prosedur Lainnya
      paik6102.addStudent(siti);
      paik6102.addStudent(sri);
      paik6102.addStudent(ahmad);
      paik6102.addStudent(endang);
      paik6203.addStudent(siti);
      paik6203.addStudent(sri);
      paik6203.addStudent(ahmad);
      paik6203.addStudent(endang);
      paik6304.addStudent(ahmad);
      paik6304.addStudent(endang);
      paik6401.addStudent(ahmad);
      paik6401.addStudent(endang);

      System.out.println();
      System.out.printf("Mata kuliah %s diikuti oleh:\n", paik6102.getCourseName());
      paik6102.viewEnrolledStudents();
      System.out.println();
      System.out.printf("Mata kuliah %s diikuti oleh:\n", paik6203.getCourseName());
      paik6203.viewEnrolledStudents();
      System.out.println();
      System.out.printf("Mata kuliah %s diikuti oleh:\n", paik6304.getCourseName());
      paik6304.viewEnrolledStudents();
      System.out.println();
      System.out.printf("Mata kuliah %s diikuti oleh:\n", paik6401.getCourseName());
      paik6401.viewEnrolledStudents();

      paik6401.removeStudent(ahmad);
      System.out.println();
      System.out.printf("Mata kuliah %s sekarang diikuti oleh:\n", paik6401.getCourseName());
      paik6401.viewEnrolledStudents();
      System.out.println();
    }
  }
  