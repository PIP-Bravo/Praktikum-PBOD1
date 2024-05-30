/* Nama : Alfonso Clement Sutantio
 * NIM : 24060122130080
 * Praktikum : 13 - Lab D1
 * Tanggal buat : 27 Mei 2024
 */
public class Superman extends Kryptonian {
    private String name;

    Superman(String name){
        this.name = name;
    }

    public void takeOff(){
        System.out.println("The Superman is now taking off");
    }

    public void land(){
        System.out.println("The Superman is now landing");
    }

    public void fly(){
        System.out.println("The Superman is now flying");
    }

    public void leapBuilding(){
        System.out.println("The Superman is now leaping building");
    }

    public void stopBullet(){
        System.out.println("The Superman is now stopping bullet");
    }

    public void eat(){
        System.out.println("Nasi Goreng");
    }

    public String getName(){
        return this.name;
    }
}
