/* Nama : Alfonso Clement Sutantio
 * NIM : 24060122130080
 * Praktikum : 13 - Lab D1
 * Tanggal buat : 27 Mei 2024
 */
public class Truck extends Vehicle{
    private double maxLoad;

    Truck(double maxLoad){
        this.maxLoad=maxLoad;
    }

    public double calcFuelEfficency() {
        double baseEfficiency = 8.0;
        double loadFactor = 0.1;
        double efficiency = baseEfficiency - (maxLoad * loadFactor);

        return efficiency;
    }

    public double calcTripDistance() {
        double fuelInTank = 100; //
        double efficiency = calcFuelEfficency();
        
        return fuelInTank * efficiency;
    }

    public String toString(){
        return "Truck adalah angkutan darat yang sangat handal";
    }
}
