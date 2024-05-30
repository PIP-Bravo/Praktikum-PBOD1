/* Nama : Alfonso Clement Sutantio
 * NIM : 24060122130080
 * Praktikum : 13 - Lab D1
 * Tanggal buat : 27 Mei 2024
 */
import java.util.List;
import java.util.ArrayList;
public class ArmadaKendaraan<T extends Vehicle>{
    private List<T> armadakendaraan = new ArrayList<>();

    public void tambahArmada(List<? extends T> armada){
        for(int i = 0; i<=(armada.size()-1); i+=1) {
    		armadakendaraan.add(armada.get(i));
		}
    }

    public List<T> getAllArmada(){
        return armadakendaraan;
    }

}
