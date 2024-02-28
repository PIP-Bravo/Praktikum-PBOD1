public class Titik {
	// Deklarasi Variabel
    private double absis;
    private double ordinat;
    private static int counter;

    // Constructor
    Titik() {
        counter++;
        absis = 0;
        ordinat = 0;    
    }

    Titik(double a, double b) {
        counter++;
        this.absis = a;
        this.ordinat = b;
    }

    // Setter
    public void setAbsis(double a) {
        this.absis = a;
    }

    public void setOrdinat(double b) {
        this.ordinat = b;
    }

    // Getter
    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public int getCounter() {
        return counter;
    }
    
    public float getJarakPusat() {
    	return (float) Math.sqrt(((this.absis*this.ordinat)+(this.absis*this.ordinat)));
    }
    
    // Other Method
    public void refleksiX() {
    	this.setOrdinat(-ordinat);
    }
    
    public void refleksiY() {
    	this.setOrdinat(-absis);
    }
  
    public Titik getRefleksiX() {
    	return new Titik(this.getAbsis(),-(this.getOrdinat()));
    }
    
    public Titik getRefleksiY() {
    	return new Titik(-(this.getAbsis()),this.getOrdinat());
    }
    
}

