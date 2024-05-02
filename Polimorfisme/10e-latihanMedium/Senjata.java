/* Nama : Alfonso Clement Sutantio
 * NIM : 24060122130080
 * Tugas : 10e-latihanMedium
 */
public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int peluru;

    Senjata(String bunyi){
        this.bunyi = bunyi;
        this.menusuk = false;
        this.peluru = 0;
    }
    public String getBunyi(){
        return this.bunyi;
    }
    public int getPeluru(){
        return this.peluru;
    }
    public boolean isMenusuk(){
        return this.menusuk;
    }
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    public void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
}
