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
}