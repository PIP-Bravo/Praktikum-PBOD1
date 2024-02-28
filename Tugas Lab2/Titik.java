import java.math.*;
public class Titik {
    double absis;
    double ordinat;
    static int counter;

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

    public void setAbsis(double a) {
        this.absis = a;
    }

    public void setOrdinat(double b) {
        this.ordinat = b;
    }

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
    
    public void refleksiX(Titik titik) {
    	this.setOrdinat(titik.getOrdinat()*(-1));
    }
    
    public void refleksiY(Titik titik) {
    	this.setAbsis(titik.getAbsis()*(-1));
    }
  
    public void getRefleksiX() {
    	refleksiX(this);
    }
    
    public void getRefleksiY() {
    	refleksiY(this);
    }
    
}
