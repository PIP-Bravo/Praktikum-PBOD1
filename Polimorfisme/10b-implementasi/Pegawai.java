/* Nama : Alfonso Clement Sutantio
 * NIM : 24060122130080
 * Tugas : 10b-implementasi
 */
public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public String getNama(){
        return this.nama;
    }
    public int getGajiPokok(){
        return this.gajiPokok;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void tampilData(){
        System.out.println("Nama : "+this.getNama()+", "+ "Gaji pokok : "+this.getGajiPokok());
    }
}
