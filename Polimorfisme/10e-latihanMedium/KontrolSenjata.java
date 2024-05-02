/* Nama : Alfonso Clement Sutantio
 * NIM : 24060122130080
 * Tugas : 10e-latihanMedium
 */
public class KontrolSenjata {
    Senjata senjata;

    KontrolSenjata(Senjata s){
        this.senjata = s;
    }

    public boolean isAdaPeluru(){
        if (this.senjata.getPeluru()>0){
            return true;
        }else{
            return false;
        }
    }

    public void isiPeluru(int jumPeluru){
        System.out.println("Peluru berhasil ditambah: "+ jumPeluru);
        this.senjata.setPeluru(jumPeluru);
    }
    public void menembak(int jumlah){
        System.out.println("Siap menembak "+ jumlah +" kali");

        if(this.senjata.getPeluru()==0){
            System.out.println("Peluru Habis");
        }else{
            while (jumlah>0) {
                if(this.senjata.getPeluru()>0){
                    System.out.println(this.senjata.getBunyi());
                }else{
                    System.out.println("Gagal Tembak, Peluru Habis");
                }
    
                if(this.senjata.getPeluru()>0){
                    this.senjata.setPeluru(this.senjata.getPeluru()-1);
                }
                
                jumlah = jumlah-1;
            }
            System.out.println("Peluru sisa: "+ this.senjata.getPeluru());
        }
    }
    public String menusuk(){
        this.senjata.setMenusuk(true);
        return "Senjata digunakan untuk menusuk";
    }
    public void pasangBayonet(){
        System.out.println("Bayonet berhasil terpasang");
    }
}
