package test.main;

import test.bangundatar.*;

public class MPoligon {
  public static void main(String[] args){
    PersegiPanjang persegiPanjang = new PersegiPanjang(10,10,4);
    persegiPanjang.printInfo();
    System.out.println("Luas Persegi Panjang: "+persegiPanjang.hitungLuas());
    
    System.out.println("Sekarang Segitiga");
    Segitiga segitiga = new Segitiga(5,2,3);
    segitiga.printInfo();
    System.out.println("Luas Segitiga: "+segitiga.hitungLuas());
	}
}