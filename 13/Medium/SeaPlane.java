/* Nama : Alfonso Clement Sutantio
 * NIM : 24060122130080
 * Praktikum : 13 - Lab D1
 * Tanggal buat : 27 Mei 2024
 */
public class SeaPlane extends Airplane {
    private double maxLoad;

    SeaPlane(double maxLoad){
        this.maxLoad=maxLoad;
    }

    public double calcFuelEfficency() {
        double baseEfficiency = 2.0;
        double loadFactor = 0.02; 
        double efficiency = baseEfficiency - (maxLoad * loadFactor);

        return efficiency;
    }

    public double calcTripDistance() {
        double fuelInTank = 200; //
        double efficiency = calcFuelEfficency();
        
        return fuelInTank * efficiency;
    }

    public String toString(){
        return "SeaPlane dapat take-off dan mendarat di perairan laut";
    }

    public void takeOff(){
        System.out.println("The SeaPlane is now taking off");
    }

    public void land(){
        System.out.println("The SeaPlane is now landing");
    }

    public void fly(){
        System.out.println("The SeaPlane is now flying");
    }
}
