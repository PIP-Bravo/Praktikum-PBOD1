import java.util.Scanner;
public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jari jari lingkaran: ");
        double r = scan.nextDouble();
        Lingkaran l = new Lingkaran(r);
        System.out.println("Luas lingkaran dengan "+"jejari "+r+ " satuan adalah "
        +l.hitungLuas());
        scan.close();
    }
}
