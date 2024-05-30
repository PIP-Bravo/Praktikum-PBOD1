/* Nama : Alfonso Clement Sutantio
 * NIM : 24060122130080
 * Praktikum : 13 - Lab D1
 * Tanggal buat : 27 Mei 2024
 */
public class RiverBarge extends Vehicle {
    private double maxLoad;

    RiverBarge(double maxLoad){
        this.maxLoad=maxLoad;
    }

    public double calcFuelEfficency() {
        double baseEfficiency = 5.0;
        double loadFactor = 0.05;
        double efficiency = baseEfficiency - (maxLoad * loadFactor);

        return efficiency;
    }

    public double calcTripDistance() {
        double fuelInTank = 100;
        double efficiency = calcFuelEfficency();
        
        return fuelInTank * efficiency;
    }
}
