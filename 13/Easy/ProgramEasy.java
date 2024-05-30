/* Nama : Alfonso Clement Sutantio
 * NIM : 24060122130080
 * Praktikum : 13 - Lab D1
 * Tanggal buat : 27 Mei 2024
 */
import java.util.List;
import java.util.ArrayList;
public class ProgramEasy {
    public static void main(String[] args) {
        List<IFlyer> koleksiBisaTerbang = new ArrayList<>();
        koleksiBisaTerbang = new ArrayList<>();

        IFlyer superman = new Superman("superman");
        IFlyer superboy = new Superman("superboy");
        IFlyer supergirl = new Superman("supergirl");
        IFlyer merpati = new Bird();
        IFlyer eagle = new Bird();

        koleksiBisaTerbang.add(merpati);
        koleksiBisaTerbang.add(eagle);
        koleksiBisaTerbang.add(superman);
        koleksiBisaTerbang.add(supergirl);
        koleksiBisaTerbang.add(superboy);

        for (IFlyer bisaTerbang : koleksiBisaTerbang){
            if (bisaTerbang instanceof Superman) {
                System.out.println("I'm " + ((Superman)bisaTerbang).getName());
                System.out.println("Bangsa :" + bisaTerbang.getClass().getSuperclass().getSimpleName());
                System.out.print("Makan: ");
                ((Animal)bisaTerbang).eat();
                System.out.println("");
            }else{
                System.out.println("I'm " + bisaTerbang.getClass().getSimpleName());
                System.out.println("Bisa terbang");
                System.out.print("Makan: ");
                ((Animal)bisaTerbang).eat();
                System.out.println("");
            }
        }
    }
}
