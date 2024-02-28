
public class MainGaris {

	public static void main(String[] args) {
		// Melakukan deklarasi Variabel
		Titik titik1 = new Titik(2,6);
		Titik titik2 = new Titik(6,2);
		Titik titik3 = new Titik(2,2);
		Titik titik4 = new Titik(7,7);
		Garis garis = new Garis();
		Garis garis2 = new Garis();
		Garis garisrefleksi = new Garis();
		
		// Melakukan set nilai awal 2 titik pada garis
		garis.settitikAwal(titik1);
		garis.settitikAkhir(titik2);
		garis2.settitikAwal(titik3);
		garis2.settitikAkhir(titik4);
		
		// Mengakses nilai absis dan ordinat titik awal, titik akhir garis
		System.out.println("Absis dari titik awal garis 1 adalah "+garis.getTitikAwal().getAbsis());
		System.out.println("Ordinat dari titik awal garis 1 adalah "+garis.getTitikAwal().getOrdinat());
		System.out.println("Absis dari titik akhir garis 1 adalah "+garis.getTitikAkhir().getAbsis());
		System.out.println("Ordinat dati titik akhir garis 1 adalah "+garis.getTitikAkhir().getOrdinat());
		
		// Menghitung panjang garis
		System.out.println("Panjang dari garis 1 adalah "+ garis.getPanjang());
		System.out.println("Panjang dari garis 2 adalah "+ garis2.getPanjang());
		
		// Mengitung gradien garis
		System.out.println("Gradien dari garis 1 adalah "+ garis.getGradien());
		System.out.println("Gradien dari garis 2 adalah "+ garis2.getGradien());
		
		// Refleksikan garis terhadap sumbu Y, disimpan hasilnya dalam variabel garisrefleksi bertipe garis 
		//( menghasilkan garis baru )
		garisrefleksi = garis.getRefleksiY();
		// Cek titik awal setelah direfleksi
		System.out.println("Absis dari titik awal garis yang direfleksi adalah "+garisrefleksi.getTitikAwal().getAbsis());
		System.out.println("Ordinat dari titik awal garis yang direfleksi adalah "+garisrefleksi.getTitikAwal().getOrdinat());
		System.out.println("Absis dari titik akhir garis yang direfleksi adalah "+garisrefleksi.getTitikAkhir().getAbsis());
		System.out.println("Ordinat dari titik akhir garis yang direfleksi adalah "+garisrefleksi.getTitikAkhir().getOrdinat());
		
		
		// cek apakah garis 1 saling tegak lurus dengan garis2
		System.out.println("Apakah garis 1 tegak lurus dengan garis 2: "+garis.isTegakLurus(garis2));
	}

}
