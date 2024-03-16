// File      : Person.java          13/03/2024
// Penulis   : Zikry Alfahri Akram
// Deskripsi : Class Person yang merepresentasikan objek person dengan nama, umur, dan alamat

package org.person;

public class Person {
    // ATRIBUT
    protected String name;
    protected int age;
    protected String address;
    protected int jumlahPerson = 0;

    // KONSTRUKTOR
    // Membuat objek person dengan inisialisasi nama, umur, dan alamat
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        jumlahPerson++;
    }

    // METHOD
    // Getter/Selektor
    // Fungsi Selektor untuk mendapatkan nilai atribut nama person
    public String getName(){
        return this.name;
    }

    // Fungsi Selektor untuk mendapatkan nilai atribut umur person
    public int getAge(){
        return this.age;
    }

    // Fungsi Selektor untuk mendapatkan nilai atribut alamat person
    public String getAddress(){
        return this.address;
    }

    // Fungsi Selektor untuk mendapatkan nilai atribut alamat person
    public int getJumlahPerson(){
        return jumlahPerson;
    }

    // Setter/Mutator
    // Prosedur untuk mengeset nilai atribut nama person dengan nilai yang baru
    public void setName(String name){
        this.name = name;
    }

    // Prosedur untuk mengeset nilai atribut umur person dengan nilai yang baru
    public void setAge(int age){
        this.age = age;
    }

    // Prosedur untuk mengeset nilai atribut alamat person dengan nilai yang baru
    public void setAddress(String address){
        this.address = address;
    }

    // Prosedur Lainnnya
    // Prosedur untuk menampilkan detail dari Person, yaitu nama, umur, dan alamat
    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}
