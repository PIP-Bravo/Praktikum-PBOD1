/* Nama : Alfonso Clement Sutantio
 * NIM : 24060122130080
 * Praktikum : PBO D1 Praktikum 4
 */

public class Person {
    protected String name;
    protected int age;
    protected String address;
    protected int ID;

    Person(String name, int age, String address, int ID) {
        // Fungsi konstruktor
    	this.name = name;
    	this.age = age;
    	this.address = address;
    	this.ID = ID;
    }
    // Setter (method untuk memberikan / merubah nilai properti)
    protected void setName(String name) {
    	this.name = name;
    }
    
    protected void setAge(int age) {
    	this.age = age;
    }
    
    protected void setAddress(String address) {
    	this.address = address;
    }
    
    protected void setID(int ID) {
    	this.ID = ID;
    }

    // Getter (method untuk memperoleh nilai dari properti)
    protected String getName() {
    	return this.name;
    }

    protected String getName(String nama){//Overloading, cari 5 huruf pertama dari nama orang
        return nama.substring(0,4);
    }
    
    protected int getAge() {
    	return this.age;
    }
    
    protected String getAddress() {
    	return this.address;
    }
    
    protected int getID() {
    	return this.ID;
    }

    protected void viewCourses() {
        /* Fungsi untuk menampilkan seluruh courses
        */
    	System.out.println("Sistem belum mengetahui kamu adalah dosen atau mahasiswa");
    }
}
