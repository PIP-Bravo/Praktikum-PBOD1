/* Nama : Alfonso Clement Sutantio
 * NIM : 24060122130080
 * Praktikum : PBO D1 Praktikum 4
 */

import java.util.List;
import java.util.ArrayList;

public class Student extends Person {
	
	// Deklarasi properti dengan enkapsulasi
    private List<Course> coursesEnrolled;
    
    // Konstruktor
    Student(String name, int age, String address, int studentID) {
        // Fungsi konstruktor
        super(name, age, address, studentID);
        this.coursesEnrolled = new ArrayList<>();
    }
    
    // Method lain ( bisa berupa getter maupun setter)
    public void getDetails() {
        /* Fungsi untuk print detail dari Student,
           menampilkan nama, umur, alamat, dan NIM
        */
    	System.out.println("Nama : "+this.getName());
    	System.out.println("Umur : "+this.getAge());
    	System.out.println("Alamat : "+this.getAddress());
    	System.out.println("NIM : "+this.getID());
    	System.out.println();
    }

    public void enrollInCourse(Course course) {
        // Fungsi untuk menambah sebuah course
    	this.coursesEnrolled.add(course);
    }
    
    public void leaveCourse(Course course) {
        // Fungsi ini digunakan untuk mahasiswa membatalkan course yang telah di enroll
    	this.coursesEnrolled.remove(course);
    }

    public void viewCourses() {//Overriding
        /* Fungsi untuk menampilkan seluruh course 
           yang diambil oleh mahasiswa.
        */
    	for(int i = 0; i<=(coursesEnrolled.size()-1); i+=1) {
			coursesEnrolled.get(i).getDetails();
		}
    }
}
