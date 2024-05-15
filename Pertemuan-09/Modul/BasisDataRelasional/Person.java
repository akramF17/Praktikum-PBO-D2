/*
 *  File        : Person.java            15/05/2024
 *  Pembuat     : Zikry Alfahri Akram (2060122120033)
 *  Deskripsi   : Person database model
 */

public class Person {
    private int id;
    private String name;

    public Person (String n){
        name = n;
    }

    public Person (int i, String n){
        id = i;
        name = n;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}
