/* Nama : Alfonso Clement Sutantio
 * NIM : 24060122130080
 * Tugas : 10d-latihanEasy
 */
public class Senjata {
    private String bunyi;
    private int peluru;

    Senjata(String bunyi){
        this.bunyi = bunyi;
        this.peluru = 0;
    }
    public String getBunyi(){
        return this.bunyi;
    }
    public int getPeluru(){
        return this.peluru;
    }
    public void menembak(){
        if(this.getPeluru()==0){
            System.out.println("Peluru Habis");
        }else{
            System.out.println(this.getBunyi());   
            System.out.println("Sisa Peluru: "+ (this.getPeluru()-1));
        }
    }
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
}
