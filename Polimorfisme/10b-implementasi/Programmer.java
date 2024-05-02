/* Nama : Alfonso Clement Sutantio
 * NIM : 24060122130080
 * Tugas : 10b-implementasi
 */
public class Programmer extends Pegawai {
    private int bonus = 450000;

    Programmer(String nama){
        this.setNama(nama);
    }
    public void tampilData(){
        System.out.println("Nama : "+this.getNama()+", "+ "Gaji pokok : "+this.getGajiPokok());
        System.out.println("Bonus : "+this.bonus);
    }
}
