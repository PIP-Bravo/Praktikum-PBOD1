/* Nama : Alfonso Clement Sutantio
 * NIM : 24060122130080
 * Praktikum : PBO D1 Soal tambahan Praktikum 2
 */

import java.util.List;
import java.util.ArrayList;

public class Student {
	
	// Deklarasi properti dengan enkapsulasi
    private String name;
    private int age;
    private String address;
    private int studentID;
    private List<Course> coursesEnrolled;
    
    // Konstruktor
    Student(String name, int age, String address, int studentID) {
        // TODO: buatlah fungsi konstruktor
    	this.name = name;
    	this.age = age;
    	this.address = address;
    	this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
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
    
    public void setStudentID(int studentID) {
    	this.studentID = studentID;
    }

    // Getter (method untuk memperoleh nilai dari properti)
    public String getStudentName() {
    	return this.name;
    }
    
    public int getStudentAge() {
    	return this.age;
    }
    
    public String getStudentAddress() {
    	return this.address;
    }
    
    public int getStudentID() {
    	return this.studentID;
    }
    
    // Method lain ( bisa berupa getter maupun setter)
    public void getDetails() {
        /* TODO: buat fungsi untuk print detail dari Student,
           menampilkan nama, umur, alamat, dan ID
        */
    	System.out.println("Nama : "+this.getStudentName());
    	System.out.println("Umur : "+this.getStudentAge());
    	System.out.println("Alamat : "+this.getStudentAddress());
    	System.out.println("ID : "+this.getStudentID());
    	System.out.println();
    }

    public void enrollInCourse(Course course) {
        // TODO: buatlah fungsi untuk menambah sebuah course
    	this.coursesEnrolled.add(course);
    }
    
    public void leaveCourse(Course course) {
        // Fungsi ini digunakan untuk mahasiswa membatalkan course yang telah di enroll
    	this.coursesEnrolled.remove(course);
    }

    public void viewEnrolledCourses() {
        /* TODO: buatlah fungsi untuk menampilkan seluruh course 
           yang diambil oleh mahasiswa.

           Hint: gunakan loop dan method getDetails dari Course
        */
    	for(int i = 0; i<=(coursesEnrolled.size()-1); i+=1) {
			coursesEnrolled.get(i).getDetails();
		}
    }
}
