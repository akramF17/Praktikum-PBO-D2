/*
 *  File        : SerializePerson.java            15/05/2024
 *  Pembuat     : Zikry Alfahri Akram (2060122120033)
 *  Deskripsi   : Program untuk serialisasi objek Person
 */

import java.io.*;

// Class Person
class Person implements Serializable {
    private String name;
    
    public Person (String n) {
        name = n;
    }

    public String getName(){
        return name;
    }
}

// Class SerializePeson
public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Panji");
        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("Selesai menulis objek Person");
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
