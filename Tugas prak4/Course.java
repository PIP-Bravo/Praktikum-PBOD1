/* Nama : Alfonso Clement Sutantio
 * NIM : 24060122130080
 * Praktikum : PBO D1 Praktikum 4
 */

import java.util.List;
import java.util.ArrayList;

public class Course {
	
	// Deklarasi properti dengan enkapsulasi
    private String courseCode;
    private String courseName;
    private Lecture lecture;
    private List<Student> studentsEnrolled;

    // Konstruktor
    Course(String courseCode, String courseName, Lecture lecture) {
        // Fungsi konstruktor
    	this.courseCode = courseCode;
    	this.courseName = courseName;
    	this.lecture = lecture;
        this.studentsEnrolled = new ArrayList<>();
    }

    // Setter (method untuk memberikan / merubah nilai properti)
    public void setName(String coursename) {
    	this.courseName = coursename;
    }
    
    public void setCode(String courseCode) {
    	this.courseCode = courseCode;
    }
    
    public void setLecture(Lecture lecture) {
    	this.lecture = lecture;
    }
    
    // Getter (method untuk memperoleh nilai dari properti)
    public String getCourseName() {
    	return this.courseName;
    }
    
    public String getCourseCode() {
    	return this.courseCode;
    }
    
    public String getLecture() {
    	return this.lecture.getName();
    }
    
    // Method lain ( bisa berupa getter maupun setter)
    public void getDetails() {
        /* Fungsi untuk print detail dari Course, 
           menampilkan kode course, nama course, dan dosen pengampu
        */ 
    	System.out.println("Kode Course : "+this.getCourseCode());
    	System.out.println("Nama Course : "+this.getCourseName());
    	System.out.println("Dosen Pengampu : "+this.getLecture());
    	System.out.println();
    }    
    
    public void addStudent(Student student) {
        // Fungsi untuk menambah seorang mahasiswa
    	this.studentsEnrolled.add(student);
    }

    public void removeStudent(Student student) {
        // Fungsi untuk menghapus seorang mahasiswa
    	this.studentsEnrolled.remove(student);
    }

    public void viewEnrolledStudents() {
        /* Fungsi untuk menampilkan seluruh 
           student yang mengambil course. */
    	for(int i = 0; i<=(studentsEnrolled.size()-1); i+=1) {
    		studentsEnrolled.get(i).getDetails();
		}
    }
}
