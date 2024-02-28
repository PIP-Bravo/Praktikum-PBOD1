import java.math.*;
public class Garis {
	
	// Deklarasi variabel
	private Titik titikAwal;
	private Titik titikAkhir;
	
	// Constructor
	Garis(){
		titikAwal = null;
		titikAkhir = null;
	}
	
	Garis(Titik a, Titik b){
		this.titikAwal = a;
		this.titikAkhir = b;
	}
	
	// Setter
	public void settitikAwal(Titik titik) {
		this.titikAwal = titik;
	}
	public void settitikAkhir(Titik titik) {
		this.titikAkhir = titik;
	}
	
	// Getter
	public Titik getTitikAwal() {
		return this.titikAwal;
	}
	
	public Titik getTitikAkhir() {
		return this.titikAkhir;
	}
	
	// Other Method
	public float getPanjang() {
		double jarak_absis = titikAkhir.getAbsis()- titikAwal.getAbsis();
		double jarak_ordinat = titikAkhir.getOrdinat()- titikAwal.getOrdinat();
		return (float) Math.sqrt((Math.pow((double)(jarak_absis),(double)2))+(Math.pow((double)(jarak_ordinat),(double)2)));
	}
	
	public float getGradien() {
		float deltaY = (float) (titikAkhir.getOrdinat()-titikAwal.getOrdinat());
		float deltaX = (float) (titikAkhir.getAbsis()-titikAwal.getAbsis());
		return (float) deltaY/deltaX;
	}
	
	public Garis getRefleksiY() {
//		this.titikAwal.setAbsis(this.titikAwal.getAbsis()*(-1));
//		this.titikAkhir.setAbsis(this.titikAkhir.getAbsis()*(-1));
		Titik titikAwalR = this.getTitikAwal().getRefleksiY();
		Titik titikAkhirR = this.getTitikAkhir().getRefleksiY();
		return new Garis(titikAwalR,titikAkhirR);
	}
	
	public boolean isTegakLurus(Garis g) {
		return ((this.getGradien())*(g.getGradien())==-1);
	}
	
}
