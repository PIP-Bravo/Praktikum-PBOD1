/* Nama : Alfonso Clement Sutantio
 * NIM : 24060122130080
 * Praktikum : PBO D1 Praktikum 4
 * Ket : Overloading dilakukan di class Person, class Person ditambahkan sebagai kelas induk (parent) dari student dan lecture yang nantinya dilakukan overriding disana
 */

// Import
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  // Membuat 3 properti static yang digunakan nantinya dalam interface
  private static List<Student> allStudents = new ArrayList<>();
  private static List<Lecture> allLecturers = new ArrayList<>();
  private static List<Course> allCourses = new ArrayList<>();
  
  // Main run
  public static void main(String[] args) {
	  // Membuat 2 buah objek baru bertipe Lecture
	  Lecture arispuji = new Lecture("ArisPujiWidodo", 38, "Semarang", 871345);
	  Lecture beta = new Lecture("BetaNorita", 36, "Solo", 749021);
	  
	  // Menambahkan kedua objek dalam properti static diatas yang bertipe list dengan elemen bertipe data Lecture
	  allLecturers.add(arispuji);
	  allLecturers.add(beta);
	  
	  // Membuat 4 buah objek baru bertipe Student
	  Student james = new Student("James", 20, "Jl.Turu", 30080);
	  Student drew = new Student("Drew", 19, "Jl.Tangi", 41064);
	  Student jafhan = new Student("Jafhan", 19, "Jl.Adus", 40217);
	  Student burhan = new Student("Burhan", 20, "Jl.Mangan", 20012);
	  
	  // Menambahkan keempat objek dalam properti static diatas yang bertipe list dengan elemen bertipe data Student
	  allStudents.add(james);
	  allStudents.add(drew);
	  allStudents.add(jafhan);
	  allStudents.add(burhan);
	  
	  // Membuat 3 buah objek baru bertipe Course
	  Course mik121 = new Course("MIK121", "ASA",arispuji);
	  Course mik212 = new Course("MIK212", "Daspro",arispuji);
	  Course mik313 = new Course("MIK313", "MTK2",beta);
	  
	  // Menambahkan ketiga objek dalam properti static diatas yang bertipe list dengan elemen bertipe data Course
	  allCourses.add(mik121);
	  allCourses.add(mik212);
	  allCourses.add(mik313);
	  
	  // Menggunakan method teachCourse yang ada pada class Lecture
	  arispuji.teachCourse(mik121);
	  arispuji.teachCourse(mik212);
	  beta.teachCourse(mik313);
	  
	  // Menggunakan method addStudent yang ada pada class Course
	  mik121.addStudent(jafhan);
	  mik121.addStudent(drew);
	  mik121.addStudent(james);
	  
	  mik212.addStudent(burhan);
	  mik212.addStudent(jafhan);
	  mik212.addStudent(drew);
	
	  mik313.addStudent(james);
	  mik313.addStudent(jafhan);
	  mik313.addStudent(drew);
	  mik313.addStudent(burhan);
	  
	  // Menggunakan method enrollIncourse yang ada pada class Student
	  james.enrollInCourse(mik121);
	  james.enrollInCourse(mik313);
	  
	  drew.enrollInCourse(mik212);
	  drew.enrollInCourse(mik313);
	  drew.enrollInCourse(mik121);
	  
	  jafhan.enrollInCourse(mik313);
	  jafhan.enrollInCourse(mik212);
	  jafhan.enrollInCourse(mik121);
	  
	  burhan.enrollInCourse(mik313);
	  burhan.enrollInCourse(mik212);

	// Memanggil penampilan userinterface commandline sederhana
    littleui();
    
    System.out.println(" ");
    System.out.println("!!Ini adalah deretan percobaan methods yang mungkin tidak tercover secara langsung melalui interface!!");
    System.out.println(" ");
    /* Jika sebelumnya diatas kita sudah mencontohkan penambahan elemen objek pada list bertipe objek tersebut  di class lain
     * , maka sudah seharusnya kita juga bisa menghapus objek yang telah ditambahkan, berikut percobaannya
     */
    jafhan.leaveCourse(mik313);
    System.out.println("Jika jafhan tidak lagi mengambil mik313 Maka sisa mata kuliah yang diambil jafhan adalah ");
    jafhan.viewCourses();
    mik212.removeStudent(burhan);
    System.out.println("Setelah burhan dihapus, mahasiswa yang masih mengikuti mik212 adalah ");
    mik212.viewEnrolledStudents();
    arispuji.teachCourseDone(mik212);
    System.out.println("Setelah Pak Aris tidak mengampu mata kuliah mik212 maka mata kuliah yang masih diampu adalah ");
    arispuji.viewCourses();
    
    // Lanjutan penerapan fungsi set dan get
    jafhan.setAge(21);
    jafhan.setAddress("Jl.Mario Bros");
    System.out.println(jafhan.getAge());
    System.out.println(jafhan.getAddress());
    
    mik212.setLecture(beta);
    mik212.setName("KWU");
    System.out.println(" ");
    System.out.println(mik212.getLecture());
    System.out.println(mik212.getCourseName());
    
    beta.teachCourse(mik212);
    beta.setAge(26);
    System.out.println(" ");
    System.out.println(beta.getAge());
    beta.viewCourses();

    // Tes overloading, untuk overriding sudah dilakukan dalam uji coba panggil mata kuliah yang aimbil siswa dan yang diampu dosen
    System.out.println(arispuji.getName(arispuji.getName()));// Cari nama depan / panggilan dosen

    
  }
  
  public static void littleui() {
	  System.out.println("Hello Welcome to the system...");
	  for(int i = 0; i<=100; i+=25) {
			System.out.println(i+"%...");
		}
	  Scanner scanner = new Scanner(System.in);
	  while (true) {
		  System.out.println(" ");
		  System.out.println("Selamat datang di MENU UTAMA");
		  System.out.println("1. Cek mata kuliah yang diambil oleh seorang mahasiswa");
		  System.out.println("2. Cek siapa saja yang mengambil suatu mata kuliah");
		  System.out.println("3. Cek mata kuliah apa saja yang diampu oleh seorang dosen");
		  System.out.println("4. Cek detail seorang mahasiswa");
		  System.out.println("5. Cek detail suatu mata kuliah");
		  System.out.println("6. Cek detail seorang dosen");
		  System.out.print("Silahkan pilih Operasi yang ingin anda lakukan (ketikkan angka) : ");
		  // Inputan untuk memilih
		  String incoming = scanner.next();
		 
		  switch (incoming) {
			  case "1":
				  for(int i = 0; i<=(allStudents.size()-1); i+=1) {
						System.out.print(allStudents.get(i).getName()+" ");
				  }
				  System.out.println(" ");
		          System.out.print("Pilih mahasiswa menggunakan indeks (mulai 0) : ");
		          int name = scanner.nextInt();
		          System.out.println(" ");
		          allStudents.get(name).viewCourses();
		          break;
			  case "2":
				  for(int i = 0; i<=(allCourses.size()-1); i+=1) {
						System.out.print(allCourses.get(i).getCourseName()+" ");
				  }
				  System.out.println(" ");
		          System.out.print("Pilih mata kuliah menggunakan indeks (mulai 0) : ");
		          int name3 = scanner.nextInt();
		          System.out.println(" ");
		          allCourses.get(name3).viewEnrolledStudents();
		          break;
			  case "3":
				  for(int i = 0; i<=(allLecturers.size()-1); i+=1) {
						System.out.print(allLecturers.get(i).getName()+" ");
				  }
				  System.out.println(" ");
		          System.out.print("Pilih dosen menggunakan indeks (mulai 0) : ");
		          int name2 = scanner.nextInt();
		          System.out.println(" ");
		          allLecturers.get(name2).viewCourses();
		          break;
			  case "4":
				  for(int i = 0; i<=(allStudents.size()-1); i+=1) {
						System.out.print(allStudents.get(i).getName()+" ");
				  }
				  System.out.println(" ");
		          System.out.print("Pilih mahasiswa menggunakan indeks (mulai 0) : ");
		          int name4 = scanner.nextInt();
		          System.out.println(" ");
		          allStudents.get(name4).getDetails();
		          break;
			  case "5":
				  for(int i = 0; i<=(allCourses.size()-1); i+=1) {
						System.out.print(allCourses.get(i).getCourseName()+" ");
				  }
				  System.out.println(" ");
		          System.out.print("Pilih mata kuliah menggunakan indeks (mulai 0) : ");
		          int name5 = scanner.nextInt();
		          System.out.println(" ");
		          allCourses.get(name5).getDetails();
		          break;
			  case "6":
				  for(int i = 0; i<=(allLecturers.size()-1); i+=1) {
						System.out.print(allLecturers.get(i).getName()+" ");
				  }
				  System.out.println(" ");
		          System.out.print("Pilih dosen menggunakan indeks (mulai 0) : ");
		          int name6 = scanner.nextInt();
		          System.out.println(" ");
		          allLecturers.get(name6).getDetails();
		          break;
		  }
		  
		  System.out.print("Lanjutkan? (y/n): ");
          String lanjut = scanner.next();

          if (!lanjut.equalsIgnoreCase("y")) {
              break;
          }
	  }
	  scanner.close();
  }
}
