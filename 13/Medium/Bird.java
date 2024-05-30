/* Nama : Alfonso Clement Sutantio
 * NIM : 24060122130080
 * Praktikum : 13 - Lab D1
 * Tanggal buat : 27 Mei 2024
 */
public class Bird extends Animal implements IFlyer {
    
    public void eat(){
        System.out.println("The Bird is eating");
    }

    public void takeOff(){
        System.out.println("The Bird is now taking off");
    }

    public void land(){
        System.out.println("The Bird is now landing");
    }

    public void fly(){
        System.out.println("The Bird is now flying");
    }

    public void buildNest(){
        System.out.println("The Bird is building nest");
    }

    public void layEggs(){
        System.out.println("The Bird is laying eggs");
    }
}
