public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        else{
            System.out.println("Angka "+angka+" bukan angka sial");
        }
    }

    public static void main(String[] args){
        AngkaSial angkasial = new AngkaSial();
        try{
            angkasial.cobaAngka(10);
            angkasial.cobaAngka(13);
            angkasial.cobaAngka(12);
        }
        catch(AngkaSialException sial){
            System.out.println(sial.getMessage());
            System.out.println("hati-hati memasukkan angka");
        }
    }
}
// Alfonso Clement - 24060122130080
// Ketika eksepsi terjadi maka baris 12 hanya akan dieksekusi satu kali ketika dalam
// try dibuat input angka 10, namun untuk ketika angka adalah 13 maka yang akan dieksekusi
// adalah kode yang ada dalam if, setelah itu akan dilemparkan eksepsi yang nantinya ditangkap
// dan mengeluarkan pesan yang ada dalam AngkaSialException 

// Baris 21 jelas dieksekusi karena dengan mencoba menginputkan angka 13 yang ada
// pada baris 19, maka eksepsi akan terjadi dan ditangkap oleh catch yang ada dalam code di baris 21 dimana
// nanti akan mengambil message yang ada dalam AngkaSialException dan di tampilkan kemudian memprint "hati-hati memasukkan angka"