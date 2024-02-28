
public class MainTitik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Titik a = new Titik(2,7);
		System.out.println("Absis A adalah "+ a.getAbsis());
		System.out.println("Ordinat A adalah "+ a.getOrdinat());
		a.setAbsis(5);
		a.setOrdinat(3);
		System.out.println("Absis A adalah "+ a.getAbsis());
		System.out.println("Ordinat A adalah "+ a.getOrdinat());
		System.out.println("Jarak Pusatnya adalah "+ a.getJarakPusat());
		a.getRefleksiX();
		System.out.println("Absis A adalah "+ a.getAbsis());
		System.out.println("Ordinat A adalah "+ a.getOrdinat());
		a.getRefleksiY();
		System.out.println("Absis A adalah "+ a.getAbsis());
		System.out.println("Ordinat A adalah "+ a.getOrdinat());
	}

}
