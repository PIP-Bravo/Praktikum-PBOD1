/* Nama : Alfonso Clement Sutantio
 * NIM : 24060122130080
 * Praktikum : 13 - Lab D1
 * Tanggal buat : 27 Mei 2024
 */
public class AirPort {
    private Airplane airplane;
    private String name;

    AirPort(String name){
        this.name = name;
    }
    public String givePermissionToLand(IFlyer flyer) {
        if (flyer instanceof Airplane) {
            return "Permission granted to land.";
        } else {
            return "Permission denied. Only airplanes are allowed to land.";
        }
    }
}
