/* Nama : Alfonso Clement Sutantio
 * NIM : 24060122130080
 * Praktikum : 13 - Lab D1
 * Tanggal buat : 27 Mei 2024
 */
import java.util.List;
import java.util.ArrayList;
public class ProgramMedium {
    public static void main(String[] args) {
        Truck truck = new Truck(100);
        System.out.println(truck);
        SeaPlane sPlane = new SeaPlane(100);
        System.out.println(sPlane);
        Helicopter copter = new Helicopter(100);
        System.out.println(copter);
        System.out.println("###########################################");

        List<Truck> armadaTruck = new ArrayList<>();
        List<SeaPlane> armadSeaPlane = new ArrayList<>();
        List<Helicopter> armadaHelicopter = new ArrayList<>();

        armadaTruck.add(truck);
        armadaTruck.add(truck);
        armadaTruck.add(truck);
        System.out.println("jumlah Armada Truck: "+ armadaTruck.size());
        armadSeaPlane.add(sPlane);
        System.out.println("jumlah Armada SeaPlane: "+ armadSeaPlane.size());
        armadaHelicopter.add(copter);
        armadaHelicopter.add(copter);
        System.out.println("jumlah Armada Helicopter: "+ armadaHelicopter.size());
        System.out.println("###########################################");

        ArmadaKendaraan<Vehicle> armadaKendaraan = new ArmadaKendaraan<>();

        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(armadaTruck);
        System.out.println(">> Jumlah unit kendaraan : " + armadaKendaraan.getAllArmada().size());
        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(armadSeaPlane);
        System.out.println(">> Jumlah unit kendaraan : " + armadaKendaraan.getAllArmada().size());
        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(armadaHelicopter);
        System.out.println(">> Jumlah unit kendaraan : " + armadaKendaraan.getAllArmada().size());
    }
}
