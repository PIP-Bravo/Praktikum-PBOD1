class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        return 2*Math.PI*jariJari;
    }
}

public class asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari>0): "jari-jari harus lebih dari nol";
        Lingkaran lingkaran = new Lingkaran(jariJari);
        double kelilingLingkaran = lingkaran.hitungKeliling();
        System.out.println("Keliling lingkaran = "+kelilingLingkaran);
    }
}
// Alfonso Clement - 24060122130080
// Di line 24 dinyatakan bahwa jari jari tidak boleh nol maka seharusnya yang di keluarkan adalah
// "jari jari tidak boleh sama dengan atau kurang dari nol" atau "jari-jari harus lebih dari nol", jika output negatif maka pesan yang dikeluarkan nantinya justru tidak sesuai
// jika hanya ditulis jari-jari tidak boleh nol