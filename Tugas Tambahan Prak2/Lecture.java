/* Nama : Alfonso Clement Sutantio
 * NIM : 24060122130080
 * Praktikum : PBO D1 Soal tambahan Praktikum 2
 */

import java.util.List;
import java.util.ArrayList;

public class Lecture {
	
    // Deklarasi properti dengan enkapsulasi
    private String name;
    private int age;
    private String address;
    private int employeeID;
    private List<Course> coursesTaught;

    // Konstruktor
    Lecture(String name, int age, String address, int employeeID) {
        // TODO: buatlah fungsi konstruktor
    	this.name = name;
    	this.age = age;
    	this.address = address;
    	this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    // Setter (method untuk memberikan / merubah nilai properti)
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setAge(int age) {
    	this.age = age;
    }
    
    public void setAddress(String address) {
    	this.address = address;
    }
    
    public void setEmployeeID(int employeeID) {
    	this.employeeID = employeeID;
    }

    // Getter (method untuk memperoleh nilai dari properti)
    public String getLectureName() {
    	return this.name;
    }
    
    public int getLectureAge() {
    	return this.age;
    }
    
    public String getLectureAddress() {
    	return this.address;
    }
    
    public int getLectureID() {
    	return this.employeeID;
    }
    
    // Method lain ( bisa berupa getter maupun setter)
    public void getDetails() {
        /* TODO: buat fungsi untuk print detail dari Lecture,
           menampilkan nama, umur, alamat, dan ID
        */
    	System.out.println("Nama : "+this.getLectureName());
    	System.out.println("Umur : "+this.getLectureAge());
    	System.out.println("Alamat : "+this.getLectureAddress());
    	System.out.println("ID : "+this.getLectureID());
    	System.out.println();
    }    

    public void teachCourse(Course course) {
        // TODO: buatlah fungsi untuk menambah sebuah course 
    	this.coursesTaught.add(course);
    }
    
    public void teachCourseDone(Course course) {
        // Fungsi ini digunakan untuk dosen menghapus course yang telah selesai diampu
    	this.coursesTaught.remove(course);
    }

    public void viewTaughtCourses() {
        /* TODO: buatlah fungsi untuk menampilkan seluruh course
           yang diampu oleh dosen.

           Hint: gunakan loop dan method getDetails dari Course
        */
    	for(int i = 0; i<=(coursesTaught.size()-1); i+=1) {
			coursesTaught.get(i).getDetails();
		}
    }
    
}
