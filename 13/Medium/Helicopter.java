/* Nama : Alfonso Clement Sutantio
 * NIM : 24060122130080
 * Praktikum : 13 - Lab D1
 * Tanggal buat : 27 Mei 2024
 */
public class Helicopter extends Airplane {
    private double maxLoad;

    Helicopter(double maxLoad){
        this.maxLoad=maxLoad;
    }

    public double calcFuelEfficency() {
        double baseEfficiency = 1.5; // base fuel efficiency in km per liter for a helicopter
        double loadFactor = 0.015;
        double efficiency = baseEfficiency - (maxLoad * loadFactor);

        return efficiency;
    }

    public double calcTripDistance() {
        double fuelInTank = 150; //
        double efficiency = calcFuelEfficency();
        
        return fuelInTank * efficiency;
    }

    public String toString(){
        return "Helicopter hanya memerlukan landasan kecil";
    }

    public void takeOff(){
        System.out.println("The Helicopter is now taking off");
    }

    public void land(){
        System.out.println("The Helicopter is now landing");
    }

    public void fly(){
        System.out.println("The Helicopter is now flying");
    }
}
