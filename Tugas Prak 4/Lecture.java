/* Nama : Alfonso Clement Sutantio
 * NIM : 24060122130080
 * Praktikum : PBO D1 Praktikum 4
 */

import java.util.List;
import java.util.ArrayList;

public class Lecture extends Person {
	
    // Deklarasi properti dengan enkapsulasi
    private List<Course> coursesTaught;

    // Konstruktor
    Lecture(String name, int age, String address, int employeeID) {
        // Buatlah fungsi konstruktor
    	setName(name);
    	setAge(age);
    	setAddress(address);
    	setID(employeeID);
        this.coursesTaught = new ArrayList<>();
    }
    
    // Method lain ( bisa berupa getter maupun setter)
    public void getDetails() {
        /* Fungsi untuk print detail dari Lecture,
           menampilkan nama, umur, alamat, dan NIP
        */
    	System.out.println("Nama : "+this.getName());
    	System.out.println("Umur : "+this.getAge());
    	System.out.println("Alamat : "+this.getAddress());
    	System.out.println("NIP : "+this.getID());
    	System.out.println();
    }    

    public void teachCourse(Course course) {
        // Fungsi untuk menambah sebuah course 
    	this.coursesTaught.add(course);
    }
    
    public void teachCourseDone(Course course) {
        // Fungsi ini digunakan untuk dosen menghapus course yang telah selesai diampu
    	this.coursesTaught.remove(course);
    }

    public void viewCourses() {//Overriding
        /* Fungsi untuk menampilkan seluruh course yang diampu oleh dosen.
        */
    	for(int i = 0; i<=(coursesTaught.size()-1); i+=1) {
			coursesTaught.get(i).getDetails();
		}
    }
    
}
