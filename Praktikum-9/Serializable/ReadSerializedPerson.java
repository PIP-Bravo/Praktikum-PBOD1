/*
* Nama File    : ReadSerializedPerson.java
* Nama         : Alfonso Clement Sutantio
* NIM          : 24060122130080
* Tanggal      : 15 Mei 2024
*/

import java.io.*;
public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person p = null;
        try {
            FileInputStream fis = new FileInputStream("person.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            p = (Person) ois.readObject();
            ois.close();
            System.out.println("Serialized person name = "+p.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
