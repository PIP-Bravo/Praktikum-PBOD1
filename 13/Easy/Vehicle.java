/* Nama : Alfonso Clement Sutantio
 * NIM : 24060122130080
 * Praktikum : 13 - Lab D1
 * Tanggal buat : 27 Mei 2024
 */
public abstract class Vehicle {
    public abstract double calcFuelEfficency();
    public abstract double calcTripDistance();
    public String toString(){
        return this.getClass().getSimpleName();
    }
}
