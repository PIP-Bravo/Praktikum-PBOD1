/* Nama : Alfonso Clement Sutantio
 * NIM : 24060122130080
 * Tugas : 10b-implementasi
 */
public class Manajer extends Pegawai{
    private int tunjangan = 700000;

    Manajer(String nama){
        this.setNama(nama);
    }
    public void tampilData(){
        System.out.println("Nama : "+this.getNama()+", "+ "Gaji pokok : "+this.getGajiPokok());
        System.out.println("Tunjangan : "+this.tunjangan);
    }
}
